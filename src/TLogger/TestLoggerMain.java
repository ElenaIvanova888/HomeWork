package TLogger;

public class TestLoggerMain {
	public static void main(String[] args){

		StdTestLogger consoleLogger = new StdTestLogger();
		consoleLogger.vivodLog("gfdgfd");
		actions(consoleLogger);

		FileTestLogger fileLogger = new FileTestLogger();
		fileLogger.vivodLog("5gf5ff4");
	}
	public static void actions(ITestLogger iTestLogger){
		iTestLogger.dateformat();
		iTestLogger.threadName();
	}
}
