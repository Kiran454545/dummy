package javascriptss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuppload {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=\"filesToUpload\"]")).sendKeys("\"C:\\Users\\Trellis\\Documents\\Objective 11.txt\\");
		
		if(driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li")).getText().equals("Objective 11.txt"))
		{
			System.out.println("File upload is done");
		}
		else
		{
			System.out.println("File upload is failed");
		}

	}

}
