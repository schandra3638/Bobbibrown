package com.bobbibrown.configreader;

public interface ConfigReader 
{
	public static String browser = "Browser";
	public static String webSite = "Website";
	public static final String userName = "Username";
	public static final String password = "Password";
	public static final String pageLoadTimeOut = "PageLoadTimeOut";
	public static final String implcitWait = "ImplcitWait";
	public static final String explicitWait = "ExplicitWait";
	public static final String pollingEveryInMiliSec = "PollingEveryInMiliSec";
	public static final String log4jPropertyFilePath =".\\src\\main\\resources\\configfiles\\log4j.properties";
	public static final String configPropertyFilePath =".\\src\\main\\resources\\configfiles\\config.properties";
	public static final String chromeDriver_Key = "webdriver.chrome.driver";
	public static final String chromeDriver_Value = ".\\src\\main\\resources\\drivers\\chromedriver.exe";
	public static final String fireFoxDriver_Key = "webdriver.gecko.driver";
	public static final String fireFoxDriver_Value = ".\\src\\main\\resources\\drivers\\chromedriver.exe";	
	

	public String getBrowser();

	public String getWebSite();

	public String getUsername();

	public String getPassword();

	public int getPageLoadTimeOut();

	public int getImplcitWaitTime();

	public int getExplicitWaitTime();
	
	public int getPollingEveryInMiliSec();
	
	

}
