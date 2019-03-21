package com.excellus.bdd.aut.pcs.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Benefits PO handles PCS product benefit creation
 * @author svarghes
 *
 */
public class BenefitPO implements BasePO {
	
	

	public void verifyPageTitle() {
		// TODO Auto-generated method stub
		
	}

	public void fillMandatoryFields() {
		// TODO Auto-generated method stub
		
	}

	public void verifyOnscreenVerbage() throws Throwable {
		// TODO Auto-generated method stub
		
	}

	public void closeResources() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickElemment(By el) {
		// TODO Auto-generated method stub
		
	}
	
	public static final Logger log = Logger.getLogger(BenefitPO.class.getName());
	
	public BenefitPO(WebDriver driver) {           
        PageFactory.initElements(driver, this);
	}
	
	
	// xpaths
	
	
	//----Action methods----///

}
