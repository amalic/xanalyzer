package nl.unimaas.ids.xanalyzer.model;

import java.text.DecimalFormat;

public abstract class BaseNode {
	
	private static final DecimalFormat percentFormat = new DecimalFormat("#.#%");
	
	public Node parent = null;
	public String name;
	public long count = 1;
	public long valueCount = 0;
	public long minLength = -1;
	public long maxLength = -1;
	
	public void setValue(String value) {
		if(value!=null) {
			long length = value.trim().length();
			if(length > 0) {
				valueCount++;
				minLength = minLength == -1 || length < minLength ? length : minLength;
				maxLength = length > maxLength ? length : maxLength;
			}
		}
	}
	
	abstract String getType();
	
	@Override
	public String toString() {
		return getType() 
				+ "{name: \"" + name + "\""
				+ ", count: " + count + " " +  toPercent(count, parent!=null ? parent.count : 0) + ""
				+ ", valueCount: " + valueCount + " " +  toPercent(valueCount, count)
				+ ", minLength: " + (minLength != -1 ? minLength : "N/A")
				+ ", maxLength: " + (maxLength != -1 ? maxLength : "N/A") 
				+ (parent != null ? ", parent.name: \"" + parent.name + "\"" : "")
				+ "}"; 
	}
	
	String toPercent(long x, long total) {
		if(total!=0)
			return "(" + percentFormat.format( x / (double)total) + ")";
		else
			return "";
	}
	
}
