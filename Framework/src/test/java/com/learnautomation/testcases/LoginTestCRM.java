package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.learnautomation.utilities.Browser_Factory;


public class LoginTestCRM {

	WebDriver driver;
	
	@Test
		public void loginapp()
	{
		
		Browser_Factory.startApplication(driver, "Chrome", "https://rhishi-trials710.orangehrmlive.com/auth/login");
	// Chrome and Firefox is working but Edge driver failed
		System.out.println(driver.getTitle());
	}
}