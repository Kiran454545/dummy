package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//String act_title= driver.getTitle();
		//System.out.println("The actual title is: " + act_title);
		driver.findElement(By.className("Pke_EE")).sendKeys("iphone15");
		
		//finding element using link
		//driver.findElement(By.linkText("Mobile")).click();
		//If you use partial link text then you can provide only partial portion but it overlaps majority of the time so we dont prefer.
		//Thread.sleep(5000);
		
		List <WebElement> footerlinks=driver.findElements(By.className("_2HvN4k"));
		System.out.println("No of links present are"+ "  " + footerlinks.size());
		
		List <WebElement> img=driver.findElements(By.tagName("img"));
		System.out.println("No of links present are"+ "  " + img.size());
		
		//List <WebElement> footerlinks=driver.findElements(By.tagName("a"));
		driver.close();
		
		


	}

}
