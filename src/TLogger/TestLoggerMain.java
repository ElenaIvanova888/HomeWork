package TLogger;

public class TestLoggerMain {
	public static void main(String[] args){

		StdTestLogger consoleLogger = new StdTestLogger();
		consoleLogger.vivodLog("gfdgfd");
		consoleLogger.dateformat();

		FileTestLogger fileLogger = new FileTestLogger();
		fileLogger.vivodLog("5gf5ff4");
	}
}
