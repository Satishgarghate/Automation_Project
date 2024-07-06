package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseClass_java.Base_Class;

public class Class_009 extends Base_Class {

	public static void main(String[] args) throws Exception {

		LaunchBrowser("firefox");
		Navigate_URL("https://jqueryui.com/slider/");
		
		// to enter inside frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		// locate slider
		WebElement slider = driver.findElement(By.cssSelector("div#slider"));
		
		Actions act = new Actions(driver);
		
		//slider move forward x-axis
		act.dragAndDropBy(slider, 200, 0).build().perform();
		
		Thread.sleep(2000);
		
		// slider move in  backward
		act.dragAndDropBy(slider, -50, 0).build().perform();
		
		//second way to move slider
		act.clickAndHold(slider).moveByOffset(100, 0).release().build().perform();
		
		act.clickAndHold(slider).moveByOffset(-40, 0).release().build().perform();


		
	}

}
