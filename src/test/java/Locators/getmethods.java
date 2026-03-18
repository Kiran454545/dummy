package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethods {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		System.out.println(driver.getTitle()); // It will print title
		System.out.println(driver.getCurrentUrl()); // It will print current url

		System.out.println(driver.getPageSource()); //It will show page source code
		String windowid=driver.getWindowHandle();
		System.out.println("WindowID=" +windowid);//It will get id of window
		driver.close();
		

	}

}
