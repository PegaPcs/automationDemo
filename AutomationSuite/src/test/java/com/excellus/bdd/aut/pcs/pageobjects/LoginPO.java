package com.excellus.bdd.aut.pcs.pageobjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.excellus.bdd.aut.pcs.util.Generic;


public class LoginPO implements BasePO
{

	public static final Logger log = Logger.getLogger(LoginPO.class.getName());
	
	public LoginPO(WebDriver driver) {           
        PageFactory.initElements(driver, this);
	}
	
	
	@Override
	public void verifyPageTitle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fillMandatoryFields() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyOnscreenVerbage() throws Throwable {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeResources() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickElemment(By el) {
		// TODO Auto-generated method stub
		
	}

	/*********************************** DEFINE LOCATORS ***********************************************/
		
		// Define User name Field
		@FindBy(how = How.ID, using = "txtUserID")
		private WebElement txtbx_UserName;

		// Define Password Field
		@FindBy(how = How.ID, using = "txtPassword")
		private WebElement txtbx_Password;

		// Define Log in Button
		@FindBy(how = How.ID, using = "sub")
		private WebElement btn_Login;

		// Define Login Error Message
		@FindBy(id = "error")
		private List<WebElement> errorMessage;
	
	 /**********************************DEFINE METHODS **********************************************/
		//Set UserName method
		public void setUserName(String strUserName) throws Exception
		{
			Generic.fnSetTextInEditBox(txtbx_UserName, strUserName);
			log.info("Entered UserName is - " + strUserName);
		}
		
		//Set Password method
		public void setPassword(String strPassword) throws Exception
		{
			Generic.fnSetTextInEditBox(txtbx_Password, strPassword);
			log.info("Entered UserName is - " + strPassword);
		}
		
		//Click Login button method
		public void clickLoginbutton() throws Exception
		{
			Generic.fnClickWebElement(btn_Login);
			log.info("Login  button has Clicked");
		}
		
		
		// Define verify Is Login Success
		public void verifyIsLoginSuccess() throws Exception
		{
			Thread.sleep(1000);
			if(errorMessage.size() > 0)
			{
				log.error("Login Failed - Error message is : " + errorMessage.get(0).getText());
				Assert.assertEquals(errorMessage.get(0).getText(), "Login should be successful", "Unable to Login ---");
			} else
			{
				log.info("Login Success");
	
			}	
		}
		
}
