package com.automation.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigureProperties {

	public static String readProperties(String key ) {
		Properties prop = new Properties();
		String val = "";
		try {
			FileInputStream fis = new FileInputStream(".//resources/config.properties");
			prop.load(fis);
			val = prop.getProperty(key);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return val;
	}
}
