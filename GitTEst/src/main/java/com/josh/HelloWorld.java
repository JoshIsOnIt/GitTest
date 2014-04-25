package com.josh;

/**
 * What class hello world is
 * @author jblinick
 *
 */
public class HelloWorld {

	String var1;
	String var2;
	String var3;
	String varForFeatureX;
	
	public HelloWorld() {
		var1 = "First";
		var2 = "Second";
		var3 = "Third";
		varForFeatureX = "New AWESOME Feature!!!";
	}

	/**
	 * Simple toString
	 */
	@Override
	public String toString() {
		return var1 + var2 + var3 + varForFeatureX;
	}
	
	public String getVarForFeatureX() {
		return varForFeatureX;
	}

	public void setVarForFeatureX(String varForFeatureX) {
		this.varForFeatureX = varForFeatureX;
	}
}
