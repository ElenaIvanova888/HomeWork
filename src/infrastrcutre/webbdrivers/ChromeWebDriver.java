package infrastrcutre.webbdrivers;

import infrastrcutre.URLBuilder;
import infrastrcutre.mapper.LoadUsers;
import infrastrcutre.mapper.User;
import infrastrcutre.mapper.UserNotFoundException;
import infrastrcutre.mapper.loadUsersFromCSV;

import java.util.List;

public class ChromeWebDriver implements IWebDriver{

	@Override
	public void open(URLBuilder creationURL) {
		System.out.println("Chrome open URL "+creationURL);
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
