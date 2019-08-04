package infrastrcutre.Config;

public class ConfigurationManager {
	private static ConfigurationManager instance;
	private String browser="chrome";
	private String environment = "prod";

	private ConfigurationManager(){

	}
	public static ConfigurationManager getInstance(){
		if(instance == null){
			return instance = new ConfigurationManager();
		}
		return instance;
	}

	public String getBrowser(){
		return System.getProperty("browser".toLowerCase(), browser.toLowerCase());
	}
	public String getEnvironment(){
		return System.getProperty("environment".toLowerCase(),environment.toLowerCase());
	}

}
