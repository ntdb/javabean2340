/* UserController class for Hospital System
 * Team Java Bean
 */

import java.util.ArrayList;
import java.io.IOException;

/**
 * 
 * 
 * @author Team Java Bean
 * @version 1.1 3/14/11
 */
public class UserController {

	/**
	 * The List of Users currently using the system
	 */
	private static ArrayList<User> users = new ArrayList<User>();
	
	/**
	 * Returns a User with the given user ID
	 * 
	 * @param userID The ID of the User to find
	 * @return The found User
	 */
	public static User getUser(int userID) {
		
		for(int i=0; i < users.size(); i++) {
			User user = users.get(i);
			if(user.getUserID() == userID){
				return user;
			}
		}
		return null;
	}
	
	/**
	 * Returns a User by the given name
	 * 
	 * @param name The Name of the User to find
	 * @return The found User
	 */
	public static User getUser(String name){
		User user = null;
		
		for(int i = 0; i < users.size(); i++){
			if(users.get(i).getName().equalsIgnoreCase(name)){
				user = users.get(i);
				break;
			}//end if statement
		}//end for loop
		
		return user;
	}//end overloaded getUser method (look-up by name)
	
	/**
	 * Returns the index of a User by the given ID
	 * 
	 * @param userID The user ID of the User index to find
	 * @return The index of the found User
	 */
	public static int getUserIndex(int userID) {
		for(int i=0; i < users.size(); i++) {
			User user = users.get(i);
			if(user.getUserID() == userID){
				return i;
			}
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
	/**
	 * @param userIn
	 */
	public static void addUser(User userIn) {
		users.add(userIn);
	}
	
	/**
	 * @param userID
	 */
	public static void deleteUser(int userID) {
		users.remove(getUserIndex(userID));
	}

	/**
	 * Returns the count of the Users in the system
	 * 
	 * @return The User count
	 */
	public static int getUserCount() {
		return users.size();
	}

	/**
	 * @throws IOException
	 */
	public static void save() throws IOException {
		IOController.writeToXML(users);
	}

	/**
	 * @throws IOException
	 */
	public static void load() throws IOException {
		users = IOController.getFromXML(new Patient());
	}
}
