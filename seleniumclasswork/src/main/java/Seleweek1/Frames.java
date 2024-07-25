package Seleweek1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
	
	//switchbyname or id
		//driver.switchTo().frame("frame1"); //switch to frames
		WebElement iframe=driver.findElement(By.id("frame1"));//Switch by webelement
		driver.switchTo().frame(iframe);
		WebElement frames=driver.findElement(By.id("//*[@id=\"sampleHeading\"]"));
	frames.click();
	System.out.println(frames.getText()); 
	driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent(); used for back from parent frame
		
	}

}
