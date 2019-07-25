package infrastrcutre.webbdrivers;

public interface IWebDriver {
	void open(String url);
	void click();
	void sendKeys(String sendKeys);
}
