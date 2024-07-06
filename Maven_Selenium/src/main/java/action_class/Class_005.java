package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseClass_java.Base_Class;

public class Class_005 extends Base_Class {

	public static void main(String[] args) throws Exception {

		//drag and drop
				LaunchBrowser("chrome");
			    Navigate_URL("https://jqueryui.com/droppable/");
				take_screenshot("Homepage_Jquery");
						
						
				//locate frame
				WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

				// To enter inside frame
				driver.switchTo().frame(frame);
						
				// locate drag element
				WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
				
				// locate drop element
				WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
				
				// Actions Class
				Actions act = new Actions(driver);
				
				// another way to perform drag and drop
				act.clickAndHold(drag).moveToElement(drop).release().build().perform();
				
				// To come out from frame
				driver.switchTo().defaultContent();
				
				Thread.sleep(3000);
				
				// Click on link
				driver.findElement(By.xpath("//a[text()='Draggable']")).click();

	}

}
