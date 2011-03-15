import java.io.*;
import java.util.*;
import java.util.logging.*;

public class Hospital {
	public final static Logger LOGGER = Logger.getLogger(Hospital.class.getName());
	private static FileHandler fileTxt;
	private static SimpleFormatter formatterTxt;
	
	public void Hospital() throws IOException
	{
		fileTxt = new FileHandler("log.txt");
		formatterTxt = new SimpleFormatter();
		fileTxt.setFormatter(formatterTxt);
		LOGGER.addHandler(fileTxt);
	}

	public static void main(String[] args) throws IOException
	{
		UserController.load();
		Schedule.load();

		Nurse jenny = new Nurse();
		jenny.createPatient();

		UserController.save();
		Schedule.save();
	}
}
