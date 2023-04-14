package com.datamanager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * This class provides methods to read values of keys from either app.properties
 * or sys.properties from "ConfigFiles" folder
 */
public class ConfigManager {
	private Properties properties = new Properties();
	private String configFileName;
	private Logger log = LogManager.getLogger("ConfigManager");
	private String fileSeperator = System.getProperty("file.separator");

	// The default constructor initializes and reads the key values from
	// sys.properties file
	public ConfigManager() {
		configFileName = "Sys";
	}

	// The parameterized constructor when supplied with "app" as configFile name
	// initializes and
	// reads the key values from app.properties
	public ConfigManager(String configname) {
		configFileName = configname;
	}

	/**
	 * Returns the value of given property from either sys.properties or
	 * app.properties file
	 * 
	 * @param key
	 *            - ConfigParamvalue that requires to be returned from
	 *            Config.properties file
	 * @return - return ConfigValue
	 */
	public String getProperty(String key) {
		String value = "";
		if (key != "") {
			loadProperties();
			try {
				if (!properties.getProperty(key).trim().isEmpty())
					value = properties.getProperty(key).trim();
			} catch (NullPointerException e) {
			}
		} else {
			log.error("key cannot be null.. ");
		}
		return value;
	}
	private void loadProperties() {
	    try {
	        String configFilePath = "ConfigFiles" + fileSeperator + configFileName + ".properties";
	        FileInputStream inputStream = new FileInputStream(configFilePath);
	        properties.load(inputStream);
	    } catch (FileNotFoundException e) {
	        log.error("Configuration file not found", e);
	    } catch (IOException e) {
	        log.error("Error while loading configuration file", e);
	    }
	}
	
	

	
}
