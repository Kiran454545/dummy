package Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {

	public static void main(String[] args) throws InterruptedException 
	{
		// Need to declare right after driver initialization and then use
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10)); //Declaring explicit wait
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		driver.manage().window().maximize();	
		WebElement textusername=mywait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//input[@placeholder=\"Password\"]"))));
		textusername.sendKeys("kiran");
		Thread.sleep(2000);
		driver.close();
		
		
		


	}

}
