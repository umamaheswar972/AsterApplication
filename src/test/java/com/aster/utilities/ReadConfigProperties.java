package com.aster.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigProperties {
	Properties prop;

	public Properties loadProperties() throws IOException
	{
	prop = new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/config.properties");
	prop.load(fis);
	return prop;
	}
}
