package com.bobbibrown.helper;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bobbibrown.configreader.ConfigReader;

public class LoggerHelper {
	private static boolean root = false;

	@SuppressWarnings("rawtypes")
	public static Logger getLogger(Class  clazz)   {
		if (root) {

			return Logger.getLogger(clazz);
		} else {
			
			PropertyConfigurator.configure(ConfigReader.log4jPropertyFilePath);
			root = true;
			return Logger.getLogger(clazz);
		}
	}

}
