package Seleweek1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		//tagName[@attribute='attributeValue']
		//WebElement User= driver.findElement(By.xpath("//*[@id=\"loginform-username\"]")); copied directly from the Console
		
		
		WebElement UserName= driver.findElement(By.xpath("//input[@id='loginform-username']"));
	//declared web element by using xpath
		UserName.sendKeys("name");
		
		WebElement Password=driver.findElement(By.id("loginform-password"));
		Password.sendKeys("pass");
		
		WebElement Login=driver.findElement(By.xpath("//button[text()='Login']"));
		//UserName.clear();
		//toclear the field
		//Login.click();	
		WebElement check=driver.findElement(By.xpath("//input[@id=\'loginform-rememberme\']"));
		check.click();
		
	/* TO GET STYLES
	 * 
	 * String fontsize=Login.getCssValue("font-size");
	System.out.println(fontsize);
	
	String family= Login.getCssValue("font-family");
	System.out.println(family);
	
	String test= Login.getCssValue("text-transform");
	System.out.println(test);
	
	*/
	
		/*
		String att= Login.getAttribute("class");
		System.out.println(att);
		
		String usn=UserName.getAttribute("placeholder");
		System.out.println(usn);
		
		String tag=UserName.getTagName();
		System.out.println(tag);
		
		String tag1= Password.getTagName();
		System.out.println(tag1);
		
		String tag2= Login.getTagName();
		System.out.println(tag2);
		*/
		
		String text= Login.getText();
		System.out.println(text);
		
		
	   driver.quit();
	
	
	}

	
	
}
