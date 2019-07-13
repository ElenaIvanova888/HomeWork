package OOP;

public class SingeltonNumber {
	private static SingeltonNumber instance = new SingeltonNumber();

	private volatile int next = 0;
	private SingeltonNumber(){

	}

	public static SingeltonNumber getInstance(){
		if (instance == null){
			return  instance = new
					SingeltonNumber();
		}
		return  instance;
	}

	public synchronized int getNextSequence(){
		return next++;
	}
}
