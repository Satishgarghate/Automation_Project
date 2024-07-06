package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseClass_java.Base_Class;

public class Class_001 extends Base_Class{

	public static void main(String[] args) throws Exception {
		
	LaunchBrowser("Chrome");
	Navigate_URL("https://www.flipkart.com/");
	take_screenshot("Flipkart_HomePage");
	WebElement link = driver.findElement(By.xpath("//span[text()='Grocery']"));

	//Click on link
	Actions act = new Actions(driver);
	//act.click(link).build().perform();
	
	// locate fashion link- Fashion
	WebElement link_fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
	
	// Mouse Hower
	act.moveToElement(link_fashion).build().perform();
	take_screenshot("After Mouse Hower");
	Thread.sleep(3000);
	
	// mouse Hower Home &Furniture
	
	WebElement link_Home_Furniture = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
	act.moveToElement(link_Home_Furniture).build().perform();
	take_screenshot("Mouse Hower Home and Furniture");

	//driver.close();
	
	
	// Perform Right click
	act.moveToElement(link_Home_Furniture).contextClick().build().perform();
	
	
	
	
	

	}

}
