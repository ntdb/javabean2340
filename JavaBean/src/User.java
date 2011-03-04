
public abstract class User {
	protected String name;
	protected String password;
	protected int permissions;
	protected int userID;
	
	protected User()
	{
		name = null;
		password = null;
		permissions = 0;
		userID = 0;
	}
	
	protected User(String nameIn, String passwordIn, int permissionsIn, int userIDIn)
	{
		name = nameIn;
		password = passwordIn;
		permissions = permissionsIn;
		userID = userIDIn;
	}

	public int getUserID()
	{
		return userID;
	}

	public int getPermissions()
	{
		return permissions;
	}
}
