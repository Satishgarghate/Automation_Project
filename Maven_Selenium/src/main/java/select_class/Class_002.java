package select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass_java.Base_Class;

public class Class_002 extends Base_Class {

	public static void main(String[] args) throws Exception {
		LaunchBrowser("chrome");
		Navigate_URL("https://www.jeevansathi.com/");
		
		Thread.sleep(3000);
		// Click on dropdown
		 WebElement dropdown = driver.findElement(By.xpath("//div[@id='relationshipBlock']"));
		dropdown.click();
		
		// locate all options
		List<WebElement> options = driver.findElements(By.xpath("//div[@id='relationshipOptions']/ul/li"));

		// Find out no of options
		System.out.println(options.size());
		
		// Choose one option from seven
		for(int i=0; i<7; i++) {
			if(options.get(i).getText().equalsIgnoreCase("Sister")) {
				options.get(i).click();
				
							
			}
			
		}
		
		// Capture selected option
		System.out.println("Selected option is:-"+dropdown.getAttribute("value"));
		

	}

}
