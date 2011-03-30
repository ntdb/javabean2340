package emr;

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
public class SysLog {
	
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
	 * Initialize the logger
	 */
	public static void initialize() {
		try {
			fileTxt = new FileHandler("log.txt", true);
			formatterTxt = new SimpleFormatter();
			fileTxt.setFormatter(formatterTxt);
			LOGGER.addHandler(fileTxt);
		} catch(IOException e) {
			System.out.print("LOGGER BROKEN RUN FOR YOUR LIVES!");
		}
	}
}