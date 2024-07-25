package Seleweek1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		
		//to read the table headers
		List <WebElement> tablename= driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr//th"));
		
		for (int i=0; i<tablename.size(); i++)
		{
			System.out.print(tablename.get(i).getText()+" ");
		}
		System.out.println();
		
	WebElement singleHrow =driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr//th[1]"));
//	System.out.println(singleHrow.getText()); //gettext() to print the value
	
	//to read the table content
	
	List<WebElement> row1data = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));
	
	for (int i=0; i<row1data.size() ; i++)
	{
		System.out.print(row1data.get(i).getText()+ " ");
	}
	
	
	
	
	driver.quit();
	
	}
	

}
