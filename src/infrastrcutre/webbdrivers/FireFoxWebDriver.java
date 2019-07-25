package infrastrcutre.webbdrivers;

public class FireFoxWebDriver implements IWebDriver {
	@Override
	public void open(String url) {
		System.out.println("FireFox open URL "+url);
	}

	@Override
	public void click() {
		System.out.println("Clicking element in FireFox");
	}

	@Override
	public void sendKeys(String sendKeys) {
		System.out.println("Enter value to FireFox: "+sendKeys);
	}
}
