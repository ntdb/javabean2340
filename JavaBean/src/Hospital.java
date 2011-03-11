import java.io.*;
import java.util.*;

public class Hospital {
	public static UserController uc;		//Make private later?
	public static Schedule sc;			//Make private later?
	
	public void Hospital() throws IOException
	{
		readRecords();
	}

	public static void main(String[] args) throws IOException
	{
		readRecords();
		
//		uc.addUser(new Patient("Nathan Bailey", "password", 1, 0, "123-45-6789", new Date(616636800)));
//		uc.addUser(new Patient("Jonathan Smith", "password2", 1, 1, "987-65-4321", new Date(555555555)));
//		uc.deleteUser(1);

		writeRecords();		
	}

	public static void readRecords() throws IOException		//Make private later?
	{
		uc = (UserController)IOController.getFromXML(new UserController());
		sc = (Schedule)IOController.getFromXML(new Schedule());
	}

	public static void writeRecords() throws IOException		//Make private later?
	{
		IOController.writeToXML(uc);
		IOController.writeToXML(sc);
	}
}
