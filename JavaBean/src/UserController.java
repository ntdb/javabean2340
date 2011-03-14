import java.util.ArrayList;

public class UserController {

	private static ArrayList<User> users = new ArrayList<User>();
	
	public UserController()
	{
		users = new ArrayList<User>();
	}
	
	public static User getUser(int userID)		//Limit permissions!
	{
		
		for(int i=0; i<users.size(); i++)
		{
			User user = (User)users.get(i);
			if(user.getUserID() == userID)
				return user;
		}
		return null;
	}
	
	public static int getUserIndex(int userID)		//Limit permissions!
	{
		for(int i=0; i<users.size(); i++)
		{
			User user = (User)users.get(i);
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
	public static void addUser(User userIn)		//Limit permissions!
	{
		users.add(userIn);
	}
	
	public static void deleteUser(int userID)		//Limit permissions!
	{
		users.remove(getUserIndex(userID));
	}

	public static int getUserCount()
	{
		return users.size();
	}
/*
	public String toString()
	{
		return "UserController";
	}
*/	
	
}
