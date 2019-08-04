package infrastrcutre.mapper;

public class UserNotFoundException extends Exception{
	private String meassage;


	public UserNotFoundException(String message){
		super(message);
	}
}
