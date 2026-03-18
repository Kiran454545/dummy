package javascriptss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecut {

	public static void main(String[] args)
	{
		// It is mainly used when we get element intercepted exception even if our xpath is correct.
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement inputt=driver.findElement(By.xpath("//input[@id=\"name\"]"));
		
		js.executeScript("arguments[0].setAttribute('value','John')",inputt); // This we cau use when send keys method is not working.
		
		WebElement radd=driver.findElement(By.xpath("//input[@id=\"sunday\"]"));
		
		js.executeScript("arguments[0].click()", radd); //This we can use when click method is not working.

	}

}
