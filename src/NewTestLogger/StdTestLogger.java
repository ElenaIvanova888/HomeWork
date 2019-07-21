package NewTestLogger;

import java.util.Date;

public class StdTestLogger extends Date implements ITestLogger {

	String message;

	public StdTestLogger(String message){
		this.message = message;
	}

	@Override
	public void log() {
		System.out.print("Log in console: "+message+" "+getTime());
	}

	@Override
	public void threadCurrent(){
		System.out.print(" Thread: "+ Thread.currentThread().getName());
	}
}
