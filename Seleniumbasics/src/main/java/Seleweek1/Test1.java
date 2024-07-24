package Seleweek1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.getTitle();
	
	driver.manage().window().maximize();
		WebElement inputfield1= driver.findElement(By.xpath("//*[@id=\"single-input-field\"]"));
		 System.out.println("get page title");
	driver.quit();
	}

}
