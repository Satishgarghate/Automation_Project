package scroll_page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import BaseClass_java.Base_Class;

public class Class_003 extends Base_Class {

	public static void main(String[] args) throws Exception {
		
		LaunchBrowser("Chrome");
		Navigate_URL("https://www.facebook.com/");
		take_screenshot("Facebook Homepsge");

		// Click on link
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		take_screenshot("After Click on Link");
		
		//Press back arrow
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.history.back()");
		
		Thread.sleep(4000);
		
		// forward
		js.executeScript("window.history.forward()");

		//refresh
		js.executeScript("window.history.go(0)");


	}

}
