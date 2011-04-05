package emr;
/* Hospital class, main class for Hospital System
 * Team Java Bean
 */

import java.io.IOException;

import java.util.logging.SimpleFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

/**
 * 
 * 
 * @author Team Java Bean
 * @version 1.1 3/14/11
 */
public class Hospital {
	
	/**
	 * Logger for logging purposes
	 */
	public static final Logger LOGGER = Logger.getLogger(Hospital.class.getName());
	
	/**
	 * File Handler for dealing with file IO
	 */
	private static FileHandler fileTxt;
	
	/**
	 * Formatter for formatting text
	 */
	private static SimpleFormatter formatterTxt;
	
	/**
	 * Main method for execution
	 * 
	 * @param args Not used
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
/*		fileTxt = new FileHandler("log.txt", true);
		formatterTxt = new SimpleFormatter();
		fileTxt.setFormatter(formatterTxt);
		LOGGER.addHandler(fileTxt);
/*
		UserController.load();
		Schedule.load();
		
		//Commands?

		UserController.save();
		Schedule.save();
*/
	}
	
	/**
	 * Returns a String representation of the Hospital
	 * 
	 * @return A String representation of the Hospital
	 */
	public String toString() {
		return null;
	}
}
