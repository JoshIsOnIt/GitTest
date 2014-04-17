package com.josh;

public class HelloWorld {

	String var1;
	String var2;
	String var3;
	
	public HelloWorld() {
		var1 = "First";
		var2 = "Second";
		var3 = "Third";
	}

	/**
	 * Simple toString
	 */
	@Override
	public String toString() {
		return var1 + var2 + var3;
	}
}