package com.base;

import org.junit.Before;
import org.junit.BeforeClass;

import com.locations.values.Locators;


	public class OpenCloseFrameWorkRC extends AbstractClassRC {
		Locators lc = new Locators() ;
		
		
	@BeforeClass
	public static void openFirefoxBrowser(){
		openBrowser("localhost",4444,"*firefox","http://www.yahoo.com");
		
	}	
	@Before	
public void openWeb(){
		openWebPage();
		click(lc.mailButtonXpath);
		
	}
		
	}
	
	


