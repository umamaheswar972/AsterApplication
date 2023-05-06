package com.aster.testcases;
import com.aster.utilities.*;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aster.utilities.ReadConfigProperties;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

@Listeners(com.aster.testcases.TestStatusListener.class)

public class AsterLogin extends BaseClass
{
	Properties prop;
	ReadConfigProperties config = new ReadConfigProperties();
	
   @Test(dataProvider="AsterLogin")
	public void login(String CorpID, String Password) throws IOException
	{
	  
		this.prop =config.loadProperties();  
		driver.get(prop.getProperty("BaseURL"));
		driver.manage().window().maximize();
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		test = extent.createTest(nameofCurrMethod,"Login into Aster Application with correct credentials");
        test.log(Status.INFO, "Login Test");
        test.assignCategory("P0");
		//driver.findElement(By.xpath("//input[@formcontrolname='corpId']")).sendKeys("SEETRAO");
		driver.findElement(By.xpath(prop.getProperty("CorpID_xpath"))).sendKeys(CorpID);
		log.info("Corp ID is entered");
		test.log(Status.INFO, "Corp ID is entered");
		//test.addScreenCaptureFromPath(BaseClass.CaptureScreenshot());
		driver.findElement(By.xpath(prop.getProperty("Password_xpath"))).sendKeys(Password);
		log.info("Password is entered");
		test.log(Status.INFO, "Password is entered");
		//test.addScreenCaptureFromPath(BaseClass.CaptureScreenshot());
		driver.findElement(By.xpath(prop.getProperty("Loginbtn_xpath"))).click();
		String expectedtitle = "Aster";
		String actualtitle = driver.getTitle();
		test.log(Status.INFO, "Get Page Title");
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title='logout']"))).click();
		//driver.findElement(By.xpath("//img[@title='logout']")).click();
	
		if(expectedtitle.equals(actualtitle))
	    {
			Assert.assertTrue(true);
		}
		else
		{
		   Assert.assertTrue(false);
		}		
			
}	
  
   
   @DataProvider(name = "AsterLogin")
   public Object[][] loginData() throws IOException 
   {
	    String path = ".\\testdata\\Login_TestData.xlsx";
	    XLUtility xlutils = new XLUtility(path);
	    Object loginData[][] = xlutils.getExcelData();
	    
		return loginData;
	}

   @Test(priority=2,enabled = false)
   public void loginfailure() throws IOException
   {

		this.prop =config.loadProperties();  
		driver.get(prop.getProperty("BaseURL"));
		driver.manage().window().maximize();	
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
	    test = extent.createTest(nameofCurrMethod,"Login into Aster Application with wrong credentials");
        test.log(Status.INFO, "Login Test");
		driver.findElement(By.xpath(prop.getProperty("CorpID_xpath"))).sendKeys(prop.getProperty("CorpID2"));
		log.info("Corp ID is entered");
		test.log(Status.INFO, "Corp ID is entered");
		driver.findElement(By.xpath(prop.getProperty("Password_xpath"))).sendKeys(prop.getProperty("Password2"));
		log.info("Password is entered");
		test.log(Status.INFO, "Password is entered");
		driver.findElement(By.xpath(prop.getProperty("Loginbtn_xpath"))).click();
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(30));
		String errormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Authentication did not succeed. Check user name and password.')]"))).getText();
		Assert.assertEquals(errormsg,"Aster");
		System.out.println(driver.getTitle());
		test.log(Status.INFO, "Get Page Title");
		log.info("Login is Failed");
		System.out.println("Login is Failed");

   }
   @Test(priority=3,enabled = false)
   public void loginwithoutpassword() throws IOException
   {
		this.prop =config.loadProperties();  
		driver.get(prop.getProperty("BaseURL"));
		driver.manage().window().maximize();	
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
	    test = extent.createTest(nameofCurrMethod,"Login into Aster Application without password");
        test.log(Status.INFO, "Login Test");
		driver.findElement(By.xpath(prop.getProperty("CorpID_xpath"))).sendKeys(prop.getProperty("CorpID3"));
		log.info("Corp ID is entered");
		test.log(Status.INFO, "Corp ID is entered");
		driver.findElement(By.xpath(prop.getProperty("Password_xpath"))).sendKeys(prop.getProperty("Password3"));
		log.info("Password is entered");
		test.log(Status.INFO, "Password is entered");
		driver.findElement(By.xpath(prop.getProperty("Loginbtn_xpath"))).click();
		System.out.println("Login is Failed");
   }
   
}

