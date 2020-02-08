package com.dxc.maven.webdriver;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.dxc.maven.constants.SeleniumListenerClass;
import com.dxc.maven.pom.Flipkart_Advertise;
import com.dxc.maven.pom.Flipkart_HomePage;
import com.dxc.maven.pom.Flipkart_SellonFlipkart;

public class InitChromeDriver {

	public WebDriver driver;
	public JavascriptExecutor js;
	public EventFiringWebDriver event_driver ;
	public EventFiringMouse mouse_driver;
	public Actions action;
	public SeleniumListenerClass listen;
	public Flipkart_HomePage fklogin;
	public Flipkart_Advertise advertise;
	public Flipkart_SellonFlipkart sellonFlip;
	
	@BeforeSuite
	//@Parameters({ "website" })
	public void beforeClass() {
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver",
				"C:/Study/Software&Tools/Driver/Chrome Driver/chromedriver_win32/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/*js = (JavascriptExecutor) driver;
		event_driver = new EventFiringWebDriver(driver);
		listen = new SeleniumListenerClass();
		action = new Actions(driver);
		mouse_driver = new EventFiringMouse(driver, listen);
		fklogin = new Flipkart_HomePage(driver,event_driver,mouse_driver,action,js);*/
		driver.get("https://www.flipkart.com/");
		
	}
	
	
	/*@BeforeSuite
	@Parameters({ "website" })
	public void beforeSuite(String website) {
		System.out.println("Before Suite");
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/pp62/Downloads/Study/Chrome Driver/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		js = (JavascriptExecutor) driver;
		event_driver = new EventFiringWebDriver(driver);
		listen = new SeleniumListenerClass();
		action = new Actions(driver);
		mouse_driver = new EventFiringMouse(driver, listen);
		fklogin = new Flipkart_HomePage(driver,event_driver,mouse_driver,action,js);
		driver.get(website);
		
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	//@Parameters({ "website" })
	public void beforeClass(String website) {
		System.out.println("Before Class");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		js = (JavascriptExecutor) driver;
		event_driver = new EventFiringWebDriver(driver);
		listen = new SeleniumListenerClass();
		action = new Actions(driver);
		mouse_driver = new EventFiringMouse(driver, listen);
		fklogin = new Flipkart_HomePage(driver,event_driver,mouse_driver,action,js);
		//advertise = new Flipkart_Advertise(driver,event_driver,mouse_driver,action,js);
        //sellonFlip = new Flipkart_SellonFlipkart(driver,event_driver,mouse_driver,action,js);
		//fklogin.click_CloseIcon_LoginPopUp();
		
	}*/
	
/*	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@AfterTest
	public void afterTest() {
		//driver.close();
		System.out.println("After Test");
	}*/
	
    @AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
		driver.quit();
    }
    
}


