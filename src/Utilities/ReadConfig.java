package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties pro;

	public ReadConfig() {
		FileInputStream file;
		try {
			file = new FileInputStream(
					"C:\\Users\\poona\\eclipse-workspace\\LearnSelenium\\src\\Utilities\\config.properties");
			pro = new Properties();
			pro.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getApplicationURL() {
		String url = pro.getProperty("baseurl");
		return url;
	}

	public String getUserName() {
		String user = pro.getProperty("username");
		return user;
	}

	public String getPassword() {
		String pass = pro.getProperty("password");
		return pass;
	}

	public String getChropath() {
		String path = pro.getProperty("chromepath");
		return path;
	}

}
