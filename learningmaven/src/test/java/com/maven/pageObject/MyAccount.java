package com.maven.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class MyAccount {
	
	// Locators 
	String myorderlink = "//a[text()=\"My Orders\"]";

	
	WebDriver testdriver;
	PageUtil util;
	
	public MyAccount(WebDriver driver) {
		testdriver = driver;
		util = new PageUtil(testdriver);
	}
	
	
	public boolean validateMyOrderLink(String linkName) {
		return util.isvalidate(linkName,myorderlink);
	}
	
	
	

}


