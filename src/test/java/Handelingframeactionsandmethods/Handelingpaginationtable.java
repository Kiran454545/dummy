package Handelingframeactionsandmethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handelingpaginationtable {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        // ✅ Switch to iframe containing the table
        driver.switchTo().frame("frame-one1434677811");
        
     // ✅ Find total number of pagination pages
        List<WebElement> pages = driver.findElements(By.xpath("//div[@id='pagination']//a"));
        int totalPages = pages.size();
        System.out.println("Total Pages: " + totalPages);

        // ✅ Loop through all pagination pages
        for (int i = 1; i <= totalPages; i++) {
            System.out.println("----- Page " + i + " -----");

            // Wait briefly to allow table to load
            Thread.sleep(1000);

            // ✅ Get all rows (excluding header)
            List<WebElement> rows = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr"));
            
            for (WebElement row : rows) {
                String id = row.findElement(By.xpath("td[1]")).getText();
                String name = row.findElement(By.xpath("td[2]")).getText();
                String price = row.findElement(By.xpath("td[3]")).getText();

                System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price);

                // ✅ Click checkbox if not already selected
                WebElement checkbox = row.findElement(By.xpath("td[4]/input[@type='checkbox']"));
                if (!checkbox.isSelected()) {
                    checkbox.click();
                }
            }
            
         // ✅ Click next page (only if not on the last page)
            if (i < totalPages) {
                WebElement nextPage = driver.findElement(By.xpath("//div[@id='pagination']//a[text()='" + (i + 1) + "']"));
                nextPage.click();
            }
        }

         driver.quit();




	}

}
