import java.io.*;
import java.util.*;

public class Hospital {
	private static UserController uc;
	
	public static void main(String[] args) throws IOException
	{
		uc = (UserController)IOController.getFromXML(new UserController());
//		uc.addUser(new Patient("Nathan Bailey", "password", 1, 1, "123-45-6789", new Date(616636800)));
//		uc.addUser(new Patient("Jonathan Smith", "password2", 1, 1, "987-65-4321", new Date(555555555)));
		uc.deleteUser(0);
		IOController.writeToXML(uc);
	}
}
