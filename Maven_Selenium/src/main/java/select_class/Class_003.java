package select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass_java.Base_Class;

public class Class_003 extends Base_Class {

	public static void main(String[] args) throws Exception {

		LaunchBrowser("chrome");
		Navigate_URL("https://www.jeevansathi.com/");
		
		Thread.sleep(3000);
		// Click on dropdown
		 WebElement dropdown = driver.findElement(By.xpath("//div[@id='relationshipBlock']"));
		dropdown.click();
		
		// Click brother
		driver.findElement(By.xpath("(//div[@id='relationshipOptions']//li)[4]")).click();
		
		System.out.println("Selected Option is:-"+dropdown.getAttribute("value"));
		
	}

}
