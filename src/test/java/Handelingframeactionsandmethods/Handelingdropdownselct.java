package Handelingframeactionsandmethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handelingdropdownselct {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id=\"country\"]"));
		Select droplist=new Select(dropdown);
		
		droplist.selectByVisibleText("Japan");
		
		//To capture multiple webelements
		List<WebElement> optionss=droplist.getOptions();
		System.out.println(optionss.size());
		
		for(int i=0;i<optionss.size();i++)
		{
			System.out.println(optionss.get(i).getText());
		}

	}

}
