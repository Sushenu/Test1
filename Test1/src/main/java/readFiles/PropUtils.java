package readFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtils {
	public String getValue(String filePath, String key) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File not found: " + filePath);
		}
		Properties property = new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			System.out.println("Unable to load properties file: " + filePath);
			e.printStackTrace();
		}
		return property.getProperty(key);
	}
}
