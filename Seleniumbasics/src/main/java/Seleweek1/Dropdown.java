package Seleweek1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
WebElement dropdown= driver.findElement(By.xpath("//select[@id=\"single-input-field\"]"));

			Select  obj= new Select(dropdown);
			obj.selectByIndex(1); //select by using index value
			obj.selectByVisibleText("Yellow"); //select by using visible text 
			obj.selectByValue("Green");
			
			
			//to display the selected option
			WebElement display=obj.getFirstSelectedOption();  
			String  read = display.getText();
			System.out.println("The selected colour is" +read);
			
			//Multidropdwon 
			WebElement multidropdown= driver.findElement(By.id("multi-select-field"));
			Select multiObj= new Select(multidropdown);
			for(int i=0; i<3; i++)
			{
			
				multiObj.selectByIndex(i); 
				
			}
			
			
			List <WebElement> colours = multiObj.getAllSelectedOptions();
			
			for (int j=0;j<colours.size(); j++)
			{
				//String options=colours.get(j).getText();
								
				//System.out.println(options); can be called by this way also
				
				System.out.println(colours.get(j).getText());
				
				
			}
	}

}
