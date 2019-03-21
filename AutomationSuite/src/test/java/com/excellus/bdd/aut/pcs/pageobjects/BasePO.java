package com.excellus.bdd.aut.pcs.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.junit.Assert;

/**
 * Defines the common contracts amongst the PO
 * @author svarghes
 *
 */
public interface BasePO {
		
	public void clickElemment(By el);
	public void verifyPageTitle();
	public void fillMandatoryFields();
	public void verifyOnscreenVerbage() throws Throwable;
	public void closeResources();
	
	//public static WebDriver driver = null;
}
