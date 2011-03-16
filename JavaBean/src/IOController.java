import java.io.IOException;
import java.io.Writer;
import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import com.thoughtworks.xstream.XStream;
import java.util.ArrayList;

public class IOController {
	
	/**
	 * This method takes in an ArrayList and writes its comments to an appropriately-named xml document
	 * @param arrIn The ArrayList to be written to xml
	 * @throws IOException
	 */
	public static void writeToXML(ArrayList arrIn) throws IOException {
		XStream xstream = new XStream();
		String filename = new String("");
		String xmlOut = xstream.toXML(arrIn);
		Writer writer = null;

		if(arrIn.size() > 0) {
			if(arrIn.get(0) instanceof User) {
				filename = new String("users.xml");
			}
			else {
				filename = new String("appointments.xml");
			}

			File file = new File(filename);			
			
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(xmlOut);
			writer.close();
		}
		else
			Hospital.LOGGER.warning("writeToXML called on empty ArrayList");
	}
	
	/**
	 * Deserializes an appropriate xml document and returns it as an ArrayList
	 * @param o An identifying object for selecting the correct xml document
	 * @return The requested ArrayList
	 * @throws IOException
	 */
	public static ArrayList getFromXML(Object o) throws IOException {
		XStream xstream = new XStream();
		String filename = new String("");
		
		if(o instanceof User) {
			filename = new String("users.xml");
		}
		else {
			filename = new String("appointments.xml");
		}

		if(new File(filename).exists()) {
			byte[] buffer = new byte[(int) new File(filename).length()];
			FileInputStream f = new FileInputStream(filename);
			f.read(buffer);
			ArrayList fromXML = (ArrayList) xstream.fromXML(new String(buffer));
			return fromXML;
		}
		else {
			return new ArrayList();
		}
	}
}
