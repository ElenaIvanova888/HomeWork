package infrastrcutre.mapper;
import java.util.List;

public interface LoadUsers {
	List<User> loadAll();
	User findUserById(int id) throws UserNotFoundException;

}
