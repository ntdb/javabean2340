import java.util.ArrayList;

public class UserController {
	private ArrayList<User> users;
	
	public UserController()
	{
		users = new ArrayList<User>();
	}
	
	public User getUser(int userID)		//Limit permissions!
	{
		for(int i=0; i<users.size(); i++)
		{
			User user = (User)users.get(i);
			if(user.getUserID() == userID)
				return user;
		}
		return null;
	}
	
	public int getUserIndex(int userID)		//Limit permissions!
	{
		for(int i=0; i<users.size(); i++)
		{
			User user = (User)users.get(i);
			if(user.getUserID() == userID)
				return i;
		}
		return -1;
	}
	
	public int getUserPermissions(int userID)	//Limit permissions!
	{
		User user = (User)users.get(getUserIndex(userID));
		return user.getPermissions();
	}
	
	public void addUser(User userIn)		//Limit permissions!
	{
		users.add(userIn);
	}
	
	public void deleteUser(int userID)		//Limit permissions!
	{
		users.remove(getUserIndex(userID));
	}

	public int getNumberOfUsers()
	{
		return users.size();
	}

	public String toString()
	{
		return "UserController";
	}
}
