package robotProject;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotTest {
	

	public static void main(String[] args) throws Exception{
		
		WebDriver driver = null;
		//Launching browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars_Extensions\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		//Wait
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 //Launch WebPage
		 driver.get("https://www.ksrtc.in");
		 
		 //Maximise browser
		 driver.manage().window().maximize();
		 		 
		 //Clicking Search Bus Button
		 driver.findElement(By.id("searchBtn")).click();
		 
		 //Applying wait
		 Thread.sleep(1500);
		 
		 //Calling robot method
		 robotMethod();
		 
		 //Accepting Alert
		//driver.switchTo().alert().accept();
		 
		 //Closing browser
		 driver.quit();

	}
	
	public static void robotMethod()throws Exception, AWTException{
		
		//Robot to manage pop up
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);				
	}
	
}
