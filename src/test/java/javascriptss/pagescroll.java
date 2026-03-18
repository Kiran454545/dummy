package javascriptss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagescroll {

	public static void main(String[] args) 
	{
	    //scrollbar is not webelement so we cannot locate it we can do it using javascriptexecutor.
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//1.Scroll till provided pixels
		//js.executeScript("window.scrollBy(0,1600)", "");
         //System.out.println(js.executeScript("return window.pageYoffset",""));	
		
		//2.Scroll till element is visible
		//WebElement ele=driver.findElement(By.xpath("//table[@name=\"BookTable\"]"));
		//js.executeScript("arguments[0].scrollIntoView();", ele); 
       // System.out.println(js.executeScript("return window.pageYOffset",""));
		
		//3.Scroll till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    System.out.println(js.executeScript("return window.pageYOffset",""));
	    
	    //4.scroll to the top you just need to add - infront of document
	    js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
			
		

	}

}
