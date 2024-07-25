package Seleweek1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		
		//to find a specific item from the table 
		List <WebElement> table= driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		WebElement element; 
		for (int i=0; i<table.size(); i++)
		{
			if(table.get(i).getText().equals("Brielle Williamson"))
			{
				String locator= "//table[@id='dtBasicExample']//tbody//tr[" + (i+1) + " ]//td[4]";
				element=driver.findElement(By.xpath(locator));
				System.out.println(element.getText());
			break;
			}
		}
			
		
	}


}
