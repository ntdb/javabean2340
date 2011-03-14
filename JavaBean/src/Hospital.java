import java.io.*;		//Slim down later
import java.util.*;		//Slim down later
import java.util.logging.*;	//Slim down later

public class Hospital {
	private final static Logger LOGGER = Logger.getLogger(Hospital.class.getName());
	private static FileHandler fileTxt;
	private static SimpleFormatter formatterTxt;

	private static UserController uc;		//Make private later?
	private static Schedule sc;			//Make private later?
	
	public void Hospital() throws IOException
	{
		fileTxt = new FileHandler("log.txt");
		formatterTxt = new SimpleFormatter();
		fileTxt.setFormatter(formatterTxt);
		LOGGER.addHandler(fileTxt);

		readRecords();
	}

	public static void main(String[] args) throws IOException
	{
		readRecords();
		LOGGER.info("Records read successfully");
		
//		Nurse jenny = new Nurse(uc);
//		jenny.createPatient(5,1);

//		uc.deleteUser(5);

//		uc.addUser(new Patient("Nathan Bailey", "password", 1, 0, "123-45-6789", new Date(616636800)));
//		uc.addUser(new Patient("Jonathan Smith", "password2", 1, 1, "987-65-4321", new Date(555555555)));
//		uc.deleteUser(1);

		writeRecords();
		LOGGER.info("Records written successfully");	
	}

	public static Nurse newNurse()
	{
		return new Nurse(uc,sc);
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
