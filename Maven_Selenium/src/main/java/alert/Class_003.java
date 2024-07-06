package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import BaseClass_java.Base_Class;

public class Class_003 extends Base_Class {

	public static void main(String[] args) throws Exception {
		
		LaunchBrowser("chrome");
		Navigate_URL("https://demoqa.com/alerts");
		scroll_page(150);
		
		// Click on button
				driver.findElement(By.cssSelector("button#promtButton")).click();	
				Thread.sleep(3000);
				
				
		// Switch alert
				Alert al = driver.switchTo().alert();
				
		// send input
				al.sendKeys("Satish");
				al.accept();

	}

}
