import java.io.*;
import com.thoughtworks.xstream.*;
import java.util.ArrayList;

public class IOController {
	public static void writeToXML(ArrayList arrIn) throws IOException {
		XStream xstream = new XStream();
		String filename = new String("");
		String XMLOut = xstream.toXML(arrIn);
		Writer writer = null;

		if(arrIn.size() > 0) {
			if(arrIn.get(0) instanceof User)
				filename = new String("users.xml");
			else
				filename = new String("appointments.xml");

			File file = new File(filename);			
			
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(XMLOut);
			writer.close();
		}
		else
			Hospital.LOGGER.severe("writeToXML called on empty ArrayList");
	}
	
	public static ArrayList getFromXML(Object o) throws IOException {
		XStream xstream = new XStream();
		String filename = new String("");
		
		if(o instanceof User)
			filename = new String("users.xml");
		else
			filename = new String("appointments.xml");

		if(new File(filename).exists()) {
			byte[] buffer = new byte[(int) new File(filename).length()];
			FileInputStream f = new FileInputStream(filename);
			f.read(buffer);
			ArrayList fromXML = (ArrayList)xstream.fromXML(new String(buffer));
			return fromXML;
		}
		else {
			return new ArrayList();
		}
	}
}
