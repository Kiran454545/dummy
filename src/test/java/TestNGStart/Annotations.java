package TestNGStart;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations 
{
	@BeforeSuite
	void suitemethod() {
		System.out.println("This is before suite");
	}
	
	@AfterSuite
	void aftersuite()
	{
		System.out.println("This is after suite");
	}
	
	@AfterClass
	void afterclass()
	{
		System.out.println("This is afterclass");
	}
	
	@BeforeClass
	void Beforeclass()
	{
		System.out.println("This is Beforeclass");
	}
	
	@AfterTest
	void aftertest()
	{
		System.out.println("This is after test");
	}
	
	@BeforeTest
	void Beforeetest()
	{
		System.out.println("This is Before test");
	}
	
	@Test
	void test1()
	{
		System.out.println("This is test1");
	}
	
	@Test
	void test2()
	{
		System.out.println("This is test2");
	}

}
