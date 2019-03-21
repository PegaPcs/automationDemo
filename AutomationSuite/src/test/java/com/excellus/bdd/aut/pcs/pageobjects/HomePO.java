package com.excellus.bdd.aut.pcs.pageobjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.excellus.bdd.aut.pcs.util.Generic;



public class HomePO implements BasePO {

private static final Logger log = Logger.getLogger(HomePO.class.getName());
	
	public HomePO(WebDriver driver) {           
        PageFactory.initElements(driver, this);
	}
	
	@Override
	public void clickElemment(By el) {
		// TODO Auto-generated method stub
		
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
	

        /*********************************** DEFINE LOCATORS ***********************************************/
		// Define New Menu Item
		@FindBy(how = How.XPATH, using = "//span[contains(.,'New')][@class='menu-item-title']")
		WebElement lnk_New_Menu;
    	
		//Define Benefit case
		@FindBy(xpath = "//span[contains(.,'Benefit')][@class='menu-item-title']")
		List<WebElement> lnk_Benefit;
		
		//Define operator name
		@FindBy(xpath="//i[@data-test-id='px-opr-image-ctrl']")
		WebElement icon_operator_name;
		
		//Define Logout
		@FindBy(xpath="//a[contains(.,'Log off')]")
		WebElement btn_Logout;
		
		/**********************************DEFINE METHODS *****************************************************/
    	
 		
		public void clickOnNewMenu() throws Exception 
		{
			try {
				Thread.sleep(1000);
				Generic.fnClickWebElement(lnk_New_Menu);
				log.info("Clicked on New Menu item");
			} catch (Exception e) {
				log.error("Exception occurred in clickOnNewMenu method - " + e.getMessage());
			}
		}
		
		public void clickOnBenefit()
		{
			try {
				lnk_Benefit.get(0).click();
				log.info("Clicked on Benefit Case");
			} catch (Exception e) {
				log.error("Exception occurred in clickOnBenefit method - " + e.getMessage());
			}
		}

		public void Logoff_Action()
		{
			try {
				//driver.switchTo().defaultContent();
				Thread.sleep(1000);
				Generic.fnClickWebElement(icon_operator_name);
				log.info("Clicked on Operator Icon");
				Thread.sleep(1000);
				Generic.fnClickWebElement(btn_Logout);
				log.info("Clicked on Logout button");
	 		 } catch (Exception e) {
	 			log.error("Exception occurred in Logoff_Action method - " + e.getMessage());
			}
		}
		
				
}
