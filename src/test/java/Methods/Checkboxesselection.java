package Methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxesselection {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class=\"form-check-input\"][@type=\"checkbox\"]"));
		
		//for(WebElement checkbox:checkboxes)
		//{
			//checkbox.click();
		//} ---with this all checkboxes can be selected.
		
		for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click(); //this is simple for loop by using this you can select required checboxes according to index.
		}

	}

}
