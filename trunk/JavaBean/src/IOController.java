import java.io.*;
import com.thoughtworks.xstream.*;

public class IOController {
	public static void writeToXML(Object obj) throws IOException
	{
		XStream xstream = new XStream();
		String XMLOut = xstream.toXML(obj);
		
		Writer writer = null;
		File file = new File("write.txt"); //obj + ".XML");
		writer = new BufferedWriter(new FileWriter(file));
		writer.write(XMLOut);
	}
	
	public static Object getFromXML(Object obj)
	{
		XStream xstream = new XStream();
		
		Object fromXML = xstream.fromXML("write.txt"); //obj + ".XML");
		return fromXML;
	}
}
