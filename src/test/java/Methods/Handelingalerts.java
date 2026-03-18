package Methods;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handelingalerts {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@onclick=\"jsAlert()\"]")).click();
		Alert myalert=driver.switchTo().alert();
		Thread.sleep(2000);
		
		myalert.getText();
		myalert.accept();
		
		driver.findElement(By.xpath("//*[@onclick=\"jsConfirm()\"]")).click();
		Alert dissalert=driver.switchTo().alert();
		Thread.sleep(1000);
		dissalert.dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@onclick=\"jsPrompt()\"]")).click();
		Alert myal=driver.switchTo().alert();
		Thread.sleep(1000);
		myal.sendKeys("kiran");
		myal.accept();
		Thread.sleep(1000);

		
		driver.close();
		
		

	}

}
