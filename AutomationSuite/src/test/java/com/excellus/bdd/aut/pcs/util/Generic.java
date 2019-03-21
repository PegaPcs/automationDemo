package com.excellus.bdd.aut.pcs.util;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.util.CellReference;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;


public class Generic
{
	public static final Logger Log = Logger.getLogger(Generic.class.getName());

	
	public static void fnClickWebElement(WebElement objWeb) throws Exception
	{
		try {
			if (fnValidateWebElement(objWeb))
			{
				//Generic.fnHighlighter(driver,objWeb);
				objWeb.click();
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			Log.error("Exception occurred in fnClickWebElement method -  " + e.getMessage());
			//logger.log(Status.ERROR, "Exception occurred in fnClickWebElement method -  " + e.getMessage());
		}
	}
	
	
	/*submit() method clicks a button, button is inside the form and it has type='submit'*/
	public static void fnSubmit(WebElement objWeb) throws Exception
	{
		try {
			if (fnValidateWebElement(objWeb))
			{
				//Generic.fnHighlighter(driver,objWeb);
				objWeb.submit();
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			Log.error("Exception occurred in fnSubmit method -  " + e.getMessage());
			//logger.log(Status.ERROR, "Exception occurred in fnSubmit method -  " + e.getMessage());
		}
	}
		
	public static void fnSetTextInEditBox(WebElement objWeb, String valueToEnter) throws Exception
	{
		try {
			if (fnValidateWebElement(objWeb))
			{
				objWeb.clear();
				//Generic.fnHighlighter(driver,objWeb);
				objWeb.sendKeys(valueToEnter);			
			}
		} catch (Exception e) {
			Log.error("Exception occurred in fnSetTextInEditBox method -  " + e.getMessage());
			//logger.log(Status.ERROR, "Exception occurred in fnSetTextInEditBox method -  " + e.getMessage());
		}		
	}
	
	/*Handle button with sendkeys*/
	public static void fnButtonSendKeys(WebElement objWeb) throws Exception
	{
		try {
			if (fnValidateWebElement(objWeb))
			{
				objWeb.clear();
				//Generic.fnHighlighter(driver,objWeb);
				objWeb.sendKeys(Keys.ENTER);
			}
		} catch (Exception e) {
			Log.error("Exception occurred in fnButtonSendKeys method -  " + e.getMessage());
			//logger.log(Status.ERROR, "Exception occurred in fnButtonSendKeys method -  " + e.getMessage());
		}		
	}
	
	/*Multiple Keys with Keys.chord in SendKeys method*/
	public static void fnSendMultipleKeys(WebElement objWeb, String valueToEnter) throws Exception
	{
		try {
			if (fnValidateWebElement(objWeb))
			{
				objWeb.clear();
				//Generic.fnHighlighter(driver,objWeb);
				objWeb.sendKeys(Keys.chord(Keys.SHIFT, valueToEnter));
			}
		} catch (Exception e) {
			Log.error("Exception occurred in fnSendMultipleKeys method -  " + e.getMessage());
			//logger.log(Status.ERROR, "Exception occurred in fnSendMultipleKeys method -  " + e.getMessage());
		}		
	}
	
	public static void fnGetInnerText(WebElement objWeb) throws Exception
	{
		try {
			if (fnValidateWebElement(objWeb))
			{	
				//Generic.fnHighlighter(driver,objWeb);
				String objInnerText = objWeb.getText();
				Log.info("Inner Text is - " + objInnerText);
				//logger.log(Status.INFO, "Inner Text is - " + objInnerText);				
			}
		} catch (Exception e) {
			Log.error("Exception occurred in fnGetInnerText method -  " + e.getMessage());
			//logger.log(Status.ERROR, "Exception occurred in fnGetInnerText method -  " + e.getMessage());
		}		
	}
	
	public static boolean fnValidateWebElement(WebElement objWeb) throws Exception
	{
		try
		{
			if (objWeb.isDisplayed())
			return true;
		}
		catch(Exception e)
		{	
			Log.error("Exception occurred in fnValidateWebElement method -  " + e.getMessage());
			//logger.log(Status.ERROR, "Exception occurred in fnValidateWebElement method -  " + e.getMessage());
			return false;
		}
		return true;
	}

	public static void fnHighlighter(WebDriver driver,WebElement objWeb) throws InterruptedException
	{
		try {
			JavascriptExecutor JSE = (JavascriptExecutor) driver;
			JSE.executeScript("arguments[0].setAttribute('style','border: 2px solid red;');", objWeb);
			Thread.sleep(500);
		} catch (Exception e) {
			Log.error("Exception occurred in fnHighlighter method -  " + e.getMessage());
			//logger.log(Status.ERROR, "Exception occurred in fnHighlighter method -  " + e.getMessage());
		}
	}
		
	public static boolean fnselectByValue(WebElement element, String value)
	{
		try {
			Select dropdown = new Select(element);
			dropdown.selectByValue(value);
		} catch (Exception e) {
			Log.info("Exception occurred in fnselectByValue method - "+ e.getMessage());
		}
		return false;
	}
	
	public static void selectRadio(WebElement objWeb)
	{
		WebElement objRadioBtn = objWeb;
		boolean objRadioBtnIsDisplayed = objRadioBtn.isDisplayed();
		boolean objRadioBtnIsEnabled = objRadioBtn.isEnabled();
		
		if(objRadioBtnIsDisplayed && objRadioBtnIsEnabled)
		{
			objRadioBtn.click();
			if(objRadioBtn.isSelected())
			{
				Log.info("Radio button is Selected");
			}			
		}
		
	}
	
	public static void selectCheckbox(WebElement objWeb)
	{
		WebElement objCheckbox = objWeb;
		boolean objCheckboxIsDisplayed = objCheckbox.isDisplayed();
		boolean objCheckboxIsEnabled = objCheckbox.isEnabled();
		
		if(objCheckboxIsDisplayed && objCheckboxIsEnabled)
		{
			//This will Toggle On the Check box
			objCheckbox.click();
			
			//Check whether the Check box is toggled on
			if(objCheckbox.isSelected())
			{
				Log.info("Checkbox is Toggled on");
			}else {
				Log.info("Checkbox is Toggled Off");
			}
		}
	}
	
	public static void unSelectCheckbox(WebElement objWeb)
	{
		WebElement objCheckbox = objWeb;
		boolean objCheckboxIsDisplayed = objCheckbox.isDisplayed();
		boolean objCheckboxIsEnabled = objCheckbox.isEnabled();
		
		if(objCheckboxIsDisplayed && objCheckboxIsEnabled)
		{			
			//Check whether the Check box is toggled on
			if(objCheckbox.isSelected())
			{
				Log.info("Checkbox is Toggled on");
			}else {
				Log.info("Checkbox is Toggled Off");
			}
			
			objCheckbox.click();
			
			if(!objCheckbox.isSelected())
			{
				Log.info("Checkbox is now Toggled Off!!");
			}
		}
	}
	
	/*
	 * public static void fnScrollUp() { ((JavascriptExecutor)
	 * driver).executeScript(("window.scrollTo(document.body.scrollHeight,0)")); }
	 * 
	 * public static void fnScrollDown() { JavascriptExecutor JSE =
	 * (JavascriptExecutor) driver;
	 * JSE.executeScript("window.scrollTo(0, document.body.scrollHeight)"); }
	 */
	
	public static void fnKillProcesses() throws Exception
	{
		Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
		Runtime.getRuntime().exec("taskkill /F / IM chromedriver.exe");
	}
	
	public static boolean fnValidateDropDownValue(WebElement webObj, String valueDropDown)
	{
		Select select = new Select(webObj); 
		java.util.List<WebElement> options = select.getOptions(); 
		boolean found=false;
        for(WebElement item:options) 
        {  
         
             if (item.getText().equals(valueDropDown)){
             found=true;
             break;
             }
           }
		return found;		
	}
	
	public static void fnSelectValueFromDropdown(WebElement objWeb, String value)
	{	
		try {
			if (fnValidateWebElement(objWeb))
			{
				//Generic.fnHighlighter(driver,objWeb);
				Select dropDown= new Select(objWeb);
				
				if (fnValidateDropDownValue(objWeb,value))
				{
					dropDown.selectByValue(value);			
				}
				else
				{
					Log.info("Unable to Select value");
				}
			}
		} catch (Exception e) {
			Log.error("Exception occurred in fnSelectValueFromDropdown Class " + e.getMessage());
			//logger.log(Status.ERROR, "Exception occurred in fnSelectValueFromDropdown Class " + e.getMessage());
		}
	}
	
	public static void fnSelectVisibleText(WebElement objWeb, String value)
	{	
		try {
			if (fnValidateWebElement(objWeb))
			{
				//Generic.fnHighlighter(driver,objWeb);
				Select dropDown= new Select(objWeb);
				
				if (fnValidateDropDownValue(objWeb,value))
				{
					dropDown.selectByVisibleText(value);			
				}
				else
				{
					Log.info("Unable to Select Visible Text");
				}
			}
		} catch (Exception e) {
			Log.error("Exception occurred in fnSelectVisibleText Class " + e.getMessage());
			//logger.log(Status.ERROR, "Exception occurred in fnSelectVisibleText Class " + e.getMessage());
		}
	}
	
	public static String getCellName(Cell cell)
	{
		return CellReference.convertNumToColString(cell.getColumnIndex()+(cell.getRowIndex() + 1));
	}
	
	public static void verifyText(WebElement objWeb)
	{
		try {
			boolean verifyText = objWeb.isDisplayed();
			
			if(verifyText == true)
			{
				String strText =  objWeb.getText();
				Log.info("Text " + strText + " is displayed, as expected");
				//logger.log(Status.INFO, "Text " + strText + " is displayed, as expected ");
			}
			else
			{
			    Assert.assertTrue(verifyText, "Expected Text is not displayed.");
			}
		} catch (Exception e) {
			Log.error("Exception occurred in verifyText Class " + e.getMessage());
			//logger.log(Status.ERROR, "Exception occurred in verifyText Class " + e.getMessage());
		}
	}
}
