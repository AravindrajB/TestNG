package org.automate.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityFile {

	public static String getBrowser(String key) throws IOException

	{
		File file = new File("D:\\Eclipse_Workspace\\SeleniumTestNG\\Config\\browser.properties");

		FileInputStream fileinputstream = new FileInputStream(file);

		Properties property = new Properties();

		property.load(fileinputstream);

		Object object = property.get(key);

		return object.toString();
	}

	public static String getURL(String key) throws IOException

	{
		File file = new File("D:\\Eclipse_Workspace\\SeleniumTestNG\\Config\\browser.properties");

		FileInputStream fileinputstream = new FileInputStream(file);

		Properties property = new Properties();

		property.load(fileinputstream);

		Object object = property.get(key);

		return object.toString();
	}

	public static String getXpath(String key) throws IOException

	{
		File file = new File("D:\\Eclipse_Workspace\\SeleniumTestNG\\Config\\xpath.properties");

		FileInputStream fileinputstream = new FileInputStream(file);

		Properties property = new Properties();

		property.load(fileinputstream);

		Object object = property.get(key);

		return object.toString();

	}
	
	public static String getXpathValues(String key) throws IOException

	{
		File file = new File("D:\\Eclipse_Workspace\\SeleniumTestNG\\Config\\xpathValues.properties");

		FileInputStream fileinputstream = new FileInputStream(file);

		Properties property = new Properties();

		property.load(fileinputstream);

		Object object = property.get(key);

		return object.toString();

	}
	
	public static String getConditions(String key) throws IOException
	
	{
		File file = new File("D:\\Eclipse_Workspace\\SeleniumTestNG\\Config\\ExpectedConditions.properties");

		FileInputStream fileinputstream = new FileInputStream(file);

		Properties property = new Properties();

		property.load(fileinputstream);

		Object object = property.get(key);

		return object.toString();
	}
}
