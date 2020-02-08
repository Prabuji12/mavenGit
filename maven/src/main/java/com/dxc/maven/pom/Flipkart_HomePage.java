package com.dxc.maven.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

@SuppressWarnings("deprecation")
public class Flipkart_HomePage {
	WebDriver driver;
	 EventFiringWebDriver event_driver;
	 EventFiringMouse mouse_driver;
	 Locatable loc;
	 Coordinates co;
	 Actions action;
	 JavascriptExecutor js;
	 
	public Flipkart_HomePage(WebDriver driver,EventFiringWebDriver event_driver,EventFiringMouse mouse_driver,Actions action,JavascriptExecutor js) {
		PageFactory.initElements(driver, Flipkart_HomePage.class);
		this.driver = driver; 
		this.event_driver = event_driver;
		this.mouse_driver = mouse_driver; 
		this.action = action; 
		this.js = js;
		
	}
	
	@FindBy(xpath= "//div[@class='_2cyQi_']")
	private WebElement get_UsernameMenu_Username;
	public void get_UsernameMenu_Username(){
		loc=(Locatable) get_UsernameMenu_Username;
		Coordinates co = loc.getCoordinates();
		mouse_driver.mouseMove(co);
	}
	
	@FindBy(xpath = "//div[@class='_2f5Jjv']/a")
	private WebElement button_LoginSignup;
	public void click_Button_LoginSignup() {
		button_LoginSignup.click();
	}

	@FindBy(xpath = "//div[@class='_39M2dM']/input[@class='_2zrpKA']")
	private WebElement inputText_EmailOrNumber;
	public void set_InputText_EmailOrNumber(String emailOrNumber) {
		inputText_EmailOrNumber.sendKeys(emailOrNumber);
	}
	public void clear_InputText_EmailOrNumber() {
		inputText_EmailOrNumber.clear();
	}

	@FindBy(xpath = "//div[@class='Km0IJL col col-3-5']//following::input[@class='_2zrpKA _3v41xv']")
	private WebElement inputText_Password;
	public void set_InputText_Password(String password) {
		inputText_Password.sendKeys(password);
	}
	public void clear_InputText_Password() {
		inputText_Password.clear();
	}

	@FindBy(xpath = "//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement button_Login;
	public void click_Button_Login() {
		button_Login.click();
	}

	@FindBy(xpath = "//button[@class='_2AkmmA _29YdH8']")
	private WebElement closeIcon_LoginPopUp;
	public void click_CloseIcon_LoginPopUp() {
		closeIcon_LoginPopUp.click();
	}

	@FindBy(xpath = "//span[text()='More']")
	private WebElement get_Menu_More;
	
	public void hover_Menu_More() {
		loc=(Locatable) get_Menu_More;
		co = (Coordinates) loc.getCoordinates();
		mouse_driver.mouseMove(co);
	}
	

	@FindBy(xpath = "//div[text()='Sell on Flipkart']")
	private WebElement get_Link_SellonFlipkart;
	public WebElement get_Link_SellonFlipkart() {
		return get_Link_SellonFlipkart;
	}

	@FindBy(xpath = "//div[text()='Advertise']")
	private WebElement get_Link_Advertise;
	public WebElement get_Link_Advertise() {
		return get_Link_Advertise;
	}

	@FindBy(xpath = "//input[@name='q']")
	private WebElement set_InputText_Search;
	public WebElement set_InputText_Search() {
		return set_InputText_Search;
	}

	@FindBy(xpath = "//div[@class='xOS6RD']")
	private WebElement get_SuggestionList_PhonesInMobiles;
	public WebElement get_SuggestionList_PhonesInMobiles() {
		return get_SuggestionList_PhonesInMobiles;
	}
	
	@FindBy(xpath="//div[@class='_2cyQi_']")
	private WebElement get_Menu_Username;
	public String get_Menu_Username(){
		return get_Menu_Username.getText();
	}
	public void hover_Menu_Username() {
		loc=(Locatable) get_Menu_Username;
		co = (Coordinates) loc.getCoordinates();
		mouse_driver.mouseMove(co);
	}
	
	@FindBy(xpath="//div[@class='_2k0gmP' and text()='Logout']")
	private WebElement get_SubMenuLink_Logout;
	public void click_SubMenuLink_Logout(){
		get_SubMenuLink_Logout.click();;
	}	

	/*
	 * public void flipkartLogin(){
	 * WebElement login =
	 * driver.findElement(By.xpath("//div[@class='_2f5Jjv']/a")); login.click();
	 * WebElement email = driver.findElement(By.xpath(
	 * "//div[@class='_39M2dM']/input[@class='_2zrpKA']"));
	 * email.sendKeys("sp12prabu@hotmail.com");
	 * //js.executeScript("arguments[0].value='sp12prabu@gmail.com';", email);
	 * WebElement password = driver.findElement(By.
	 * xpath("//div[@class='Km0IJL col col-3-5']//following::input[@class='_2zrpKA _3v41xv']"
	 * )); password.sendKeys("buji12dharu");
	 * WebElement loginButton =
	 * driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	 * ); loginButton.click();
	 * }
	 * public void hover_More_menu(){
	 * WebElement moreLink =
	 * event_driver.findElement(By.xpath("//span[text()='More']")); Locatable
	 * moreLinkLocatable = (Locatable) moreLink; Coordinates co =
	 * moreLinkLocatable.getCoordinates(); mouse_driver.mouseMove(co);
	 * }
	 * public void navigateToSellonFlipkart(){
	 * WebElement sellLink =
	 * driver.findElement(By.xpath("//div[text()='Sell on Flipkart']"));
	 * sellLink.click();
	 * }
	 * public void navigateToAdvertise(){
	 * WebElement sellLink =
	 * driver.findElement(By.xpath("//div[text()='Advertise']"));
	 * sellLink.click();
	 * }
	 * public void searchBox(String value){
	 * driver.findElement(By.xpath("//input[@name='q']")).sendKeys(value);
	 * }
	 * public void selectPhonesinMobilesFromSugestion(){
	 * driver.findElement(By.xpath("//div[@class='xOS6RD']")).click();
	 * }
	 */

}
