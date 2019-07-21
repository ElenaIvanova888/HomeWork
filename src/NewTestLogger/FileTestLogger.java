package NewTestLogger;

import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;


public class FileTestLogger extends Date implements ITestLogger {
	String message;

	public FileTestLogger(String message){
		this.message = message;
	}

	@Override
	public void log() {

		try(FileWriter writer = new FileWriter("Text_New.txt", false))
		{
			writer.write("LOG in file: "+message+"  -   "+getTime());
			writer.flush();
		}
		catch(IOException ex){

			System.out.println(ex.getMessage());
		}
	}
	@Override
	public void threadCurrent(){
		String path = System.getProperty("user.dir")+"//Test_New.txt";
		try {
			FileWriter fw = new FileWriter(path, false);
			fw.write(" Thread"+Thread.currentThread().getName());
			fw.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}

