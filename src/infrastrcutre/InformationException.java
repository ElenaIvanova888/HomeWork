package infrastrcutre;

public class InformationException extends Exception {
	private static final String EXCEPTION_WITH_ENTERED_DATA = "Issue with entered data";
	public InformationException(){
		super(EXCEPTION_WITH_ENTERED_DATA);
	}
	public InformationException(String message){
		super(message);
	}

}
