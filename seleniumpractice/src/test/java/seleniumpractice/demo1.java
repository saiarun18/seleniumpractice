package seleniumpractice;

import org.testng.annotations.Test;

import listeners.RetryAnalyzer;


public class demo1 {
	
	@Test
	void m1()
	{                
		System.out.println("hello");
	}
	@Test(retryAnalyzer=listeners.RetryAnalyzer.class)
	void m2()
	{
		int i=10/0;                 
		System.out.println("hello");
	}
	@Test
	void m3()
	{
		int i=10/0;                 
		System.out.println("hello");
	}
	
}
