package com.josh;

public class HelloWorld {

	String var1;
	String var2;
	
	public HelloWorld() {
		var1 = "First";
		var2 = "Second";
	}

	@Override
	public String toString() {
		return var1 + var2;
	}
}