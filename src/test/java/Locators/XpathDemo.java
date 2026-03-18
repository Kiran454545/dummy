package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathDemo {

	public static void main(String[] args) throws InterruptedException 
	{
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.nopcommerce.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(1000);
	   
	   //driver.findElement(By.xpath("//img[@class=\"slider-img\"]")).click();
	   //----Below is example of multiple attributes in a single xpath in order to make it more reliable.
	   driver.findElement(By.xpath("//input[@id=\"small-searchterms\"][@placeholder=\"Search store\"]")).sendKeys("tshirt");
	   //We can write the above xpath using and operator //input[@id="small-searchterms" and @placeholder="Search store"]
	   
	  String value= driver.findElement(By.xpath("//strong[text()='News']")).getText();
	  System.out.println(value);
	  Boolean b=driver.findElement(By.xpath("//img[@alt=\"Picture for category Apparel\"]")).isDisplayed();
	  System.out.println(b);
	  Thread.sleep(1000);
	  driver.close();
	   
	   

	}

}
