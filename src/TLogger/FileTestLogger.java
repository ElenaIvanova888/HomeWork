package TLogger;
import java.io.*;

public class FileTestLogger extends TestLogger implements ITestLogger {
	@Override
	protected String vivodLog(String message) {
		try(FileWriter writer = new FileWriter("Text.txt", false))
		{
			writer.write("LOG in file: "+message+"  -   "+dateFormat.format(date));
			writer.flush();
		}
		catch(IOException ex){

			System.out.println(ex.getMessage());
		}
		return message;
	}

	@Override
	public void dateformat() {

	}
}
