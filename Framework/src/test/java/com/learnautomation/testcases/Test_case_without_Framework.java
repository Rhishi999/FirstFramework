package com.learnautomation.testcases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_case_without_Framework {
	
	@Test
	public void test1() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Web driver\\chromedriver-win64\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
	       driver.get("https://rhishi-trials710.orangehrmlive.com/auth/login");
	       //driver.get("https://demo.guru99.com/test/radio.html");//To call Website 
	       driver.manage().window().maximize();// To Maximize window
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       //Below implicitly is not used or deprecated and cannot be used after selenium 4 
	       //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	       driver.findElement(By.name("txtPassword")).sendKeys("20RYEwxlD@");
	     //Click Submit Button
		//driver.findElement(By.name("submit")).click();
		//Click Submit Button
	       driver.findElement(By.xpath("//button[@type='submit']")).click();  
	       //Xpath location on Login button: <button type="submit">
	}
	}
