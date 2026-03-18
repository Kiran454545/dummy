package TestNGStart;

import org.testng.annotations.Test;

//open app
//login
//logout


public class testngbasic
{
	
	@Test(priority=0)
	void openapp()
	{
		System.out.println("Application opened");
	}
	
	@Test(priority=1)
	void login()
	{
		System.out.println("Application logged in");
	}
	
	@Test(priority=2)
	void logout()
	{
		System.out.println("Application logged out");
	}

}
