package Seleweek1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiTabHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		String parentwindow= driver.getWindowHandle(); //to get the id's of single window handles
		WebElement tab=driver.findElement(By.id("tabButton"));
		tab.click();
		Set<String> allWindows=driver.getWindowHandles(); //to get the id's of multiple window handles 
		
		for (String childwindow:allWindows) //itereationfor
		{
			if(!parentwindow.equals(childwindow))
			{
				driver.switchTo().window(childwindow);
				System.out.println(childwindow);
				WebElement newtab=driver.findElement(By.id("sampleHeading"));
				System.out.println(newtab.getText());
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));  //implicitwait
				
				WebElement username=driver.findElement(By.id("loginform-username"));
				//fluentwait
				Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
			            .withTimeout(Duration.ofSeconds(10))
			            .pollingEvery(Duration.ofSeconds(2))
			            .ignoring(NoSuchElementException.class);
				
				//fluentWait.until(ExpectedConditions.alertIsPresent());
				
				fluentWait.until(ExpectedConditions.attributeToBe(username, "class", "form-control"));
				
				username.sendKeys("username");
				
				
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
				wait.until(ExpectedConditions.elementToBeClickable(username));
			}
		}
	driver.switchTo().window(parentwindow); //switching from parent to child tab	
		
		
	}

}
