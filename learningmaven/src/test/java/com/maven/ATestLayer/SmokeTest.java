package com.maven.ATestLayer;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Applayer.multicartapp;
import com.maven.AATestBase.TestBase;
import com.maven.pageObject.HomePage;
import com.maven.pageObject.RegistrationPage;

public class SmokeTest extends TestBase {	

	HomePage homepage; 

	@BeforeMethod
	
	
	
	public void initApplication() {
		initDriver();
		
		homepage = new HomePage(driver);

	}
	  @Test
    public void loginWithValidEmailAndPassword() { 
		  //Given I Go To
	 // Multicart websites
	  
	  
	  
	  
	  //And I click on the login link //And I enter valid email and password
	  
	  homepage.loginWith("user","pass"); //When I click on the login button
	  assertEquals( homepage.validateProfileNameas("James Williams"), true ,
	  "NAME not matched"); //Then I see my name as James Williams
	//  homepage.ApplicationClose();
	  
	  }
	  
      @Test
    public void logout() {
    	  homepage.loginWith("user", "pass");
    	  homepage.logOut();
    	  
    	
    	  assertEquals( homepage.validateProfileNameas("James Williams"), true ,
    	  "Profile name found Test FAiles"); 
      }
	
    public void validRegistration() {
    	String randomName; 
    	randomName = "X" + Math.random();
    	
    	homepage.startRegistration();
    	RegistrationPage registration = RegistrationPage(driver);
    	
    	
    }
      
      
      
} 

/*
 * @Test public void validRegistration() {
 * 
 * String randomName; randomName = "X" + Math.random();
 * 
 * 
 * //And I start registration process mytestapp.startRegistration();
 * 
 * mytestapp.completeRegistrationFormWith(randomName +"@gmail.com","Mr"+
 * randomName,"Mr"," "+ randomName);
 * 
 * //Then i see my profile as MrX
 * 
 * assertEquals( mytestapp.validateProfileNameas("Mr" + randomName), true ,
 * "Registration Failed"); }
 * 
 * @Test public void myAccountOrder() { //go to my account
 * mytestapp.loginWith("user","pass"); //go to my account
 * mytestapp.gotoMyAccount();
 * 
 * //validate my order link is there
 * 
 * 
 * // assertEquals( mytestapp.validateMyOrderLink("My Orders"), true ,
 * "Order link not Present");
 * 
 * try { Thread.sleep(3000); } catch (InterruptedException e) { // TODO
 * Auto-generated catch block e.printStackTrace(); } }
 * 
 * 
 * 
 * @Test public void changePassword() {
 * 
 * // Registraion Login String randomName; randomName = "X" + Math.random();
 * 
 * String email = randomName+"@gmail.com"; String uname = "Mr"+randomName;
 * String fname = "MR"; String oldPassword = "Dhaka_1986"; String newPassword =
 * "Dhaka_1988";
 * 
 * mytestapp.startRegistraion();
 * mytestapp.completeRegistrationFormWith(email,uname,fname, randomName,
 * oldPassword);
 * 
 * // Goto TO My Account mytestapp.gotoMyAccount();
 * 
 * // Change Password with mytestapp.changePasswordWith(oldPassword,
 * newPassword);
 * 
 * // Log Out mytestapp.logOut();
 * 
 * // Login With New Password mytestapp.loginWith(uname, newPassword);
 * 
 * // Validate the New User Profile Name
 * assertEquals(mytestapp.validateProfileNameas(fname +" "+ randomName ), true,
 * "Profile Name not Matched!!!");
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * @AfterMethod
 * 
 * public void tearDown() { mytestapp.ApplicationClose(); }
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 */