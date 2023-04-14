package com.datamanager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import com.base.Base;

public class Data_Properties extends Base {
	public WebDriver driver;
	public Properties prop = new Properties();
	String path =  System.getProperty("user.dir") + "\\ConfigFiles\\App.properties";

	public String getValueFromPropFile(String key) throws IOException {
		prop = new Properties();
		String path = System.getProperty("user.dir") + "\\ConfigFiles\\App.properties";
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		String value = prop.getProperty(key);
		System.out.print(value);
		return value;
	}
}
