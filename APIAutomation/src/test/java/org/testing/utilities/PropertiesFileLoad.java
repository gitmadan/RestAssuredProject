package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//code to Load the properties File

public class PropertiesFileLoad {
	
	//it will return the object of properties class

	public static Properties propertiesFile() throws IOException
	{
		File f=new File("../APIAutomation/EnvironmentProperties");
		FileInputStream fi=new FileInputStream(f);
		Properties pr=new Properties();
		pr.load(fi);
		return pr;
	}
}
