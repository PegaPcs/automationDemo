package com.excellus.bdd.aut.pcs.testasserts;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.excellus.bdd.aut.pcs.core.Constants;
import com.excellus.bdd.aut.pcs.core.DriverFactory;
import com.excellus.bdd.aut.pcs.pageobjects.BasePO;
import com.excellus.bdd.aut.pcs.pageobjects.BenefitPO;
import com.excellus.bdd.aut.pcs.pageobjects.HomePO;
import com.excellus.bdd.aut.pcs.pageobjects.LoginPO;
import com.excellus.bdd.aut.pcs.util.Generic;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BenefitTest extends DriverFactory
{
	public static final Logger log = Logger.getLogger(BenefitTest.class.getName());
	//private WebDriver driver;
	LoginPO loginPO = new LoginPO(driver);
	HomePO homePO =  new HomePO(driver);
	BenefitPO benefitPO = new BenefitPO(driver);
	
	@Given("^User opens browser and launch the application$")
	public void user_opens_browser_and_launch_the_application() throws Throwable 
	{
	    //Generic.verifyPageTitle(Constants.PCS_LOGINPAGE_TITLE);
	}

	@When("^User enter valid \"(.*?)\" and \"(.*?)\"$")
	public void user_enter_valid_and(String strUserName, String strPassword) throws Throwable 
	{
		loginPO.setUserName(strUserName);
		loginPO.setPassword(strPassword);
	}

	@When("^User clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable 
	{
	   loginPO.clickLoginbutton();
	}
	
	@Then("^Login should be successful$")
	public void login_should_be_successful() throws Throwable 
	{
	    loginPO.verifyIsLoginSuccess();
	}
	
	@Then("^Home page should be displayed$")
	public void home_page_should_be_displayed() throws Throwable 
	{
		//Generic.verifyPageTitle(Constants.PCS_HOMEPAGE_TITLE);
	}

	@When("^User clicks on New Menu$")
	public void user_clicks_on_New_Menu() throws Throwable 
	{
		homePO.clickOnNewMenu();
	}

	@When("^User clicks on Benefit sub-menu$")
	public void user_clicks_on_Benefit_sub_menu() throws Throwable 
	{
		homePO.clickOnBenefit();
	}

	@Then("^User Logged off$")
	public void user_navigates_to_Benefit_Overview_screen() throws Throwable 
	{
	    homePO.Logoff_Action();
	}

}
