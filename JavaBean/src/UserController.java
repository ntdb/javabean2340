
public class UserController {
	User[] users;
	int userIndex;
	
	public UserController()
	{
		users = new User[10];
		userIndex = 0;
	}
	
	public void addUser(User userIn)		//Limit permissions!
	{
		users[userIndex] = userIn;
		userIndex++;
	}
}
