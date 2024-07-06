package different_Varifications;

import org.openqa.selenium.By;

import BaseClass_java.Base_Class;

public class Class_001 extends Base_Class {

	public static void main(String[] args) {
		
		LaunchBrowser("chrome");
		Navigate_URL("https://www.flipkart.com/");
		
		 String link_name_1 = driver.findElement(By.xpath("//span[text()='Grocery']")).getText();

		 System.out.println("Link Name_1 is :-"+link_name_1);
		 
		 String link_name_2 = driver.findElement(By.xpath("//span[text()='Grocery']")).getAttribute("innerHTML");
		 
		 System.out.println("Link Name_2 is :-"+link_name_2);
	}

}
