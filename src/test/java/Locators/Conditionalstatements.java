package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalstatements {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		boolean b=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]")).isDisplayed();
		System.out.println(b);
		WebElement c=driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
		c.click();
		Thread.sleep(1000);
        System.out.println(c.isSelected());
		driver.close();


	}

}
