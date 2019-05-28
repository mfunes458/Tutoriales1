package Paquete;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PruebaDriver1 {
	
	public static WebDriver driver=null; 
	
	public static void main(String[] args) {

	    
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();  
			 
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
			 
		
		
		 
		
		 
		 
	}//Clase
}//espacio
