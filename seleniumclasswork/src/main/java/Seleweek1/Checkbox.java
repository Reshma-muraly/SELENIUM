package Seleweek1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement Checkbox= driver.findElement(By.id("gridCheck"));
		//Checkbox.click();
		
		boolean checkbox1=Checkbox.isSelected();
		System.out.println("Checkbox checked"  + " "  +checkbox1);
		
		Checkbox.click();
		
		boolean uncheck= Checkbox.isSelected();
		System.out.println(" checkbox Unchecked" + " " + uncheck);
		Checkbox.click();
		
		driver.quit();
	}

}
