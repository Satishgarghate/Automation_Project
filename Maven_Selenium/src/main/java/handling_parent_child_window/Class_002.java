package handling_parent_child_window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import BaseClass_java.Base_Class;

public class Class_002 extends Base_Class {

	public static void main(String[] args) throws Exception {
		
		LaunchBrowser("chrome");
		Navigate_URL("https://www.naukri.com/");
		
		scroll_page(250);
		
		// Click 
		driver.findElement(By.xpath("(//span[text()='MNC'])")).click();
		
		Set<String> window_id = driver.getWindowHandles();
		
		// Pull window id
		Iterator<String> it = window_id.iterator();
		
		String parent_window_id = it.next();
		
		String child_window_id = it.next();
		
		System.out.println("Parent Window id is:- "+parent_window_id);
		System.out.println("Parent Window id is:- "+child_window_id);
		
		// Switch parent tab to child tab
		driver.switchTo().window(child_window_id);
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		// Click on HR Jobs
		//driver.findElement(By.xpath("(//span[text()='HR Jobs'])")).click();
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		

	}

}
