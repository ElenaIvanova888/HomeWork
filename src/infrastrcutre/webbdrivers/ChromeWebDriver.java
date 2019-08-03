package infrastrcutre.webbdrivers;

public class ChromeWebDriver implements IWebDriver{

	@Override
	public void open(String url) {
		System.out.println("Chrome open URL "+url);
	}

	@Override
	public void click() {
		System.out.println("Clicking element in Chrome");
	}

	@Override
	public void sendKeys(String sendKeys) {
		System.out.println("Enter value to Chrome: "+sendKeys);
	}
}
