package scroll_page;

import org.openqa.selenium.JavascriptExecutor;

import BaseClass_java.Base_Class;

public class Class_002 extends Base_Class {

	public static void main(String[] args) throws Exception {
		
		LaunchBrowser("chrome");
		Navigate_URL("https://www.railyatri.in/");
		take_screenshot("railyatri_homepage");
		
		// scroll up to bottom
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		take_screenshot("after Scroll page at Bottom");
		
		// click back arrow
		js.executeScript("window.history.back()");

	}

}
