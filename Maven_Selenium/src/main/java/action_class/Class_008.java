package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseClass_java.Base_Class;

public class Class_008 extends Base_Class {
	public static void main(String[] args) {
		
		LaunchBrowser("Chrome");
		Navigate_URL("https://www.facebook.com/");
		
		// locate email text box
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		
		// locate pass text box
		WebElement password = driver.findElement(By.cssSelector("input#pass"));
		
		//Actions class
		Actions act = new Actions(driver);
		
		// send input
		act.sendKeys(email, "satishgarghate123@gmail.com").build().perform();
		
		// press control a
		act.moveToElement(email).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		//press control c
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//press tab to shift password
		act.keyDown(Keys.TAB).build().perform();
		
		// press control v
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

	}

}
