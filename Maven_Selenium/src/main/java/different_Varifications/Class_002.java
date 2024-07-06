package different_Varifications;

import org.openqa.selenium.By;

import BaseClass_java.Base_Class;

public class Class_002 extends Base_Class {

	public static void main(String[] args) {
		
		LaunchBrowser("chrome");
		Navigate_URL("https://www.flipkart.com/");
		
		String expected_link_name = "Grocery";
		
		String actual_link_name = driver.findElement(By.xpath("//span[text()='Grocery']")).getText();

		if(actual_link_name.equalsIgnoreCase(expected_link_name)) {
			System.out.println("Both Links Name Is Same");
		}
		else {
			System.out.println("Both Links Name is Not Same");
		}
		
	}

}
