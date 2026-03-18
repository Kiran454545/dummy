package Methods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationmthod {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//driver.navigate().to("https://demo.nopcommerce.com/");
		//System.out.println(driver.getCurrentUrl());
		//driver.navigate().back();
		//System.out.println(driver.getCurrentUrl());
		//driver.navigate().forward();
		//System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> Windowid=driver.getWindowHandles();
		
		for(String wind:Windowid)
		{
			String title=driver.switchTo().window(wind).getTitle();
			System.out.println(title);
			
			if(title.equals("Human Resources Management Software | OrangeHRM HR Software "))
			{
				driver.close();			}
		}

		
		
		
		driver.close();

	}

}
