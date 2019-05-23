package Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PruebaMozilla {

	public static void main(String[] args) {
		  
		String projectPath=System.getProperty("user.dir");
		System.out.println("projectPath "+projectPath);//si no trae nada es null (no existe) 
		 
		System.setProperty("webdriver.chrome.driver",projectPath+"\\Driver\\Chrome\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Valentino Falcucci\\Desktop\\semana 20-25\\Raghav\\AutomationStep\\Driver\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		
		try {
			 driver.get("https://es-la.facebook.com/");
			 
			 //SELECCION FULL
			 WebElement txtEmail=driver.findElement(By.id("email"));
			 txtEmail.sendKeys("FULL@gmail.com");
			 				 
			 //SELECCION SHORT
			 driver.findElement(By.id("email")).sendKeys("SHORT@gmail.com"); 
			Thread.sleep(3000); 
			 
			
		} catch (InterruptedException e) {
			 
			e.printStackTrace();
		}
		
		driver.close(); 

	}//clase
}//Espacio
