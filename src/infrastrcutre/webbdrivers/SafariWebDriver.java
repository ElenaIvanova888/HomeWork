package infrastrcutre.webbdrivers;

public class SafariWebDriver implements IWebDriver {
	@Override
	public void open(String url) {
		System.out.println("Safari open URL "+url);
	}

	@Override
	public void click() {
		System.out.println("Clicking element in Safari");
	}

	@Override
	public void sendKeys(String sendKeys) {
		System.out.println("Enter value to Safari: "+sendKeys);
	}
}
