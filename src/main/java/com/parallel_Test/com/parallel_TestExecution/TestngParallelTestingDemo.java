package com.parallel_Test.com.parallel_TestExecution;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestngParallelTestingDemo {
	
	WebDriver driver = null;
	
	@Test(threadPoolSize = 1, invocationCount = 1)
	public void test1() {
		System.out.println("I am inside test  1  | " + Thread.currentThread().getId());
		
	/*	System.setProperty("webdriver.chrome.driver", "/Users/mamun79/Downloads/chromedriver");
		
		//String projectPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", projectPath + "/Users/mamun79/Downloads/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
		
		driver.close();
		
	}
	
	
	@Test
	public void test2() {
		System.out.println("I am inside test   2  | " + Thread.currentThread().getId());
		
		System.setProperty("webdriver.chrome.driver", "/Users/mamun79/Downloads/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("http://seleniumhq.com");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.close();
		
	}
	
	@Test
	public void test3() {
		
		System.out.println("I am inside test 3");
	}
	
	
	
	
	
	
	
	
	
	
	

}
