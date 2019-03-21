package com.excellus.bdd.aut.pcs.util;

import java.net.MalformedURLException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.excellus.bdd.aut.pcs.core.Constants;
import com.excellus.bdd.aut.pcs.core.DriverFactory;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks 
{
	static DriverFactory driverFactory = new DriverFactory();
	Scenario scenario;
	private static Logger log = Logger.getLogger(Hooks.class.getName());


	@Before()
	public void beforeScenario(Scenario scenario) throws MalformedURLException, InterruptedException 
	{
		this.scenario = scenario;
		log.info("Executing scenario : " + scenario.getName());
					
		driverFactory.createDriver(scenario);
		
		// Log4J configuration:
		String log4jConfPath = Constants.LOG4J_DIR;
		PropertyConfigurator.configure(log4jConfPath);
	}

	@After()
	public static void afterScenario(Scenario scenario) 
	{
		driverFactory.closeDriver(scenario);
		log.info("Browser has been closed.");	
	}
}

