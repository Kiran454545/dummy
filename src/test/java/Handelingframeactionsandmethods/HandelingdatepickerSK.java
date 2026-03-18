package Handelingframeactionsandmethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingdatepickerSK {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		//Find and click on calendar to load dates
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
		//Store the expected date and month in string form
		
		String Month="June";
		String Year="2027";
		String Date="19";
		
		//Pick the month and year xpaths from header
				
		//use while loop to select date as per requirement.
		
		while(true)
		{
			String currentmonth=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String currentyear=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
			
			if(currentmonth.equals(Month) && currentyear.equals(Year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
		}
		
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr//td//a"));
		
		for(WebElement dt:dates)
		{
			if(dt.getText().equals(Date))
			{
				dt.click();
				break;
			}
		}

	}

}
