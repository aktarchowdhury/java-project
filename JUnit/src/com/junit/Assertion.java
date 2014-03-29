package com.junit;

import junit.framework.Assert;

public class Assertion {

	public static void main(String[] args) {
	String exp ="Dhaka";
	String act="Dhaka";
	Assert.assertEquals("Doesn't Match",  exp, act);
	System.out.println("Test Passed");

	}

}
