package Handelingframeactionsandmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handelingwebtable {

	public static void main(String[] args) 
	{
      
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Find no of columns first using th tag
		int column=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size();
		System.out.println("No of columns equals to:" +column);
		
		int row=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
		System.out.println("No of rows equals to" +row);
		
		//Reading a sepecific element can be done by providing column and row index.  tr=row,td=column
		String bookname=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[3]//td[1]")).getText();
		System.out.println(bookname);
		
		//In order to read entire data we can use nested for loop using row and columns
		
		for(int r=2;r<=row;r++)
		{
			for(int c=1;c<=column;c++)
			{
				String value=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]")).getText();
				//while adding parameters in loop statement we need to add it in double quotation and with ++
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		driver.close();

		
	}

}
