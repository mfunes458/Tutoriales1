package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		
		
		 String exePath = "C:\\Users\\Valentino\\Desktop\\Testing\\Drivers\\Chrome Driver\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://toolsqa.com/automation-practice-form/");
		 
		 

		 
		        // Print a Log In message to the screen
		        System.out.println("Se abrio la ventana Correcta");
		 
		 //Wait for 5 Sec
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		        // Close the driver
		        driver.quit();
		        
		        
	}

}
