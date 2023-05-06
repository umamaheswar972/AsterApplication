package com.aster.pages;
import com.aster.utilities.*;
import com.aventstack.extentreports.Status;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aster.testcases.BaseClass;

public class AddNewOppurtunityPage extends BaseClass
{
 public WebDriver driver;
 
 @FindBy(xpath = "//select[@formcontrolname='SBUId']")
 WebElement SBU;
 
 @FindBy(xpath = "//select[@formcontrolname='Buid']")
 WebElement BU;
 
 @FindBy(xpath = "//select[@formcontrolname='CountryId']")
 WebElement Country;
 
 @FindBy(xpath = "//select[@formcontrolname='Pursuittypeid']")
 WebElement PursuitType;
 
 @FindBy(xpath = "//select[@formcontrolname='Techgroupid']")
 WebElement Techgroup;
 
 @FindBy(xpath = "//select[@formcontrolname='Dealstatusid']")
 WebElement DealStatus;
 
 @FindBy(xpath = "//select[@formcontrolname='Tcvtypeid']")
 WebElement Tcvtype;
 
 @FindBy(xpath = "//select[@formcontrolname='Isgadminvolved']")
 WebElement GADMOppurtunity;
 
 @FindBy(xpath = "//select[@formcontrolname='Currencyid']")
 WebElement DealCurrency;
 
 @FindBy(xpath = "//input[@formcontrolname='Clientname']")
 WebElement ClientName;
 
 @FindBy(xpath = "//input[@formcontrolname='Opportunityname']")
 WebElement OpportunityName;
 
 @FindBy(xpath = "//select[@formcontrolname='Sectorid']")
 WebElement Sector;
 
 @FindBy(xpath = "//input[@formcontrolname='Dealtenure']")
 WebElement DealTenure;
 
 @FindBy(xpath ="//select[@formcontrolname='Renewalorbussid']")
 WebElement Renewal_or_NewBusiness;
 
 @FindBy(xpath = "//label[contains(text(),'*Lead Solution Architect')]//following::input[@type='text'][1]")
 WebElement LeadSolutionArchitect;
 
 @FindBy(xpath ="//button[contains(text(),'Close')]")
 WebElement Closebutton;
 
 @FindBy(xpath ="//button[contains(text(),'Save')]")
 WebElement Savebutton;
 
 @FindBy(xpath ="//button[contains(text(),'Submit')]")
 WebElement Submitbutton;
 
 @FindBy(xpath = "//input[@formcontrolname='Tcv']")
 WebElement TCV_MN;
 
 @FindBy(xpath = "//input[@formcontrolname='Amtcv']")
 WebElement AM_TCV_MN;
 
 @FindBy(xpath = "//input[@formcontrolname='Year1fte']")
 WebElement Year1_FTE;
 
 @FindBy(xpath = "//button[contains(text(),' Add Opportunity')]")
 WebElement AddOppurtunitybutton;
 
 public void clickAddoppurtunity()
 {
	 WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(50));
	 wait.until(ExpectedConditions.elementToBeClickable(AddOppurtunitybutton)).click();
	 test.log(Status.INFO, "Add Opportunity button is Clicked");
	 //AddOppurtunitybutton.click();
 }
 
 public void clickSavebutton()
 {
	 WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(50));
	 //WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 jse.executeScript("arguments[0].click()", Savebutton);
	 test.log(Status.INFO, "Save button is Clicked");   
	 	
 }
 
 public void clickSubmitbutton()
 {
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 jse.executeScript("arguments[0].click()", Submitbutton);
	 test.log(Status.INFO, "Submit button is Clicked");

 }
 
 public void clickClosebutton()
 {
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 jse.executeScript("arguments[0].click()", Closebutton);
	 test.log(Status.INFO, "Close button is Clicked");
 }
 public String getYear1_FTE()
 {
	 String year1_fte = driver.findElement(By.xpath("//input[@formcontrolname='Year1fte']")).getText();
	 return year1_fte;
}


public String getOpportunityName() {
	String opportunityname = driver.findElement(By.xpath("//input[@formcontrolname='Opportunityname']")).getText();
	 return opportunityname;
}

public void setOpportunityName(String opportunityName) {
	OpportunityName.sendKeys(opportunityName);
	test.log(Status.INFO, "Oppurtunity Name Value is entered");
}

public void setYear1_FTE(String year1_FTE)
{
	Year1_FTE.clear();
	test.log(Status.INFO, "Year1 FTE value is entered");
	Year1_FTE.sendKeys(year1_FTE);
}


public String getAM_TCV_MN() 
 {
	 String am_tcv_mn = driver.findElement(By.xpath("//input[@formcontrolname='Amtcv']")).getText();
	 return am_tcv_mn;
}


public void setAM_TCV_MN(String aM_TCV_MN)
{
	AM_TCV_MN.clear();
	AM_TCV_MN.sendKeys(aM_TCV_MN);
	test.log(Status.INFO, "AM_TCV Value is selected");
}
 

 public String getTCV_MN()
 {
	 String tcv_mn = driver.findElement(By.xpath("//input[@formcontrolname='Tcv']")).getText();
	 return tcv_mn;
}


public void setTCV_MN(String tCV_MN) 
{
	TCV_MN.clear();
	TCV_MN.sendKeys(tCV_MN);
	test.log(Status.INFO, "TCV_MN Value is entered");
}


public String getLeadSolutionArchitect() {
	String leadsoultionarchitect = driver.findElement(By.xpath("//label[contains(text(),'*Lead Solution Architect')]//following::input[@type='text'][1]")).getText();
	return leadsoultionarchitect;
}


public void setLeadSolutionArchitect(String leadSolutionArchitect) {
	LeadSolutionArchitect.sendKeys(leadSolutionArchitect);
	test.log(Status.INFO, "Lead Solution Architect Value is selected");
}

public String getRenewal_or_NewBusiness() {
	 Select renewal_or_newbuiness_dropdown = new Select(driver.findElement(By.xpath("//select[@formcontrolname='Renewalorbussid']")));
	 String renewal_or_newbuiness_dropdown_option = renewal_or_newbuiness_dropdown.getFirstSelectedOption().getText();
	 return renewal_or_newbuiness_dropdown_option;
}

public void setRenewal_or_NewBusiness(String renewal_or_NewBusiness) 
{

	Renewal_or_NewBusiness.sendKeys(renewal_or_NewBusiness);
	test.log(Status.INFO, "Renewal or New Business Value is selected");
}

public String getDealTenure() {
	 String dealtenure = driver.findElement(By.xpath("//input[@formcontrolname='Dealtenure']")).getText();
	 return dealtenure;
}

public void setDealTenure(String dealTenure)
{
	DealTenure.clear();
	DealTenure.sendKeys(dealTenure);
	test.log(Status.INFO, "Deal Tenure Value is selected");
}


public String getSector() {
	 Select sectordropdown = new Select(driver.findElement(By.xpath("//select[@formcontrolname='Sectorid']")));
	 String sectoroption = sectordropdown.getFirstSelectedOption().getText();
	 return sectoroption;
}

public void setSector(String sector) {
	Sector.sendKeys(sector);
	test.log(Status.INFO, "Sector Value is selected");
}

public String getClientName() 
 {
	 WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='Clientname']")));
	 String Clientname = driver.findElement(By.xpath("//input[@formcontrolname='Clientname']")).getText();
	 return Clientname;
}

public void setClientName(String clientName) 
{
	ClientName.clear();
	ClientName.sendKeys(clientName);
	test.log(Status.INFO, "Client Name is entered");
}

public String getDealCurrency() 
 {
	 Select dealcurrencydropdown = new Select(driver.findElement(By.xpath("//select[@formcontrolname='Currencyid']")));
	 String dealcurrencyoption = dealcurrencydropdown.getFirstSelectedOption().getText();
	 return dealcurrencyoption;
}

public void setDealCurrency(String currency) {
	DealCurrency.sendKeys(currency);
	test.log(Status.INFO, "Deal Curreny Value is selected");
}

public String getGADMOppurtunity() {
	 Select gadmoppurtunitydropdown = new Select(driver.findElement(By.xpath("//select[@formcontrolname='Isgadminvolved']")));
	 String gadmoppurtunityoption = gadmoppurtunitydropdown.getFirstSelectedOption().getText();
	 return gadmoppurtunityoption;
}

public void setGADMOppurtunity(String gADMOppurtunity) {
	GADMOppurtunity.sendKeys(gADMOppurtunity);
	test.log(Status.INFO, "GADM Opportunity Value is selected");
}

public String getTcvtype() {
	 Select tcvtypedropdown = new Select(driver.findElement(By.xpath("//select[@formcontrolname='Tcvtypeid']")));
	 String tcvtypeoption = tcvtypedropdown.getFirstSelectedOption().getText();
	 return tcvtypeoption;
}

public void setTcvtype(String tcvtypeId) {
	Tcvtype.sendKeys(tcvtypeId);
	test.log(Status.INFO, "TCV Type Value is selected");
}

public String getDealStatus() {
	 Select dealstatusdropdown = new Select(driver.findElement(By.xpath("//select[@formcontrolname='Dealstatusid']")));
	 String dealstatusoption = dealstatusdropdown.getFirstSelectedOption().getText();
	 return dealstatusoption;
}

public void setDealStatus(String dealStatusId) {
	DealStatus.sendKeys(dealStatusId);
	test.log(Status.INFO, "Deal Status Value is selected");

}

public String getTechgroup() {
	 Select techgroupdropdown = new Select(driver.findElement(By.xpath("//select[@formcontrolname='Techgroupid']")));
	 String techgroupoption = techgroupdropdown.getFirstSelectedOption().getText();
	 return techgroupoption;
}

public void setTechgroup(String techgroupId) {
	Techgroup.sendKeys(techgroupId);
	test.log(Status.INFO, "Tech group Value is selected");
}

public String getPursuitType() {
	 Select pursuittypedropdown = new Select(driver.findElement(By.xpath("//select[@formcontrolname='Pursuittypeid']")));
	 String pursuittypeoption = pursuittypedropdown.getFirstSelectedOption().getText();
	 return pursuittypeoption;
}

public void setPursuitType(String pursuitType) {
	PursuitType.sendKeys(pursuitType);
	test.log(Status.INFO, "Pursuit Type Value is selected");
}

public String getCountry() {
	 Select countrydropdown = new Select(driver.findElement(By.xpath("//select[@formcontrolname='CountryId']")));
	 String countryoption = countrydropdown.getFirstSelectedOption().getText();
	 return countryoption;
}

 public String getBU() {
	 Select budropdown = new Select(driver.findElement(By.xpath("//select[@formcontrolname='Buid']")));
	 String buoption = budropdown.getFirstSelectedOption().getText();
	 return buoption;
}

public void setBU(String bU) {
	//WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(100));
	BU.sendKeys(bU);
	test.log(Status.INFO, "BU Value is selected");
}

public AddNewOppurtunityPage(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }

public String getSBU()
{
	Select sbudropdown = new Select(driver.findElement(By.xpath("//select[@formcontrolname='SBUId']")));
	String sbuoption = sbudropdown.getFirstSelectedOption().getText();
	return sbuoption;
}

public void setSBU(String sBU)
{
	WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(50));
	wait.until(ExpectedConditions.elementToBeClickable(SBU));
	SBU.sendKeys(sBU);
	test.log(Status.INFO, "SBU Value is selected");
}
 

}
