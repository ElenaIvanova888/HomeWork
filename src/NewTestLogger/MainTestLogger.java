package NewTestLogger;

public class MainTestLogger {
	public static void main(String[] args){
		StdTestLogger stdTestLogger = new StdTestLogger("fdsfsdfds");
		stdTestLogger.log();
		stdTestLogger.threadCurrent();

		FileTestLogger fileTestLogger = new FileTestLogger("fdsfsfsd");
		fileTestLogger.log();
		fileTestLogger.threadCurrent();
	}

}
