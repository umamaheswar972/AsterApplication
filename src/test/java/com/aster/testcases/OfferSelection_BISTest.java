package com.aster.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aster.pages.AddNewOppurtunityPage;
import com.aster.utilities.ReadConfigProperties;
import com.aster.pages.*;

@Listeners(com.aster.testcases.TestStatusListener.class)

public class OfferSelection_BISTest extends BaseClass {

	Properties properties;
	AsterLogin loginpage;
	AddOppurtunityTest addoppurtunitytest;
	OfferSelection_BIS offerselection_bis;
	ReadConfigProperties config = new ReadConfigProperties();
	
	@Test
	public void OfferSelection_BIS() throws IOException
	{
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		test = extent.createTest(nameofCurrMethod,"Login into Aster Application and Creating new Oppurtunity,OfferSelection");
		addoppurtunitytest = new AddOppurtunityTest();
		addoppurtunitytest.addoppurtunitywithoutsearch();
		offerselection_bis = new OfferSelection_BIS(driver);
		offerselection_bis.ClickOfferSelectionLink();
		offerselection_bis.ClickBISCheckbox();
		offerselection_bis.clickBISAssesmentCheckbox();
	}
}
