import java.util.*;
import com.google.gson.Gson;
import com.thoughtworks.xstream.*;

public class Main {
	UserController uc = new UserController();
	
	public void main(String[] args)
	{
		XStream xstream = new XStream();
		uc.addUser(new Patient("Nathan Bailey", "password", 1, 1, "123-45-6789", new Date(616636800)));
		uc.addUser(new Patient());
		String ucXML = xstream.toXML(uc);
	}
}