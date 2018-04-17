package nl.unimaas.ids.xanalyzer.model;

import java.util.HashMap;
import java.util.Map;

public class Node extends BaseNode {
	
	public Map<String, Node> childs = new HashMap<>();
	public Map<String, Attribute> attributes = new HashMap<>();
	
	public Node registerChild(String name, String value) {
		Node child = null;
		if(childs.containsKey(name)) {
			child = childs.get(name);
			child.count++;
			child.setValue(value);
			
		} else {
			child = new Node();
			child.parent = this;
			child.name = name;
			child.setValue(value);
			childs.put(name, child);
		}
		return child;
	}
	
	
	
	public Attribute registerAttribute(String name, String value) {
		Attribute attribute = null;
		if(attributes.containsKey(name)) {
			attribute = attributes.get(name);
			attribute.count++;
			attribute.setValue(value);
		} else {
			attribute = new Attribute();
			attribute.parent = this;
			attribute.name = name;
			attribute.setValue(value);
			attributes.put(name, attribute);
		}
		return attribute;
	}
	
	@Override
	String getType() {
		return Node.class.getSimpleName();
	}

}
