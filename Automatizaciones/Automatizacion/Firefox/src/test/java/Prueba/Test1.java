package Prueba;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test1 {
	
	private static WebDriver driver;
	private ArrayList<String> tabs;
	

	public static void main(String[] args) {


	
//		 
//		
//		// Create a new instance of the Firefox driver
//	 
//		DesiredCapabilities cap=new DesiredCapabilities();
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\Valentino Falcucci\\Desktop\\Automatizacion\\Firefox\\Driver\\geckodriver.exe");
//		 
//		  
//		  
//		  
//		  WebDriver wd = new FirefoxDriver(); 
//		  wd.get("https://testing-simple.claro.com.ar/inicio/login?/"); 
//
//		  
//		  
//		  try {
//				Thread.sleep(15000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		  
//		  
//		  
//		  wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
//		  wd.manage().window().maximize(); 
//		  //To open a new tab   
//		  Robot r;
//		try {
//			r = new Robot();
//			 r.keyPress(KeyEvent.VK_CONTROL); 
//			  r.keyPress(KeyEvent.VK_T); 
//			  r.keyRelease(KeyEvent.VK_CONTROL); 
//			  r.keyRelease(KeyEvent.VK_T);  
//			  //To switch to the new tab 
//			  ArrayList<String> tabs = new ArrayList<String>(wd.getWindowHandles()); 
//			  wd.switchTo().window(tabs.get(1)); 
//			  //To navigate to new link/URL in 2nd new tab 
//			  wd.get("https://testing-simple.claro.com.ar/inicio/login?/"); 
//			  
//			
//		} catch (AWTException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}       
//		  
//		        // Print a Log In message to the screen
//		        System.out.println("Successfully opened the website www.Store.Demoqa.com");
//		 
//		 //Wait for 5 Sec
//		 try {
//			Thread.sleep(15000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 
//		        // Close the driver
//		 wd.quit();
		 
		 
		
		
		
		
		DesiredCapabilities cap=new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Valentino Falcucci\\Desktop\\Automatizacion\\Firefox\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		
		driver.navigate().to("https://testing-simple.claro.com.ar/inicio/login?/"); 
		
		 try {
				Thread.sleep(12000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 
		
		JavascriptExecutor objJavasript=(JavascriptExecutor)driver;
		String ventanaTab="window.open('\"https://testing-simple.claro.com.ar/inicio/login?/\"')";
		objJavasript.executeScript(ventanaTab);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		 
		    }//clase Main
		
		
	
		
 

}//clase
