package com.utilities;

import com.datamanager.ConfigManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UtilityMethods {
	private static ConfigManager sys = new ConfigManager();
	private static Logger log = LogManager.getLogger("UtilityMethods");
	private static String fileSeperator = System.getProperty("file.separator");
	private static Thread thread;
	public static int getWaitTime(String WaitType)
	{
		int iSecondsToWait = 15;
		String wait;
		if(WaitType!=null&&!WaitType.equalsIgnoreCase(""))
		{
			wait = sys.getProperty(WaitType);
		}
		else
		{
			log.error("WaitType cannot be empty...defaulting to MEDIUM WAIT");
			wait = sys.getProperty("WAIT.MEDIUM");
		}
		try
		{
			iSecondsToWait = Integer.parseInt(wait);
		}
		catch(NumberFormatException e)
		{
			log.error("Please check the config file. Wait values must be a number...defaulting to 15 seconds");
		} 		
		return iSecondsToWait;		
	}


}
