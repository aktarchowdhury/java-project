package com.test;

import org.junit.Test;

import com.base.OpenCloseFrameWorkRC;
import com.locations.values.Locators;
import com.locations.values.Values;

public class TestWithRC extends OpenCloseFrameWorkRC {
	
@Test
public void testYahoomail(){
	Locators lc = new Locators();
	Values vl = new Values();
	
	type(lc.userNameXpath, vl.username);
	type(lc.passwordXpath,vl.password);
	click(lc.signinXpath);
	
	
	
	
	
	System.out.println("Test Passed");
}

}
