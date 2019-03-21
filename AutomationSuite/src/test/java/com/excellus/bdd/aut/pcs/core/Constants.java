package com.excellus.bdd.aut.pcs.core;

/**
 * this file will contain all the constant values specific to the AUT.
 * @author prithwish das
 *
 */
public interface Constants {
	
	
	/*PCS Application URL*/ // shoule be moved to input.properties
	public static final String PCS_URL = "https://exclus-cep-sit1-internal.pegacloud.net/prweb/PRServlet/beEBp4uRVTogorRwSwWqbOtn9IL2fwdI*/!STANDARD";
		
	/* log4j path */
	public static final String LOG4J_DIR = "../AutomationSuite/src/test/java/config/log4j.properties";

	/* extent-config.xml path */
	public static final String EXTENTCONFIG_DIR = "../AutomationSuite/src/test/java/config/extent-config.xml";
	
	/*ChromeDriver DIR*/
	public static final String CHROMEDRIVER_DIR = "../AutomationSuite/src/test/resources/drivers/chromedriver.exe";
	
	
	/*User Directory*/
	public static final String USER_DIR = System.getProperty("user.dir");
	
	
	/* Titles: */
	public static final String PCS_LOGINPAGE_TITLE = "Pega Platform";
	public static final String PCS_HOMEPAGE_TITLE = "Pega Case Manager Portal";
	
	
	// Page wise arrange the variables here.
	
	//-------Benefits-------//
	
	
	//------Benefits Searches---//

}
