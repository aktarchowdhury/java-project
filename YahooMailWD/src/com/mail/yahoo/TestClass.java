package com.mail.yahoo;

import org.eclipse.jdt.internal.compiler.lookup.TypeBinding;
import org.junit.Test;

public class TestClass extends OpenCloseFW {
	Locators lctr = new Locators();
	Values vls =new Values();
	@Test
	public void mailTest1(){
		typeByXP(lctr.usernameXP, vls.username);
		typeByXP(lctr.password, vls.password);
		
		
	}
public void mailTest(){
	System.out.println("Test passed");
	
}
}
