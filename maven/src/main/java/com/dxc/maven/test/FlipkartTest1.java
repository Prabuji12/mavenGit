package com.dxc.maven.test;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.dxc.maven.dataprovider.MyDataProvider;
import com.dxc.maven.webdriver.InitChromeDriver;

public class FlipkartTest1 extends InitChromeDriver {
	/*private String email, password;
	//boolean count=true;
	
	@Factory(dataProvider = "inputDataSimple1", dataProviderClass=MyDataProvider.class)
	public FlipkartTest1(String[] creds){
		email=creds[0];
		password=creds[1];
	}*/

	/*@Test
	// @Parameters({"email", "password"})
	public void loginFlipkart1() throws InterruptedException {
		System.out.println("Test2");
		Thread.sleep(3000);
		//String username = "Prabhu";
		//fklogin.click_CloseIcon_LoginPopUp();
		//fklogin.click_Button_LoginSignup();
		fklogin.clear_InputText_EmailOrNumber();
		fklogin.clear_InputText_Password();
		fklogin.set_InputText_EmailOrNumber(email);
		fklogin.set_InputText_Password(password);
		/*fklogin.click_Button_Login();
		Thread.sleep(5000);
		fklogin.hover_Menu_Username();
		Thread.sleep(5000);
		fklogin.click_SubMenuLink_Logout();
		if(fklogin.get_Menu_Username().equalsIgnoreCase(username)){
			System.out.println("Login Prabhu");
		}
		else
			System.out.println("Login Raji");
		//Assert.assertEquals(fklogin.get_Menu_Username(), username, "Failed: Logged account is not belongs to Prabhu");
		// fklogin.click_SubMenuLink_Logout();
		// count++;
		// }
	}*/
	
/*	@Test
	// @Parameters({"email", "password"})
	public void loginFlipkart1() throws InterruptedException {
		System.out.println("Test2");
		boolean count=true;
		//String username = "Prabhu";
		driver.get("https://www.flipkart.com/");
		if(count){fklogin.click_CloseIcon_LoginPopUp();count=false;
		driver.manage().window().maximize();}
		fklogin.click_Button_LoginSignup();
		fklogin.set_InputText_EmailOrNumber(email);
		fklogin.set_InputText_Password(password);
		fklogin.click_Button_Login();
		Thread.sleep(5000);
		fklogin.hover_Menu_Username();
		Thread.sleep(5000);
		fklogin.click_SubMenuLink_Logout();
		if(fklogin.get_Menu_Username()=="Prabhu"){
			System.out.println("Login Prabhu");
		}
		else
			System.out.println("Login Raji");
	}*/
	

	/*@AfterClass
	@Parameters({ "website" })
	public void logoutFlipkart(String website) {
		System.out.println("After Class");
		driver.get(website);
		fklogin.get_UsernameMenu_Username();
		js.executeScript("arguments[0].click();", fklogin.click_SubMenuLink_Logout());
		System.out.println("Completed");
	}*/

	/*  @Test 
	  public void registerToSellonFlipkart() throws InterruptedException{
	  System.out.println("Test2");
	  fklogin.get_Menu_More();
	  fklogin.get_Link_Advertise().click();
	  advertise.get_Button_ContactUs();
	  Thread.sleep(5000);
	  advertise.select_I_am_A("Seller");
	  advertise.set_InputText_Email("sp12prabu@hotmail.com");
	  advertise.set_InputText_Name("Santhana Prabhu");
	  advertise.set_InputText_PhoneNumber("9843346042");
	  advertise.set_InputText_Company("DXC Technology");
	 // advertise.select_OrganizationSize("Less than 100");
	  //advertise.select_AnnualMarketingBudget("More than 10 Crores");
	  advertise.set_Dropdown_10Lakhsto50Lakhs().click();
	  System.out.println("Sell");
	  }	 */

	/*
	 * Actions action = new Actions(driver);
	 * WebElement closeLogin =
	 * driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	 * closeLogin.click();Thread.sleep(3000);
	 * Flipkart_HomePage fklogin = new Flipkart_HomePage(driver);
	 * fklogin.flipkartLogin();Thread.sleep(3000);
	 * fklogin.hover_More_menu();Thread.sleep(3000);
	 * fklogin.navigateToSellonFlipkart(); Thread.sleep(3000);
	 * Flipkart_SellonFlipkart sellonflip = new Flipkart_SellonFlipkart(driver);
	 * sellonflip.moveBottomPage();Thread.sleep(3000);
	 * sellonflip.moveStep4();Thread.sleep(3000);
	 * sellonflip.clear_startSellingInput();Thread.sleep(3000);
	 * sellonflip.moveBottomPage();Thread.sleep(3000);
	 * sellonflip.moveToGetStarted_Link();Thread.sleep(3000);
	 * sellonflip.clickGetStartedLink();Thread.sleep(3000);
	 * sellonflip.startSellingInput();Thread.sleep(3000);
	 * sellonflip.moveBottomPage();Thread.sleep(3000);
	 * sellonflip.checkandclick_TopLink();Thread.sleep(3000);
	 * //sellonflip.flipkartdotcomMenuLink();Thread.sleep(3000);
	 * //ArrayList<String> windowHandles = new
	 * ArrayList<String>(driver.getWindowHandles());
	 * //driver.switchTo().windllow(windowHandles.get(1));
	 * //action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
	 * event_driver.get("https://www.flipkart.com");
	 * fklogin.hover_More_menu();Thread.sleep(3000);
	 * fklogin.navigateToAdvertise();Thread.sleep(3000);
	 * Advertise advertise = new Advertise(driver, event_driver, mouse_driver,
	 * action);
	 * advertise.clickContactUsButton();Thread.sleep(3000);
	 * advertise.selectSellerfromIamADropdown();Thread.sleep(3000);
	 * advertise.inputtoregisterSeller();Thread.sleep(3000);
	 * advertise.SubmitToRegister();Thread.sleep(3000);
	 * //advertise.flipkartdotcomFooterLink();Thread.sleep(3000);
	 * //ArrayList<String> windowHandles1 = new
	 * ArrayList<String>(driver.getWindowHandles());
	 * //driver.switchTo().window(windowHandles1.get(1));
	 * event_driver.get("https://www.flipkart.com");
	 * //action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
	 * fklogin.searchBox("Phone");Thread.sleep(3000);
	 * fklogin.selectPhonesinMobilesFromSugestion();Thread.sleep(3000);
     */

}
