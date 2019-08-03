package infrastrcutre;

import infrastrcutre.webbdrivers.IWebDriver;

public class WebDriverMain {
	public static void main(String[] args){
		WebDriverFactory webDriverFactory = new WebDriverFactory();
		IWebDriver driver = webDriverFactory.create();


		driver.open("https://www.google.com/");
		driver.sendKeys("Selenium");
		driver.click();

	}
}
