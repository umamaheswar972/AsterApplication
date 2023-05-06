package com.aster.testcases;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aster.pages.AddNewOppurtunityPage;
import com.aster.utilities.ReadConfigProperties;
import com.aster.utilities.XLUtility;

@Listeners(com.aster.testcases.TestStatusListener.class)

public class AddOppurtunityTest extends BaseClass {
	Properties properties;
	AsterLogin loginpage;
	AddNewOppurtunityPage addoppurtunity;
	ReadConfigProperties config = new ReadConfigProperties();
	
	
	@Test(priority=1,enabled=true)
 public void addoppurtunitywithoutsearch() throws IOException
 { 
	    this.properties = config.loadProperties();
	    String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		test = extent.createTest(nameofCurrMethod,"Login into Aster Application and Creating new Oppurtunity");
		driver.get(properties.getProperty("BaseURL"));
		driver.manage().window().maximize();	
		String CorpID = properties.getProperty("CorpID1");
		String Password = properties.getProperty("Password1");
		driver.findElement(By.xpath(properties.getProperty("CorpID_xpath"))).sendKeys(CorpID);
		driver.findElement(By.xpath(properties.getProperty("Password_xpath"))).sendKeys(Password);
		driver.findElement(By.xpath(properties.getProperty("Loginbtn_xpath"))).click();
		//WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),' Add Opportunity')]"))).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Coastid']//following::img"))).click();
		//driver.findElement(By.xpath("//input[@name='searchTerm']")).sendKeys("27458");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='searchTerm']")));
		//driver.findElement(By.xpath("//input[@name='searchTerm']")).sendKeys("27458");
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'27458')]"))).click();
	    addoppurtunity = new AddNewOppurtunityPage(driver);
	    addoppurtunity.clickAddoppurtunity();
	   // WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(50));
		addoppurtunity.setSBU(properties.getProperty("SBU_Value"));
		System.out.println("SBU dropdown value is set");
		System.out.println("SBU Dropdown selected value is:"+addoppurtunity.getSBU());
		addoppurtunity.setBU(properties.getProperty("BU_Value"));
		System.out.println("BU dropdown value is set");
		System.out.println("BU Dropdown selected value is:"+addoppurtunity.getBU());
		System.out.println("Country dropdown value is set");
		System.out.println("Country Dropdown selected value is:"+addoppurtunity.getCountry());
		addoppurtunity.setClientName(properties.getProperty("ClientName_Value"));
		System.out.println("Client Name value is:"+addoppurtunity.getClientName());
		addoppurtunity.setSector(properties.getProperty("Sector_Value"));
		System.out.println("Sector value is:"+addoppurtunity.getSector());
		addoppurtunity.setPursuitType(properties.getProperty("PursuitType_Value"));
		System.out.println("Pursuit Type value is:"+addoppurtunity.getPursuitType());
		addoppurtunity.setDealTenure(properties.getProperty("DealTenure_Value"));
		System.out.println("Deal Tenure Value is:"+addoppurtunity.getDealTenure());
		addoppurtunity.setTechgroup(properties.getProperty("TechGroup_Value"));
		System.out.println("Tech group value is:"+addoppurtunity.getTechgroup());
		addoppurtunity.setLeadSolutionArchitect(properties.getProperty("LeadSolutionArchitect_Value"));
		System.out.println("Lead solution Architect value is:"+addoppurtunity.getLeadSolutionArchitect());
		addoppurtunity.setTcvtype(properties.getProperty("TcvType_Value"));
		System.out.println("Tcv Type Value is:"+addoppurtunity.getTcvtype());
		addoppurtunity.setGADMOppurtunity(properties.getProperty("GADMOppurtunity_Value"));
		System.out.println("GADM Oppurtunity value is:"+addoppurtunity.getGADMOppurtunity());
		addoppurtunity.setRenewal_or_NewBusiness(properties.getProperty("Renewal_or_NewBusiness_Value"));
		System.out.println("Renewal or New Business value is:"+addoppurtunity.getRenewal_or_NewBusiness());
		addoppurtunity.setDealCurrency(properties.getProperty("DealCurrency_Value"));
		System.out.println("Deal Currency value is:"+addoppurtunity.getDealCurrency());
		addoppurtunity.setDealStatus(properties.getProperty("DealStatus_Value"));
		System.out.println("Deal Status value is:"+addoppurtunity.getDealStatus());
		addoppurtunity.setOpportunityName(properties.getProperty("OppurtunityName"));
		//addoppurtunity.clickSavebutton();
		//addoppurtunity.clickClosebutton();
		
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'*Lead Solution Architect')]//following::input[@type='text'][1]")));
		//driver.findElement(By.xpath("//label[contains(text(),'*Lead Solution Architect')]//following::input[@formcontrolname='Solutionarchitect']")).clear();
		//driver.findElement(By.xpath("//label[contains(text(),'*Lead Solution Architect')]//following::input[@type='text'][1]")).sendKeys("Abhijit Sawant");
		//driver.findElement(By.xpath("//label[contains(text(),'Other Automation Architect')]//following::div[@class='multiselect-dropdown']")).click();
		//driver.findElement(By.xpath("//input[@aria-label='Abhishek Borkar']")).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Abhishek Borkar')]"))).click();
		
 }	
	
@Test(priority=2,enabled=false)
public void addoppurtunityusingsearch() throws IOException
{ 
	    this.properties = config.loadProperties();
	    String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		test = extent.createTest(nameofCurrMethod,"Login into Aster Application and Creating new Oppurtunity");
		driver.get(properties.getProperty("BaseURL"));
		driver.manage().window().maximize();	
		String CorpID = properties.getProperty("CorpID1");
		String Password = properties.getProperty("Password1");
		driver.findElement(By.xpath(properties.getProperty("CorpID_xpath"))).sendKeys(CorpID);
		driver.findElement(By.xpath(properties.getProperty("Password_xpath"))).sendKeys(Password);
		driver.findElement(By.xpath(properties.getProperty("Loginbtn_xpath"))).click();
		addoppurtunity = new AddNewOppurtunityPage(driver);
	    addoppurtunity.clickAddoppurtunity();
	    WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(100));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),' Add Opportunity')]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Coastid']//following::img"))).click();
		//driver.findElement(By.xpath("//input[@name='searchTerm']")).sendKeys("27458");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='searchTerm']"))).clear();
		driver.findElement(By.xpath("//input[@name='searchTerm']")).sendKeys("27458");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'27458')]"))).click();
		addoppurtunity.setSBU(properties.getProperty("SBU_Value"));
		System.out.println("SBU dropdown value is set");
		System.out.println("BU Dropdown selected value is:"+addoppurtunity.getSBU());
		addoppurtunity.setBU(properties.getProperty("BU_Value"));
		System.out.println("BU dropdown value is set");
		System.out.println("BU Dropdown selected value is:"+addoppurtunity.getBU());
		System.out.println("Country dropdown value is set");
		System.out.println("Country Dropdown selected value is:"+addoppurtunity.getCountry());
		//addoppurtunity.setClientName(properties.getProperty("ClientName_Value"));
		//System.out.println("Client Name value is:"+addoppurtunity.getClientName());
		//addoppurtunity.setSector(properties.getProperty("Sector_Value"));
		//System.out.println("Sector value is:"+addoppurtunity.getSector());
		addoppurtunity.setClientName(properties.getProperty("ClientName_Value"));
		System.out.println("Client Name value is:"+addoppurtunity.getClientName());
		addoppurtunity.setPursuitType(properties.getProperty("PursuitType_Value"));
		System.out.println("Pursuit Type value is:"+addoppurtunity.getPursuitType());
		//addoppurtunity.setDealTenure(properties.getProperty("DealTenure_Value"));
		//System.out.println("Deal Tenure Value is:"+addoppurtunity.getDealTenure());
		addoppurtunity.setTechgroup(properties.getProperty("TechGroup_Value"));
		System.out.println("Tech group value is:"+addoppurtunity.getTechgroup());
		//addoppurtunity.setLeadSolutionArchitect(properties.getProperty("LeadSolutionArchitect_Value"));
		//System.out.println("Lead solution Architect value is:"+addoppurtunity.getLeadSolutionArchitect());
		addoppurtunity.setTcvtype(properties.getProperty("TcvType_Value"));
		System.out.println("Tcv Type Value is:"+addoppurtunity.getTcvtype());
		addoppurtunity.setGADMOppurtunity(properties.getProperty("GADMOppurtunity_Value"));
		System.out.println("GADM Oppurtunity value is:"+addoppurtunity.getGADMOppurtunity());
		addoppurtunity.setRenewal_or_NewBusiness(properties.getProperty("Renewal_or_NewBusiness_Value"));
		System.out.println("Renewal or New Business value is:"+addoppurtunity.getRenewal_or_NewBusiness());
		addoppurtunity.setDealCurrency(properties.getProperty("DealCurrency_Value"));
		System.out.println("Deal Currency value is:"+addoppurtunity.getDealCurrency());
		addoppurtunity.setDealStatus(properties.getProperty("DealStatus_Value"));
		System.out.println("Deal Status value is:"+addoppurtunity.getDealStatus());
}

@DataProvider(name = "AddOppourtunitydetailswithsearch")
public Object[][] OpportunityData() throws IOException 
{
	    String path = ".\\testdata\\AddOpportunity_Details.xlsx";
	    XLUtility xlutils = new XLUtility(path);
	    Object OpportunityData[][] = xlutils.getExcelData();
	    
		return OpportunityData;
	}

@Test(priority=3,enabled=false,dataProvider = "AddOppourtunitydetailswithsearch")
public void addoppurtunitybyusingsearch(String SBU,String BU,String ClientName, String PursuitType, String Techgroup, String TCVType, String GADMOppurtunity,String Renewal_or_NewBusiness, String DealCurrency, String DealStatus) throws IOException
{ 
	    this.properties = config.loadProperties();
	    String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		test = extent.createTest(nameofCurrMethod,"Login into Aster Application and Creating new Oppurtunity");
		driver.get(properties.getProperty("BaseURL"));
		driver.manage().window().maximize();	
		String CorpID = properties.getProperty("CorpID1");
		String Password = properties.getProperty("Password1");
		driver.findElement(By.xpath(properties.getProperty("CorpID_xpath"))).sendKeys(CorpID);
		driver.findElement(By.xpath(properties.getProperty("Password_xpath"))).sendKeys(Password);
		driver.findElement(By.xpath(properties.getProperty("Loginbtn_xpath"))).click();
		addoppurtunity = new AddNewOppurtunityPage(driver);
	    addoppurtunity.clickAddoppurtunity();
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(100));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),' Add Opportunity')]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Coastid']//following::img"))).click();
		//driver.findElement(By.xpath("//input[@name='searchTerm']")).sendKeys("27458");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='searchTerm']"))).clear();
		driver.findElement(By.xpath("//input[@name='searchTerm']")).sendKeys(properties.getProperty("CoastID"));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'27458')]"))).click();
		addoppurtunity.setSBU(SBU);
		System.out.println("BU Dropdown selected value is:"+addoppurtunity.getSBU());
		addoppurtunity.setBU(BU);
		System.out.println("BU dropdown value is set");
		System.out.println("BU Dropdown selected value is:"+addoppurtunity.getBU());
		System.out.println("Country dropdown value is set");
		System.out.println("Country Dropdown selected value is:"+addoppurtunity.getCountry());
		//addoppurtunity.setClientName(properties.getProperty("ClientName_Value"));
		//System.out.println("Client Name value is:"+addoppurtunity.getClientName());
		//addoppurtunity.setSector(properties.getProperty("Sector_Value"));
		//System.out.println("Sector value is:"+addoppurtunity.getSector());
		addoppurtunity.setClientName(ClientName);
		System.out.println("Client Name value is:"+addoppurtunity.getClientName());
		addoppurtunity.setPursuitType(PursuitType);
		System.out.println("Pursuit Type value is:"+addoppurtunity.getPursuitType());
		//addoppurtunity.setDealTenure(properties.getProperty("DealTenure_Value"));
		//System.out.println("Deal Tenure Value is:"+addoppurtunity.getDealTenure());
		addoppurtunity.setTechgroup(Techgroup);
		System.out.println("Tech group value is:"+addoppurtunity.getTechgroup());
		//addoppurtunity.setLeadSolutionArchitect(properties.getProperty("LeadSolutionArchitect_Value"));
		//System.out.println("Lead solution Architect value is:"+addoppurtunity.getLeadSolutionArchitect());
		addoppurtunity.setTcvtype(TCVType);
		System.out.println("Tcv Type Value is:"+addoppurtunity.getTcvtype());
		addoppurtunity.setGADMOppurtunity(GADMOppurtunity);
		System.out.println("GADM Oppurtunity value is:"+addoppurtunity.getGADMOppurtunity());
		addoppurtunity.setRenewal_or_NewBusiness(Renewal_or_NewBusiness);
		System.out.println("Renewal or New Business value is:"+addoppurtunity.getRenewal_or_NewBusiness());
		addoppurtunity.setDealCurrency(DealCurrency);
		System.out.println("Deal Currency value is:"+addoppurtunity.getDealCurrency());
		addoppurtunity.setDealStatus(DealStatus);
		System.out.println("Deal Status value is:"+addoppurtunity.getDealStatus());
}
}