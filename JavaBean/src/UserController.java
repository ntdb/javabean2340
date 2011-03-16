import java.util.ArrayList;
import java.io.IOException;

public class UserController {

	private static ArrayList<User> users = new ArrayList<User>();
	
	public static User getUser(int userID) {
		
		for(int i=0; i<users.size(); i++) {
			User user = (User) users.get(i);
			if(user.getUserID() == userID)
				return user;
		}
		return null;
	}
	
	public static User getUser(String name){
		User user = null;
		
		for(int i = 0; i < users.size(); i++){
			if(users.get(i).getName().equalsIgnoreCase(name)){
				user = users.get(i);
				i = users.size();
			}//end if statement
		}//end for loop
		
		return user;
	}//end overloaded getUser method (look-up by name)
	
	public static int getUserIndex(int userID) {
		for(int i=0; i<users.size(); i++) {
			User user = (User) users.get(i);
			if(user.getUserID() == userID)
				return i;
		}
		return -1;
	}
	
/*	***** Using User ID to determine permissions *****
	public int getUserPermissions(int userID)	//Limit permissions!
	{
		User user = (User)users.get(getUserIndex(userID));
		return user.getPermissions();
	}
*/	
	public static void addUser(User userIn) {
		users.add(userIn);
	}
	
	public static void deleteUser(int userID) {
		users.remove(getUserIndex(userID));
	}

	public static int getUserCount() {
		return users.size();
	}

	public static void save() throws IOException {
		IOController.writeToXML(users);
	}

	public static void load() throws IOException {
		users = IOController.getFromXML(new Patient());
	}
}
