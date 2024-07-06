package action_class;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import BaseClass_java.Base_Class;

public class Class_006 extends Base_Class{

	public static void main(String[] args) throws Exception {
		
		LaunchBrowser("Chrome");
		Navigate_URL("https://www.netmeds.com/");
		take_screenshot("Netmeds_Homepage");
		
		Actions act = new Actions(driver);
		
		// Press button page down
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(3000);
		// Press button page up
		act.sendKeys(Keys.PAGE_UP).build().perform();
		act.sendKeys(Keys.SHIFT).sendKeys("abc").build().perform();
		
		
		

	}

}
