package infrastrcutre;

import infrastrcutre.Config.ConfigurationManager;
import infrastrcutre.webbdrivers.*;

public class WebDriverFactory implements IWebDriverFactory {

	@Override
	public IWebDriver create() {

			IWebDriver driver = null;
		try {
			String browserFromConfigEnvironment = ConfigurationManager.getInstance().getEnvironment();
			Environment env = Environment.valueOf(browserFromConfigEnvironment.toUpperCase());
			switch (env) {
				case LOCAL:
					System.out.println("Test env is local");
					break;
				case DEV:
					System.out.println("Test env is dev");
					break;
				case PROD:
					System.out.println("Test env is prod");
					break;
				default:
					System.err.println("Test env doesn`t set!");
					break;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		try {
			String browserFromConfigBrowser = ConfigurationManager.getInstance().getBrowser();
			Browsers browser = Browsers.valueOf(browserFromConfigBrowser.toUpperCase());
			switch (browser) {
				case EDGE:
					driver = new EdgeWebDriver();
					break;
				case CHROME:
					driver = new ChromeWebDriver();
					break;
				case SAFARI:
					driver = new SafariWebDriver();
					break;
				case FIREFOX:
					driver = new FireFoxWebDriver();
					break;
				default:
					System.out.println("Unsupported browser " + browser.name());
			}}

			catch (Exception newInform){
				newInform.printStackTrace();
			}
			return driver;

	}


}
