package Seleweek1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\reshma.s02\\OneDrive - SIMPLIFY3X SOFTWARE PRIVATE LIMITED\\Desktop\\JAVA FILES\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	//driver.get("https://www.google.com/"); //wait page until load

	driver.navigate().to("https://www.google.com/"); //will not wait until page load
	
	String title= driver.getTitle(); 	
	//to get the title of the browser
	System.out.println(title);
	
	String url= driver.getCurrentUrl();		
	//to get the current url
	System.out.println(url);
	
	driver.manage().window().maximize();	 
	//to maximize the window
	
	driver.manage().window().minimize(); 	
	//to minimize the window
		
	//String src= driver.getPageSource(); 	 
	//to get the page source
	//System.out.println(src);
	
	driver.navigate().back();
	driver.navigate().refresh();
	driver.navigate().forward();
	//driver.quit();
	//driver.close();
	
	
	}

}
