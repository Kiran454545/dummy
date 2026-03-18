package Screenshotss;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshottss {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//fullpage screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		/*File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		//File targetfile=new File("C:\\Users\\Trellis\\eclipse-workspace\\Framework\\Screenshotfolder\\fullpage.png"); can directly write this
		File targetfile=new File(System.getProperty("user.dir")+"\\Screenshotfolder\\fullpage.png"); //This will make project location dynamic.
		sourcefile.renameTo(targetfile);*/
		
		WebElement takess=driver.findElement(By.xpath("//div[@class=\"column-right-inner\"]"));
		File sourcefile=takess.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\Screenshotfolder\\selectedpage.png");
		sourcefile.renameTo(targetfile);
		
	}

}
