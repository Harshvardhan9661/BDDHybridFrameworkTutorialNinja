package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {
	public  Properties pro;
	public Readconfig()  {
		pro=new Properties();
		File fi=new File("src\\main\\java\\config\\config.properties");
		try {
		FileInputStream fi1=new FileInputStream(fi);
		pro.load(fi1);}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
	public String geturl() {
		return  pro.getProperty("url");
	}

}
