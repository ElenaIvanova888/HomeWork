package infrastrcutre.mapper;

import java.util.List;

public class User {
	private int id;
	private String email;
	private String name;

	public User(int id, String email, String name) {
		this.id = id;
		this.email = email;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", email='" + email + '\'' +
				", name='" + name + '\'' +
				'}';
	}
	public void selectUser(int number) {
		LoadUsers loadUsers = new loadUsersFromCSV();
		User user = null;
		try {
			user = loadUsers.findUserById(number);
		} catch (UserNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(user);
	}

}

