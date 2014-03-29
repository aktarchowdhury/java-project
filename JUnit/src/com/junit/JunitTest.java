package com.junit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {
	@BeforeClass
	public static void openBrowser(){
		System.out.println("Open firefox browser");
		System.out.println("Open yahoo homepage");
		
		
	}
	@Before
	public void clickOnMail (){
		System.out.println("Click on Mail button and open yahoo login page");
	}
@Test
public void TestOne(){
	System.out.println("Insert UserName");
	System.out.println("Insert Password");	
	System.out.println("Click SignInButton and open email page");

}


		public void TestTwo(){
			System.out.println("Insert UserName2");
			System.out.println("Insert Password2");
			System.out.println("Click SignInButton and open email page");
		}
	@After
	public void logout(){
		System.out.println("Click on logout button");
		
	}
	@AfterClass
	public static void closeBrowser(){
		System.out.println("closeBrowser");
		
	}
}
