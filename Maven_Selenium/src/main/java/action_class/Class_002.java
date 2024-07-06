package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import BaseClass_java.Base_Class;

public class Class_002 extends Base_Class {

	public static void main(String[] args) throws Exception {
		
		LaunchBrowser("Chrome");
		Navigate_URL("https://www.flipkart.com/");
		take_screenshot("Flipkart_HomePage");
		
		// locate search box 
		driver.findElement(By.cssSelector("input.Pke_EE")).sendKeys("xyz");
		
		// Action class- double click
		Actions act = new Actions(driver);
		act.doubleClick(driver.findElement(By.cssSelector("input.Pke_EE"))).build().perform();


	}

}
