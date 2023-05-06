package com.aster.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aster.utilities.ReadConfigProperties;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass {
	    static WebDriver driver;
		static Logger log;
		WebDriverWait wait;
		public ExtentHtmlReporter htmlReporter;
		public static ExtentReports extent;
		public static ExtentTest test;
		
		@BeforeTest

		public void ExtentReportConfig()
		{
			 // initialize the HtmlReporter
	        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/Reports/extentReport.html");
	 
	        //initialize ExtentReports and attach the HtmlReporter
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        extent.setSystemInfo("Host Name", "Aster Application");
        	extent.setSystemInfo("Environment", "Testing Environment");
		    extent.setSystemInfo("User Name", "Umamaheswara Rao");
	 
	 
	        //configuration items to change the look and feel
	        //add content, manage tests etc
	       // htmlReporter.config().setChartVisibilityOnOpen(true);
	        htmlReporter.config().setDocumentTitle("Simple Automation Report");
	        htmlReporter.config().setReportName("Aster Application Test Report");
	       // htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	        htmlReporter.config().setTheme(Theme.DARK);
	        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	        
		}
		@BeforeMethod
		public void setup() throws IOException
		{
		
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		 WebDriverManager.chromedriver().setup();
		 ChromeOptions options = new ChromeOptions();
	     options.addArguments("--remote-allow-origins=*");
	     options.addArguments("--no-sandbox");
	     
		driver = new ChromeDriver(options);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		log = Logger.getLogger("Aster Application");
		PropertyConfigurator.configure("log4j.properties");
		
		//String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		//test = extent.createTest(nameofCurrMethod,"Aster Application");
		}
		
		 public static String CaptureScreenshot() throws IOException 
		 {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
			String dateName = sdf.format(date);
			 //String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			String FileSeparator = System.getProperty("file.separator");
			String Extent_report_path = "."+FileSeparator+"Reports";
			String ScreenshotPath = Extent_report_path+FileSeparator+"screenshots";
			 
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//String screenshotName = "screenshot"+Math.random()+dateName+".png";
			String screenshotName = "screenshot"+dateName+".png";
			String screenshotpath = ScreenshotPath+FileSeparator+screenshotName;
			 
			FileUtils.copyFile(src,new File(screenshotpath));
			return "."+FileSeparator+"screenshots"+FileSeparator+screenshotName;
			
	    }
		
		@AfterMethod
		public void closedriver()
		{
			//driver.close();
		}
		@AfterTest
		public void teardown()
		{
		 System.out.println("Closing the driver instance");	
		 driver.quit();
		 extent.flush();
		}

	}

