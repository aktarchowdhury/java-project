package com.base;

import com.thoughtworks.selenium.DefaultSelenium;

public class AbstractClassRC {
	public static DefaultSelenium selenium;
	
	public static void openBrowser(String host, int port, String browser, String url){
		
		selenium = new DefaultSelenium(host, port, browser, url);
	}
		
	
	public void openWebPage(){
		selenium.start();
		selenium.open("/");
			
	}
	public static void click(String loc1){
		selenium.click(loc1);
		
	}
	public void type(String loc2, String val){
		selenium.type(loc2, val);
	
	
		
	}
	public void closeBrowser(){
		selenium.close();
		
	}

}
