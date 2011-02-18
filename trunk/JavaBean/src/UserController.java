
public class UserController {
	User[] users;
	int userIndex;
	
	public UserController()
	{
		users = new User[10];
		userIndex = 0;
	}
	
	public User getUser(int userID)
	{
		return users[userID];				//Assumes ID corresponds to array
		//OR
		/*
		for(int i = 0; i<users.length; i++)
		{
			if(users[i].userID == userID)
				return users[i];
			else
				return null;
		}
		*/
	}
	
	public int getUserPermissions(int userID)
	{
		return getUser(userID).permissions;
	}
	
	public void addUser(User userIn)		//Limit permissions!
	{
		users[userIndex] = userIn;
		userIndex++;
	}
	
	public void deleteUser(int userID)
	{
		for(int i=userID; i<users.length-1; i++)	//Assumes ID corresponds to array
			users[i] = users[i+1];
		users[users.length-1] = null;
	}
}
