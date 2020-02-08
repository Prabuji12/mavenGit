package com.dxc.maven.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

public class Flipkart_SellonFlipkart {
	
	 WebDriver driver;
	 EventFiringWebDriver event_driver;
	 EventFiringMouse mouse_driver;
	 Actions action;
	 JavascriptExecutor js;
	 

	public Flipkart_SellonFlipkart(WebDriver driver,EventFiringWebDriver event_driver,EventFiringMouse mouse_driver,Actions action,JavascriptExecutor js) {
		 this.driver = driver; 
		 this.event_driver = event_driver;
		 this.mouse_driver = mouse_driver; 
		 this.action = action; 
		 this.js = js;
		 PageFactory.initElements(this.driver, Flipkart_SellonFlipkart.class);
		
	}

	@FindBy(css = "div.copyright-footer")
	WebElement get_Label_Copyright;
	public WebElement get_Label_Copyright() {
		return get_Label_Copyright;
	}

	@FindBy(xpath = "//h3[text()='Step 4']")
	WebElement get_Label_Step4;
	public WebElement get_Label_Step4() {
		return get_Label_Step4;
	}

	@FindBy(xpath = "//div[@class='item-wrapper']/following::input[@id='useremail']")
	WebElement set_InputText_EmailID;
	public WebElement set_InputText_EmailID() {
		return set_InputText_EmailID;
	}

	@FindBy(xpath = "//div[@class='item-wrapper']/following::input[@id='userphone']")
	WebElement set_InputText_PhoneNumber;
	public WebElement set_InputText_PhoneNumber() {
		return set_InputText_PhoneNumber;
	}

	@FindBy(linkText = "GET STARTED")
	WebElement get_Link_GetStarted;
	public WebElement get_Link_GetStarted() {
		return get_Link_GetStarted;
	}

	@FindBy(css = "div.fk-ui-goTop")
	WebElement get_Link_Top;
	public WebElement get_Link_Top() {
		return get_Link_Top;
	}

	@FindBy(xpath = "//a[text()='flipkart.com']")
	WebElement get_MenuLink_FlipkartDotCom;
	public WebElement get_MenuLink_FlipkartDotCom() {
		return get_MenuLink_FlipkartDotCom;
	}

	/*
	 * public void moveBottomPage(){
	 * //js.executeScript("scrollBy(0,5500);");
	 * //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	 * //js.executeScript("window.scrollBy(0,5500)"); WebElement bottomPage =
	 * driver.findElement(By.cssSelector("div.copyright-footer"));
	 * js.executeScript("arguments[0].scrollIntoView(true);",bottomPage);
	 * }
	 * public void moveStep4(){
	 * WebElement step4 = driver.findElement(By.
	 * xpath("//div[@class='business-wrapper clearfix']/div[4]")); //CssSelector
	 * //WebElement step4 =
	 * driver.findElement(By.cssSelector("div.business-content.sell-content>h3")
	 * ); js.executeScript("arguments[0].scrollIntoView(true);",step4);
	 * //Actions action = new Actions(driver);
	 * //action.moveToElement(step4);(This will not work since step4 is not
	 * visible in present view) //js.executeScript("scrollBy(0,-1000);");
	 * }
	 * public void startSellingInput(){
	 * WebElement eMail = driver.findElement(By.xpath(
	 * "//div[@class='item-wrapper']/following::input[@id='useremail']"));
	 * js.executeScript("arguments[0].value='sp12prabu@hotmail.com';", eMail);
	 * WebElement userphone = driver.findElement(By.xpath(
	 * "//div[@class='item-wrapper']/following::input[@id='userphone']"));
	 * js.executeScript("arguments[0].value='9843346042';", userphone);
	 * }
	 * public void clear_startSellingInput(){
	 * driver.findElement(By.xpath(
	 * "//div[@class='item-wrapper']/following::input[@id='useremail']")).clear(
	 * ); driver.findElement(By.xpath(
	 * "//div[@class='item-wrapper']/following::input[@id='userphone']")).clear(
	 * );
	 * }
	 * public void moveToGetStarted_Link(){
	 * js.executeScript("window.scrollBy(0,-500);",""); //WebElement getStarted
	 * = driver.findElement(By.linkText("GET STARTED"));
	 * //js.executeScript("arguments[0].scrollIntoView(true);","GET STARTED");
	 * }
	 * public void clickGetStartedLink(){
	 * WebElement getStarted =
	 * driver.findElement(By.xpath("//span[@class='owl-number-5']")); //String
	 * name = getStarted.getAttribute("content"); //System.out.println(name);
	 * //js.executeScript("arguments[0].scrollIntoView(true);",getStarted);
	 * getStarted.click();
	 * }
	 * public void checkandclick_TopLink(){
	 * if(driver.getPageSource().contains("Top")){ System.out.println("True");
	 * driver.findElement(By.cssSelector("div.fk-ui-goTop")).click(); } else
	 * System.out.println("False");
	 * }
	 * public void flipkartdotcomMenuLink(){
	 * driver.findElement(By.xpath("//a[text()='flipkart.com']")).click();
	 * }
	 */

}
