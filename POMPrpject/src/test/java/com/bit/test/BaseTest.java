package com.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.db.ReadFile;

public class BaseTest {
	Properties prop;
	WebDriver driver;
	@Before
	public void start() throws IOException
	{
		 //run from command line
//		 String value=System.getProperty("browser");
//		 String r=System.getProperty("run");
//		 if(value.equals("chrome"))
//		 {
//			 if(r.equals("local"))
//			 {
//			 driver=new ChromeDriver();
//			 }
//			 else if(r.equals("remote"))
//			 {
//				 System.out.println("ran remotely");
//			 }
//		 }else if(value.equals("firefox"))
//		 {
//			 if(r.equals("local"))
//			 {
//				 driver=new FirefoxDriver();
//			 }
//			 else if(r.equals("remote"))
//			 {
//				 System.out.println("ran remotely");
//			 }
//			 
//		 }else if(value.equals("ie"))
//		 {
//			 if(r.equals("local"))
//			 {
//				 driver=new InternetExplorerDriver();
//			 }
//			 else if(r.equals("remote"))
//			 {
//				 System.out.println("ran remotely");
//			 }
//			
//		 }
//		driver.get("http://www.express.com");
		
	
		//from property file
		 prop=ReadFile.readPropFile("/Users/bittech/eclipse-workspace/POMPrpject/moga.properties");
		 String value1=prop.getProperty("browser");
		 String r1=prop.getProperty("run");
		 if(value1.equals("chrome"))
		 {
			 if(r1.equals("local"))
			 {
			 driver=new ChromeDriver();
			 }
			 else if(r1.equals("remote"))
			 {
				 System.out.println("ran remotely");
			 }
		 }else if(value1.equals("firefox"))
		 {
			 if(r1.equals("local"))
			 {
				 driver=new FirefoxDriver();
			 }
			 else if(r1.equals("remote"))
			 {
				 System.out.println("ran remotely");
			 }
			 
		 }else if(value1.equals("ie"))
		 {
			 if(r1.equals("local"))
			 {
				 driver=new InternetExplorerDriver();
			 }
			 else if(r1.equals("remote"))
			 {
				 System.out.println("ran remotely");
			 }
			
		 }
		 driver.get(prop.getProperty("url"));
	}

}
