package task1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DBPropertiesUtil {
	
	private static Properties properties=new Properties();
	static {
		try {
			properties.load(new FileInputStream("resources/db.properties"));
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static String getProperty(String key) {
		return properties.getProperty(key);
	}

}
