package ie.gmit.ds.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
 
import ie.gmit.ds.representations.User; 

public class UserDB {
	
	public static HashMap<Integer, User> users = new HashMap<>();
	static {
		users.put(1, new User(1, "Hillary", "Hillaryous@gmail.com", "hashhhhh", "sfsfs654"));
		users.put(2, new User(4, "Jim", "Gym@gmail.com", "hashhthh", "sfyus654"));
		users.put(3, new User(8, "Paul", "APaulLing@gmail.com", "hasoohhh", "sfpks654"));
	}
	
	public static List<User> getUsers() {
		return new ArrayList<User>(users.values());
	}
	
	public static User getUser(Integer id) {
		return users.get(id);
	}
	
	public static void updateUser(Integer id, User user) {
		users.put(id, user);
	}
	
	public static void removeUser(Integer id) {
		users.remove(id);
	}
}
