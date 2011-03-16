import java.io.IOException;

import java.util.logging.SimpleFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Hospital {
	
	public static final Logger LOGGER = Logger.getLogger(Hospital.class.getName());
	
	private static FileHandler fileTxt;
	
	private static SimpleFormatter formatterTxt;
	
	public static void main(String[] args) throws IOException {
		fileTxt = new FileHandler("log.txt", true);
		formatterTxt = new SimpleFormatter();
		fileTxt.setFormatter(formatterTxt);
		LOGGER.addHandler(fileTxt);

		UserController.load();
		Schedule.load();

		Nurse jenny = new Nurse();
		jenny.createPatient();

		UserController.save();
		Schedule.save();
	}
	
	public String toString() {
		return null;
	}
}
