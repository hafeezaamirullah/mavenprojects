package com.Applayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class multicartapp {

	// == Locators Variables 
	String LoginLink = "//*[@id=\"dLabellogin\"]";
	String userIdTextBox = "//*[@id=\"username\"]";		
	String passwordTextBox = "//*[@id=\"password\"]";			
	String loginButton = "//*[@id=\"jqLogin\"]";
	String profileNameLabel = "//*[@id=\"dLabel\"]/span";

	String myAccountLInk = "//a[text()=' My Account    				']";
	String logOutLink = "//a[text()=' Logout    				']";


	String myorderlink = "//a[text()=\"My Orders\"]";
	
	String changePasswordlink = "//a[text()=\"Change Password\"]";
	String oldPasswordTextBox = "//*[@name=\"txtOldPassword\"]";
	String newPasswordwordTextBox = "//*[@name=\"txtPassword\"]";
	String confirmNewPasswordTextBox = "//*[@name=\"txtConfirmPassword\"]";
	String changeNewPasswordButton = "//*[@name=\"btnChangePassword\"]";

	
	
	
	// == Registration 
	String signupButton = "//*[@id=\"jqSignup\"]";
	String emailTextBox = "//*[@id=\"txtEmail\"]";
	String usernameTextBox = "//*[@id=\"txtUserName\"]";
	String registrationPasswordTextBox = "//*[@id=\"txtPassword\"]";
	String confirmPasswordTextBox = "//*[@id=\"txtCnfPassword\"]";
	String firstNameTextBox = "//*[@id=\"txtFirstName\"]";
	String lastnameTextBox = "//*[@id=\"txtLastName\"]";
	
	String addressTextBox = "//input[@placeholder=\"Address *\"]";
	String notificationChektBox = "//input[@name='check_news']";
	
	String createAccountButton = "//*[@id=\"btnRegister\"]";

	
	
	
	
	WebDriver testdriver;

	
	public multicartapp(WebDriver driver) {
		testdriver = driver;
	}
	

	public void loginWith(String username, String password) {
		System.out.println("Login With " + username + " password");
		// Click Login Link 
		testdriver.findElement(By.xpath(LoginLink)).click();
		
		// Enter ID & Password 
		testdriver.findElement(By.xpath(userIdTextBox)).sendKeys(username);
		testdriver.findElement(By.xpath(passwordTextBox)).sendKeys(password);

		// Click the Login Button 
		testdriver.findElement(By.xpath(loginButton)).click();
		ApplicationWaitfor(3000);
		
	}

	public void logOut() {
		// Driver click on the Profile Link 
		testdriver.findElement(By.xpath(profileNameLabel)).click();
		
		// CLick the Logout Link 
		testdriver.findElement(By.xpath(logOutLink)).click();

		
	}
	
	
	public boolean validateProfileNameas(String profileName) {
		System.out.println("Validating Profile Name as " + profileName);
		return isvalidate(profileName, profileNameLabel);
	}

	public void startRegistraion() {
		// Click Login Link 
		testdriver.findElement(By.xpath(LoginLink)).click();
		// Click Signup Button
		testdriver.findElement(By.xpath(signupButton)).click();

	}
	
	public void completeRegistrationFormWith(String email, String username, String fname, String Lname) {
		//Complete Registraion Form 
		testdriver.findElement(By.xpath(emailTextBox)).sendKeys(email);
		testdriver.findElement(By.xpath(usernameTextBox)).sendKeys(username);
		testdriver.findElement(By.xpath(registrationPasswordTextBox)).sendKeys("Dhaka_1986");
		testdriver.findElement(By.xpath(confirmPasswordTextBox)).sendKeys("Dhaka_1986");
		testdriver.findElement(By.xpath(firstNameTextBox)).sendKeys(fname);
		testdriver.findElement(By.xpath(lastnameTextBox)).sendKeys(Lname);
		testdriver.findElement(By.xpath(addressTextBox)).sendKeys("123 5th Ave");
		testdriver.findElement(By.xpath(notificationChektBox)).click();

		testdriver.findElement(By.xpath(createAccountButton)).click();
		ApplicationWaitfor(3000);
	}
	
	
	public void completeRegistrationFormWith(String email, String username, String fname, String Lname, String password) {
		//Complete Registraion Form 
		testdriver.findElement(By.xpath(emailTextBox)).sendKeys(email);
		testdriver.findElement(By.xpath(usernameTextBox)).sendKeys(username);
		testdriver.findElement(By.xpath(registrationPasswordTextBox)).sendKeys(password);
		testdriver.findElement(By.xpath(confirmPasswordTextBox)).sendKeys(password);
		testdriver.findElement(By.xpath(firstNameTextBox)).sendKeys(fname);
		testdriver.findElement(By.xpath(lastnameTextBox)).sendKeys(Lname);
		testdriver.findElement(By.xpath(addressTextBox)).sendKeys("123 5th Ave");
		testdriver.findElement(By.xpath(notificationChektBox)).click();

		testdriver.findElement(By.xpath(createAccountButton)).click();
		ApplicationWaitfor(3000);
	}
	
	
	public void gotoMyAccount() {
		
		// Driver click on the Profile Link 
		testdriver.findElement(By.xpath(profileNameLabel)).click();

		// Driver Click on My Account Link 
		testdriver.findElement(By.xpath(myAccountLInk)).click();

	}
	
	public boolean validateMyOrderLink(String linkName) {
		return isvalidate(linkName,myorderlink);
	}
	
	public void changePasswordWith(String oldPassword, String newPassword) {
		
		testdriver.findElement(By.xpath(changePasswordlink)).click();

		testdriver.findElement(By.xpath(oldPasswordTextBox)).sendKeys(oldPassword);
		testdriver.findElement(By.xpath(newPasswordwordTextBox)).sendKeys(newPassword);
		testdriver.findElement(By.xpath(confirmNewPasswordTextBox)).sendKeys(newPassword);
		testdriver.findElement(By.xpath(changeNewPasswordButton)).click();
	}
	
	
	
	/** Validation Module exp vs actual   */
	public boolean isvalidate(String exptext, String locatorOfActualElement) {
		// Validation Check the User is Mr  
		String expectation = exptext;
		String actual = testdriver.findElement(By.xpath(locatorOfActualElement)).getText();
		if(expectation.equalsIgnoreCase(actual)){
			System.out.println("Test Passed ");
			return true;
		}
		else{
			System.out.println("Test Failed ");
			return false;
		}

	}
	public void ApplicationWaitfor(int milisecond) {
		try {
			Thread.sleep(milisecond);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void ApplicationClose() {
		testdriver.close();
	}


	


	


	


	
	

	
	
}

