package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssLocator {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//tagname#id combination css selector.
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("pants");
		
		//tag.classname combination css selector.
		//driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("t shirt");
		
		//tag[attribute="value"]
		//driver.findElement(By.cssSelector("input[autocomplete=\"off\"]")).sendKeys("tshirt");
		
		//tag.classname[attribute="value"]
		//driver.findElement(By.cssSelector("input.search-box-text[autocomplete=\"off\"]")).sendKeys("tshirt");
		
		//driver.findElement(By.xpath("(//a[normalize-space()='Electronics'])[1]")).click();
		
		driver.findElement(By.xpath("//a[@href='/apparel'][1]")).click(); //xpath with tagname and attribute.
		

	}

}
