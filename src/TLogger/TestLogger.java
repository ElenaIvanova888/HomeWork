package TLogger;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class TestLogger{

	private String message;

	protected abstract String vivodLog(String message);

	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
}
