package Handelingframeactionsandmethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handleflipkart {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Search box
        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
        searchBox.sendKeys("phone");

        // Wait for auto-suggestions to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[contains(@class,'_1sFryS')]//li")));

        // Get all suggestions
        List<WebElement> suggestions = driver.findElements(By.xpath("//ul[contains(@class,'_1sFryS')]//li"));

        // Loop through suggestions and click on the required one
        for (int i = 0; i < suggestions.size(); i++) {
            String text = suggestions.get(i).getText().trim();
            if (text.toLowerCase().contains("phone under 15000")) {
                System.out.println("Clicking on: " + text);
                suggestions.get(i).click();
                break;
            }
        }
        driver.close();
		
		
		

	}

}
