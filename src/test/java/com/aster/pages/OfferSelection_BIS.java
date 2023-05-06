package com.aster.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OfferSelection_BIS {

	@FindBy(xpath = "//a[contains(text(),'Offer Selection')]")
	WebElement OfferSelectionLink;
	
	@FindBy(xpath = "//label[text()='BIS']//preceding::input[@id='inlineCheckbox2']")
	WebElement BISCheckbox;
	
	@FindBy(xpath = "//label[text()='EAF']//preceding::input[@id='inlineCheckbox1']")
	WebElement EAFCheckbox;
	
	@FindBy(xpath = "//label[text()='BIS Assessment ']//preceding::input[@value='option5']")
	WebElement BISAssesmentCheckbox;

	@FindBy(xpath = "//label[contains(text(),'Lead Sector SME')]//following::input[@type='text'][1]")
	WebElement LeadSectorSME;
	
	@FindBy(xpath = "//label[contains(text(),'Solution Approved By')]//following::input[@type='text'][1]")
	WebElement SolutionApprovedBy;
	
	@FindBy(xpath = "//label[contains(text(),'Other Sector SME')]//following::div[@class='multiselect-dropdown']")
	WebElement OtherSectorSME;
	
	@FindBy(xpath = "//label[contains(text(),'Business Process')]//following::button[@id='dropdownManual']")
	WebElement BusinessProcess;
	
	@FindBy(xpath = "//input[@formcontrolname='Bisassessmentcost']")
	WebElement BISAssessmentCost;
	
	@FindBy(xpath = "//input[@formcontrolname='Bccdashboardcost']")
	WebElement BCCDashboardCost;
	
	@FindBy(xpath = "//input[@formcontrolname='Bisautomationenablercost']")
	WebElement BISAutomationEnablerCost;
	
	@FindBy(xpath = "//input[@formcontrolname='Bccprocessminingcost']")
	WebElement BCCProcessMiningCost;
	
	@FindBy(xpath = "//select[@formcontrolname='Bisresponsestatus']")
	WebElement BISResponseStatus;
	
	public WebDriver driver;
	
	public void ClickOfferSelectionLink()
	{
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].click()", OfferSelectionLink);
	}
	
	public void ClickBISCheckbox()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", BISCheckbox);
	}
	
	public void ClickEAFCheckbox()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", EAFCheckbox);
	}
	
	public void clickBISAssesmentCheckbox()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", BISAssesmentCheckbox);
	}
	
	public OfferSelection_BIS(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }

}
