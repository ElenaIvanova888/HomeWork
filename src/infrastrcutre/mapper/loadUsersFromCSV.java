package infrastrcutre.mapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class loadUsersFromCSV implements LoadUsers{
	List<User> userList = new ArrayList<>();

	@Override
	public List<User> loadAll() {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("/Users/lekamilena/Desktop/HomeWork/src/user.csv"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while(scanner.hasNext()){
			String row = scanner.next();
			String[] columns = row.split(",");
			int id = Integer.parseInt(columns[0]);
			String email = columns[1];
			String firstName = columns[2];

			User user = new User(id,email,firstName);
			userList.add(user);
		}
		return userList;
	}

	@Override
	public User findUserById(int id) throws UserNotFoundException{
		for(User user: userList){
			if(user.getId() == id){
				return user;
			}
		}
		throw new UserNotFoundException("User with id "+id+" not found");
	}
}
