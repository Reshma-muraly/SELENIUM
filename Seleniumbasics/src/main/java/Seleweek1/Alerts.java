package Seleweek1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		
	WebElement alertbutton= driver.findElement(By.xpath("//div[@class='card-body']//button[@class='btn btn-success']"));
	alertbutton.click();
	// driver.switchTo().alert().accept();  //alerthandling
	
	 Alert alert = driver.switchTo().alert(); 
	
	String text=alert.getText(); //to get alert text
	System.out.println(text);
	Thread.sleep(1000); //wait
	alert.accept();
	
	
	//WebElement alertbutton1 = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
	//alertbutton1.click();
	
	//alert.dismiss();*//
	
	
	WebElement alertbutton2 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	
	alertbutton2.click();
	Thread.sleep(500);
	alertbutton2.sendKeys("ALERT");
	Thread.sleep(500);
	alert.accept();	
	
	
	
	}
	

}
