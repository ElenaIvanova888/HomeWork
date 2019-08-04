package infrastrcutre;
import infrastrcutre.mapper.User;
import infrastrcutre.mapper.LoadUsers;
import infrastrcutre.mapper.UserNotFoundException;
import infrastrcutre.mapper.loadUsersFromCSV;
import infrastrcutre.webbdrivers.IWebDriver;

import java.util.List;

public class WebDriverMain {
	public static void main(String[] args) throws UserNotFoundException {
		WebDriverFactory webDriverFactory = new WebDriverFactory();
		IWebDriver driver = webDriverFactory.create();

		LoadUsers loadUsers = new loadUsersFromCSV();
		loadUsers.loadAll();

		User generalUser = loadUsers.findUserById(2);
		URLBuilder url_creation1 = new URLBuilder("https://","local","8000","create","id");
		URLBuilder createWithAll = new URLBuilder.Builder().withProtocol("http://")	.withHost("local")
				.withPort("3412")
				.withPath("calculate-rate")
				.withParam("number_order").build();;

		driver.open(url_creation1);
		driver.open(createWithAll);
		driver.sendKeys("Selenium");
		driver.click();
		driver.sendKeys(generalUser.toString());
	}
}
