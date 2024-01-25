package com.generic_Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class File_Utility {

	@Test
	public static String  getPropertyValue(String key) throws IOException, InterruptedException {
			//Java Representation Object of external file
			FileInputStream fis= new FileInputStream("./src/test/resources/commonData/commonData.properties");
			
			//Class which is used to work on properties file
			Properties prop= new Properties();
			
			//To load all the keys in Properties class
			prop.load(fis);
			String Value = prop.getProperty(key);
			return Value;
			
	}
	
}