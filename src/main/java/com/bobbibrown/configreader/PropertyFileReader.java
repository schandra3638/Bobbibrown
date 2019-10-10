package com.bobbibrown.configreader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader implements ConfigReader
{
	private Properties pfr;
	
	public PropertyFileReader() throws FileNotFoundException, IOException
	{
		pfr = new Properties();
		try
		{
			pfr.load(new FileInputStream(configPropertyFilePath));			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public String getBrowser() {
	 
		return pfr.getProperty(browser);
		
	}

	public String getWebSite() {
		
		return pfr.getProperty(webSite);
	}

	public String getUsername() {
		
		return pfr.getProperty(userName);
	}

	public String getPassword() {
		
		return pfr.getProperty(password);
	}

	public int getPageLoadTimeOut() {
		
		return Integer.parseInt(pfr.getProperty(pageLoadTimeOut));
	}

	public int getImplcitWaitTime() {
		
		return Integer.parseInt(pfr.getProperty(implcitWait));
	}

	public int getExplicitWaitTime() {
		
		return Integer.parseInt(pfr.getProperty(explicitWait));
	}

	public int getPollingEveryInMiliSec() {
		
		return Integer.parseInt(pfr.getProperty(pollingEveryInMiliSec));
	}


}
