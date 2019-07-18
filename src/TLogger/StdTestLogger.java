package TLogger;

public class StdTestLogger extends TestLogger implements ITestLogger {

	@Override
	protected String vivodLog(String message) {
		System.out.println("LOG in console: "+ message);
		return message;
	}

	@Override
	public void dateformat() {
		System.out.println(dateFormat.format(date));
	}
}
