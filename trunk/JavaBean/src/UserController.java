import java.util.ArrayList;

public class UserController {
	ArrayList users;

	public UserController()
	{
		users = new ArrayList();
	}
	
	public User getUser(int userID)
	{
		return (User)users.get(userID);		//Assumes userID corresponds to index
	}
	
	public int getUserPermissions(int userID)
	{
		return getUser(userID).permissions;
	}
	
	public void addUser(User userIn)		//Limit permissions!
	{
		users.add(userIn);
	}
	
	public void deleteUser(int userID)
	{
		users.remove(userID);			//Assumes userID corresponds to index
	}

	public String toString()
	{
		return "UserController";
	}
}
