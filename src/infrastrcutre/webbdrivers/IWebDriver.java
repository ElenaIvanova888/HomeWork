package infrastrcutre.webbdrivers;

import infrastrcutre.URLBuilder;

public interface IWebDriver {
	void open(URLBuilder creationURL);
	void click();
	void sendKeys(String sendKeys);
}
