package com.aster.testcases;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class TestStatusListener extends BaseClass implements ITestListener{
	public void onTestStart(ITestResult iTestResult) {
		 
    }
 
    public void onTestSuccess(ITestResult iTestResult) {
        BaseClass.test.log(Status.PASS,MarkupHelper.createLabel(iTestResult.getName().toUpperCase()+" -PASS",ExtentColor.GREEN));
        try
        {
            String Screenshot = BaseClass.CaptureScreenshot();
        	BaseClass.test.addScreenCaptureFromPath(Screenshot);
            BaseClass.test.addScreencastFromPath(Screenshot);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public void onTestFailure(ITestResult iTestResult) {
        BaseClass.test.log(Status.FAIL,iTestResult.getThrowable().getMessage());
        BaseClass.test.log(Status.FAIL,MarkupHelper.createLabel(iTestResult.getName().toUpperCase()+" -FAIL",ExtentColor.RED));
        try
        {
            String Screenshot = BaseClass.CaptureScreenshot();
        	BaseClass.test.addScreenCaptureFromPath(Screenshot);
            BaseClass.test.addScreencastFromPath(Screenshot);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
 
    public void onTestSkipped(ITestResult iTestResult) {
    	BaseClass.test.log(Status.SKIP,MarkupHelper.createLabel(iTestResult.getName().toUpperCase()+" SKIPPED",ExtentColor.PURPLE));
 
    }
 
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
 
    }
 
    public void onStart(ITestContext iTestContext) {
 
    }
 
    public void onFinish(ITestContext iTestContext) {
 
    }
}
