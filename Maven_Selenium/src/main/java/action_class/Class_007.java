package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import BaseClass_java.Base_Class;

public class Class_007 extends Base_Class{

	public static void main(String[] args) {
		
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://facebook.com");
	
	// Current url
	System.out.println("Current url is :- "+driver.getCurrentUrl());
	
	// Get title of web Page
	System.out.println("Title of Web Page is :- "+driver.getTitle());
	
	// locate email text box
	WebElement email = driver.findElement(By.cssSelector("input#email"));
	
	// Actions Class
	Actions act = new Actions(driver);
	
	//Pass input in uppercase
	act.keyDown(Keys.SHIFT).sendKeys("satish").build().perform();
	//act.sendKeys(Keys.SHIFT).sendKeys("satish").build().perform();
	

	}

}
