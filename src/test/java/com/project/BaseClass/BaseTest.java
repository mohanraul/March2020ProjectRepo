package com.project.BaseClass;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseTest 
{
	public static FileInputStream fis;
	public static String projectPath=System.getProperty("user.dir");
	public static Properties e;
	
	
 public static void init() throws Exception
 {
	 fis=new FileInputStream(projectPath+"//src//test//resources//environment.properties");
	 e=new Properties();
	 e.load(fis);
	 String e1=e.getProperty("env");
	 System.out.println(e1);
	 
	 
 }
}
