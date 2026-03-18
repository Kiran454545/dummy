package options;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenink {

	public static void main(String[] args) throws IOException 
	{
		
		//1.Need to get href value of all links
		//2.Need to hit the url and take status code
		//3.Need to check if status code value is >400
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total links present on page:"+ links.size());// Here we are getting no of links present on page
		
		
		int noofbrokenlinks=0;
		for(WebElement linkelement:links)
		{
			String hrefvalue=linkelement.getAttribute("href");// we are getting href values of all links
			
			if(hrefvalue==null || hrefvalue.isEmpty())
			{
				System.out.println("Href value is empty no action can be performed."); // this condition will take care of empty links
				continue;
			}
			 
			
			try
			{
			URL linkURL=new URL(hrefvalue); //href value need to be converted as url form
			HttpURLConnection conn=(HttpURLConnection) linkURL.openConnection(); //connection is required to hit the url with server.
			conn.connect();//connect the server and sent request.
			
			if(conn.getResponseCode()>=400)
			{
				System.out.println(hrefvalue+":Link is broken");
				noofbrokenlinks++;
			}
			else
			{
				System.out.println(hrefvalue+":Links is not broken");
			}
			}
			catch(Exception e)
			{
				
			}
					
		} 
		System.out.println("no of broken links="+noofbrokenlinks);

	}

}
