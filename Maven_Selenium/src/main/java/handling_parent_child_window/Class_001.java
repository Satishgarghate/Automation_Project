package handling_parent_child_window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import BaseClass_java.Base_Class;

public class Class_001 extends Base_Class{

	public static void main(String[] args) {
		
		LaunchBrowser("chrome");
		Navigate_URL("https://www.salesforce.com/in");
		
		// Click watch demo
		driver.findElement(By.xpath("//a[@label='Watch demo']")).click();
		
		Set<String> window_id = driver.getWindowHandles();
		
		// Pull window id
		Iterator<String> it = window_id.iterator();
		
		String parent_window_id = it.next();
		
		String child_window_id = it.next();
		
		System.out.println("Parent Window id is:- "+parent_window_id);
		System.out.println("Parent Window id is:- "+child_window_id);
		
		// Switch parent tab to child tab
		driver.switchTo().window(child_window_id);
		
		driver.findElement(By.xpath("//input[@id='UserFirstName-EA69']")).sendKeys("abc");


	}

}
