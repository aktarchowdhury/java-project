package com.mail.yahoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractClass {
	public static WebDriver driver;
	public void clickByXP(String xp){
		driver.findElement(By.xpath(xp)).click();
	}
	public void clickByID(String id){
	driver.findElement(By.id(id)).click();	
	}
	public void type(String xp,String Value){
		driver.findElement(By.xpath(xp)).sendKeys(Value);
	}
	public static void openBrowser(){
		driver = new FirefoxDriver();
	}
	public static void openWebPage(String url){
		driver.get(url);
	}
	}
	
	


