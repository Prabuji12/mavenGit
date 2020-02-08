package com.dxc.maven.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;
import org.openqa.selenium.support.ui.Select;

public class Flipkart_Advertise {
	WebDriver driver;
	EventFiringWebDriver event_driver;
	EventFiringMouse mouse_driver;
	Actions action;
	JavascriptExecutor js;

	public Flipkart_Advertise(WebDriver driver,EventFiringWebDriver event_driver,EventFiringMouse mouse_driver,Actions action,JavascriptExecutor js) {
		PageFactory.initElements(driver, this);
		this.driver = driver; 
		this.event_driver = event_driver;
		this.mouse_driver = mouse_driver;  
	    this.action = action; 
	    this.js = js;
		
	}

	@FindBy(xpath = "//button[@class='btn btn-md btn-color-a btn-center' and text()=' Contact Us ']")
	private WebElement get_Button_ContactUs;
	public void get_Button_ContactUs() {
		get_Button_ContactUs.click();
	}
	
	@FindBy(xpath = "//select[@class='medium gfield_select' and @tabindex='1']")
	private WebElement selectElement;
	//Select select =new Select(driver.findElement(By.xpath("//select[@class='medium gfield_select' and @tabindex='1']")));
	//WebElement test= driver.findElement(By.xpath("//select[@class='medium gfield_select' and @tabindex='1']"));
    //WebElement selectElement = driver.findElement(By.id("input_1_5"));
    
	//Select select_I_am_a = new Select(select_I_am_A);
   public void select_I_am_A(String select_I_am_A) {
	 Select select_I_am_a = new Select(selectElement);
	 select_I_am_a.selectByVisibleText(select_I_am_A);
		/*	if(select_I_am_A=="Seller"){
				select_I_am_a.selectByIndex(2);
			}
			if(select_I_am_A=="Marketer"){
				select_I_am_a.selectByIndex(0);
			}
			if(select_I_am_A=="Media Planner"){
				select_I_am_a.selectByIndex(1);
			}*/
	}
   
	@FindBy(xpath = "//input[@name='input_1']")
	private WebElement set_InputText_Name;
	public void set_InputText_Name(String name) {
		set_InputText_Name.sendKeys(name);
	}

	@FindBy(xpath = "//input[@name='input_2']")
	private WebElement set_InputText_Email;
	public void set_InputText_Email(String name) {
		set_InputText_Email.sendKeys(name);
	}

	@FindBy(xpath = "//input[@name='input_3']")
	private WebElement set_InputText_PhoneNumber;
	public void set_InputText_PhoneNumber(String phone) {
		set_InputText_PhoneNumber.sendKeys(phone);
	}

	@FindBy(xpath = "//input[@name='input_4']")
	private WebElement set_InputText_Company;
	public void set_InputText_Company(String company) {
		set_InputText_Company.sendKeys(company);
	}

	@FindBy(xpath = "//select[@class='medium gfield_select' and @tabindex='6']")
	private WebElement organizationSize;
	public void select_OrganizationSize(String organization_Size) {
		Select organizationsize = new Select(organizationSize) ;
		organizationsize.selectByVisibleText(organization_Size);
		/*if(organizationSize=="Less than 100"){
			organizationsize.selectByIndex(1);
		}
		if(organizationSize=="101- 500"){
			organizationsize.selectByIndex(2);
		}
		if(organizationSize=="51- 1000"){
			organizationsize.selectByIndex(3);
		}
		if(organizationSize=="Greater than 1000"){
			organizationsize.selectByIndex(4);
		}	*/	
	}

	@FindBy(xpath = "//select[@class='medium gfield_select' and @tabindex='7']/option[1]")
	private WebElement annualMarketingBudget;
	public void select_AnnualMarketingBudget(String annualMarketing_Budget) {
		Select annualbudget = new Select(annualMarketingBudget);
		annualbudget.selectByVisibleText(annualMarketing_Budget);
		/*if(annualMarketingBudget=="Less than 10 Lakhs"){
			annualbudget.selectByIndex(1);
		}
		if(annualMarketingBudget=="10 Lakhs - 50 Lakhs"){
			annualbudget.selectByIndex(2);
		}
		if(annualMarketingBudget=="50 Lakhs - 2 Crores"){
			annualbudget.selectByIndex(3);
		}
		if(annualMarketingBudget=="2 Crores - 10 Crores"){
			annualbudget.selectByIndex(4);
		}
		if(annualMarketingBudget=="More than 10 Crores"){
			annualbudget.selectByIndex(4);
		}*/
	}


	@FindBy(xpath = "//select[@class='medium gfield_select' and @tabindex='7']/option[2]")
	private WebElement set_Dropdown_LessThan10Lakhs;
	public WebElement set_Dropdown_LessThan10Lakhs() {
		return set_Dropdown_LessThan10Lakhs;
	}

	@FindBy(xpath = "//select[@class='medium gfield_select' and @tabindex='7']/option[3]")
	private WebElement set_Dropdown_10Lakhsto50Lakhs;
	public WebElement set_Dropdown_10Lakhsto50Lakhs() {
		return set_Dropdown_10Lakhsto50Lakhs;
	}

	@FindBy(xpath = "//select[@class='medium gfield_select' and @tabindex='7']/option[4]")
	private WebElement set_Dropdown_50Lakhsto2Crores;
	public WebElement set_Dropdown_50Lakhsto2Crores() {
		return set_Dropdown_50Lakhsto2Crores;
	}

	@FindBy(xpath = "//select[@class='medium gfield_select' and @tabindex='7']/option[5]")
	private WebElement set_Dropdown_2Croresto10Crores;
	public WebElement set_Dropdown_2Croresto10Crores() {
		return set_Dropdown_2Croresto10Crores;
	}

	@FindBy(xpath = "//select[@class='medium gfield_select' and @tabindex='7']/option[6]")
	private WebElement set_Dropdown_MoreThan10Crores;
	public WebElement set_Dropdown_MoreThan10Crores() {
		return set_Dropdown_MoreThan10Crores;
	}

	@FindBy(xpath = "//button/span[text()='Submit']")
	private WebElement get_Button_Submit;
	public WebElement get_Button_Submit() {
		return get_Button_Submit;
	}

	@FindBy(xpath = "//a[text()='Flipkart.com']")
	private WebElement get_Link_FlipkartDotCom;
	public WebElement get_Link_FlipkartDotCom() {
		return get_Link_FlipkartDotCom;
	}
	
	public void pageScroll_Down(){						
	}

	/*
	 * public void inputtoregisterSeller(){
	 * driver.findElement(By.xpath("//input[@name='input_1']")).
	 * sendKeys("Santhana Prabhu");
	 * driver.findElement(By.xpath("//input[@name='input_2']")).sendKeys(
	 * "sp12prabu@hotmail.com");
	 * driver.findElement(By.xpath("//input[@name='input_3']")).sendKeys(
	 * "9843346042");
	 * driver.findElement(By.xpath("//input[@name='input_4']")).sendKeys(
	 * "Google"); driver.findElement(By.
	 * xpath("//select[@class='medium gfield_select' and @tabindex='6']/option[5]"
	 * )).click(); driver.findElement(By.
	 * xpath("//select[@class='medium gfield_select' and @tabindex='7']/option[6]"
	 * )).click();
	 * }
	 * public void SubmitToRegister(){
	 * driver.findElement(By.xpath("//button/span[text()='Submit']")).click();
	 * }
	 * public void flipkartdotcomFooterLink(){
	 * driver.findElement(By.xpath("//a[text()='Flipkart.com']")).click();
	 * }
	 */

}
