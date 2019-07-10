package Config;

public class ConfigurationManager {
	private static ConfigurationManager instance;
	private String browser = "chrome";
	private String environment = "dev";
	private String baseURL = "url";

	private volatile int next = 0;

	private ConfigurationManager(){

	}
	public static ConfigurationManager getInstance(){
		if (instance == null){
			return  instance = new
					ConfigurationManager();
		}
		return  instance;
	}
	public String getBrowser(){
		return System.getProperty("browser".toLowerCase(), browser.toLowerCase());
	}
	public String getEnvironment(){
		return System.getProperty("environment".toLowerCase(),environment.toLowerCase());
	}
	public String getBaseURL(){
		return System.getProperty("baseURL".toLowerCase(),baseURL.toLowerCase());
	}
	public synchronized int getNextSequence(){
		return next++;
	}
}
