import java.io.*;
import com.thoughtworks.xstream.*;

public class IOController {
	public static void writeToXML(Object obj) throws IOException
	{
		XStream xstream = new XStream();
		String XMLOut = xstream.toXML(obj);
		Writer writer = null;
		File file = new File(obj + ".XML");
		writer = new BufferedWriter(new FileWriter(file));
//		FileWriter writer = new FileWriter(file);
		writer.write(XMLOut);
		writer.close();
		System.out.println(XMLOut);
	}
	
	public static Object getFromXML(Object obj) throws IOException
	{
		XStream xstream = new XStream();

		if(new File(obj + ".XML").exists())			//Checks if XML already exists
		{
			byte[] buffer = new byte[(int) new File(obj + ".XML").length()];
			FileInputStream f = new FileInputStream(obj + ".XML");
			f.read(buffer);
			if(obj instanceof UserController)
			{
				UserController fromXML = (UserController)xstream.fromXML(new String(buffer));
				return fromXML;
			}
		}
		else							//Returns new object if necessary
		{
			if(obj instanceof UserController)
				return new UserController();
		}
		return null;
	}
}
