package Seleweek1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		driver.manage().window().maximize();
		WebElement alertbutton= driver.findElement(By.xpath("//button['class@btn btn-primary']"));
		alertbutton.click();
		// driver.switchTo().alert().accept(); 
		Alert alert = driver.switchTo().alert(); 
		alertbutton.click();
		Thread.sleep(500);
		alertbutton.sendKeys("ALERT");
		Thread.sleep(500);
		alert.accept();	
		
	}

}
