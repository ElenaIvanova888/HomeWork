package infrastrcutre.webbdrivers;

public class EdgeWebDriver implements IWebDriver {
	@Override
	public void open(String url) {
		System.out.println("Edge open URL "+url);
	}

	@Override
	public void click() {
		System.out.println("Clicking element in Edge");
	}

	@Override
	public void sendKeys(String sendKeys) {
		System.out.println("Enter value to Edge: "+sendKeys);
	}
}
