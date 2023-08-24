package com.learnautomation.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_Factory {


public static WebDriver startApplication(WebDriver driver,String browserName,String appURL)
{

if (browserName.equals("Chrome"))

{
System. setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe") ;

driver=new ChromeDriver();
}
else if(browserName.equals("Firefox"))

{
System. setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
driver=new FirefoxDriver();
}

else if(browserName.equals("Microsoft Edge"))

{
System. setProperty("webdriver.msedgedriver.driver","./Drivers/msedgedriver.exe");
driver=new InternetExplorerDriver();
}

else
{
System.out.println("We do not support this browser");
}

driver.manage().window().maximize();// To Maximize window
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get(appURL);

return driver;
}

public static void quitBrowser(WebDriver driver)
{
driver.quit();	
}
}
