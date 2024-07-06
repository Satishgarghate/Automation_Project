package BaseClass_java;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Target;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Base_Class {
	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");
	
	//Launch browser
	public static void LaunchBrowser(String browser) 
	{	
		if(browser.equalsIgnoreCase("Chrome")) 
	{
			driver = new ChromeDriver();
	}
		else if(browser.equalsIgnoreCase("Firefox"))
	{
			driver = new FirefoxDriver();
	}
		else if(browser.equalsIgnoreCase("Edge"))
	{
			driver = new EdgeDriver();
	}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("The Launched browser is :"+ browser);
	}
	
	//Dynamic Code for Navigate URL
	public static void Navigate_URL(String URL)
	{
		driver.get(URL);
		System.out.println("Navigate URL is:" + URL);
		System.out.println("Title of webpage is:" +driver.getTitle());
	}
	
	//Screeenshot
	
	public static void take_screenshot(String screebshotname) throws Exception {
		TakesScreenshot ts = (TakesScreenshot )driver;
		File target_file = ts.getScreenshotAs(OutputType.FILE);
		File source_File = new File (projectpath + "\\Screenshot\\"+screebshotname+".png");
		FileHandler.copy(target_file, source_File);
	}
	
	// Dynamic code scroll page
	public static void scroll_page(int ypoints) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+ypoints+")");
	}
	

}
