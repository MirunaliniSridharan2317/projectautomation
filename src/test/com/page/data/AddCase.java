package resources;

public class AddCase 
{
	private ConfigManager appData = new ConfigManager("App");
	public final String openCartURL = appData.getProperty("App.URL");


}
