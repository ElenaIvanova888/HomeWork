package TLogger;

public class StdTestLogger extends TestLogger implements ITestLogger {


	@Override
	protected String vivodLog(String message) {
		System.out.print("LOG in console: "+ message);
		return message;
	}

	@Override
	public void dateformat() {
		System.out.print(" - "+dateFormat.format(date));
	}

	@Override
	public void threadName() {
		System.out.print(" Current thread:"+Thread.currentThread().getName());
	}

}
