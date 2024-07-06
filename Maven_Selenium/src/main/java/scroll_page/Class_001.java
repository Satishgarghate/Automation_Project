package scroll_page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import BaseClass_java.Base_Class;

public class Class_001 extends Base_Class {

	public static void main(String[] args) throws Exception {
		LaunchBrowser("chrome");
		Navigate_URL("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gclid=CjwKCAjwgdayBhBQEiwAXhMxtiNwYixAlIpfWLmwyBONIsKn7cbR7q1pTF36xyzu_Y0oHPJ-mNQECxoCJ88QAvD_BwE");
		take_screenshot("homepage_Jeevansathi");
		
		//Scroll page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		
		// Take screenshot
		take_screenshot("After Page Scroll");
		
		// click facebook icon
		driver.findElement(By.xpath("(//div[@class='social']//a)[1]")).click();

		Thread.sleep(2000);
		// Click screenshot after click on facebook
		take_screenshot("After click on facebook link");
	}

}
