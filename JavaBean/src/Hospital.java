import java.io.*;
import java.util.*;
import com.google.gson.Gson;

public class Hospital {
	UserController uc = new UserController();
	
	public void Main(String[] args) throws IOException
	{
		uc.addUser(new Patient("Nathan Bailey", "password", 1, 1, "123-45-6789", new Date(616636800)));
		uc.addUser(new Patient());
		IOController.writeToXML(uc);
	}
}