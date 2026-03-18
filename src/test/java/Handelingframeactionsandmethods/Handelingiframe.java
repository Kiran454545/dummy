package Handelingframeactionsandmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handelingiframe {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//Frame1
		WebElement framess=driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));//find xpath of frame
		driver.switchTo().frame(framess);// pass it as a webelement while switching
		driver.findElement(By.xpath("//*[@name=\"mytext1\"]")).sendKeys("Kiran");
		
		driver.switchTo().defaultContent();//This we need to use before switching to new frame
		//frame2
		WebElement frame2=driver.findElement(By.xpath("//*[@src=\"frame_2.html\"]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//*[@name=\"mytext2\"]")).sendKeys("Welcome Boss");
		driver.switchTo().defaultContent();//This is to switch to default.
		
		//frame3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//*[@name=\"mytext3\"]")).sendKeys("innerframeswitch");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		

	}

}
