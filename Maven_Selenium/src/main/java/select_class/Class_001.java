package select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseClass_java.Base_Class;

public class Class_001 extends Base_Class {

	public static void main(String[] args) throws Exception {
		
		LaunchBrowser("chrome");
		Navigate_URL("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gclid=CjwKCAjwvIWzBhAlEiwAHHWgvVbuNfCfoilP99kJwXlUaPqnv0yY2lG2PlmQZ-pl7qFaHN0-CgTH9xoC5-EQAvD_BwE");
		take_screenshot("homepage_jeevansathi");

		WebElement profile_dropdown = driver.findElement(By.xpath("//select[@name='reg[relationship]']"));
		
		//select class 
		Select s = new Select(profile_dropdown);
		//s.selectByVisibleText("Self");
		//s.selectByValue("2");
		s.selectByIndex(5);
	}

}
