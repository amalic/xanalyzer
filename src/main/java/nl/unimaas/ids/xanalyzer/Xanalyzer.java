package nl.unimaas.ids.xanalyzer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

import nl.unimaas.ids.xanalyzer.model.Attribute;
import nl.unimaas.ids.xanalyzer.model.Node;
import nl.unimaas.ids.xanalyzer.model.RootNode;

public class Xanalyzer {
	
	public static void main(String[] args) throws Exception {
		
		Node xmlDocument = new RootNode();
		xmlDocument.name = "XML Document";
		
		InputStream is = new FileInputStream(args[0]);
		if(args[0].endsWith(".gz"))
			is = new GZIPInputStream(is);
		
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(is);
		
		String name = null;
		String value = null;
		
		while(xmlStreamReader.hasNext()) {
			int event = xmlStreamReader.next();
			if(event==XMLStreamConstants.START_ELEMENT) {
				name = xmlStreamReader.getLocalName();
				value = null;
				xmlDocument = xmlDocument.registerChild(name, value);
				for(int i=0; i<xmlStreamReader.getAttributeCount(); i++) {
					xmlDocument.registerAttribute(xmlStreamReader.getAttributeLocalName(i), xmlStreamReader.getAttributeValue(i));
				}
			} else if (event == XMLStreamConstants.CHARACTERS) {
				xmlDocument.setValue(xmlStreamReader.getText());
			} else if (event==XMLStreamConstants.END_ELEMENT) {
				xmlDocument = xmlDocument.parent;
			}
		}
		
		printStructure(xmlDocument, "" , "| ");
		
		xmlStreamReader.close();
	}

	private static void printStructure(Node node, String indent, String baseIndent) {
		System.out.println(indent + "# " + node.toString());
		for(Attribute attribute : node.attributes.values())
			System.out.println(indent + baseIndent + "* " + attribute.toString());
		for(Node child : node.childs.values())
			printStructure(child, indent + baseIndent, baseIndent);
	}

}
