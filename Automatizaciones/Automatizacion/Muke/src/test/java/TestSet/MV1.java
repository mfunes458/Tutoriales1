package TestSet;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MV1 {

	private WebDriver driver;//=new ChromeDriver();
	 
	
	
	@Test
	public void setUp()
	{
	 
		DesiredCapabilities cap=new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Valentino Falcucci\\Desktop\\Automatizacion\\Selenium_con_Java\\Drivers\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		
	 driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[2]")).click();
		
	 String ventanaPadre=driver.getWindowHandle();
	 
	 System.out.println("Ventana Padre "+ventanaPadre);
	 
	 Set<String> todasVentanas=driver.getWindowHandles();//importar java.utils
	 
	 int cantidad=todasVentanas.size();
	 
	 System.out.println("Las ventanas abiertas"+cantidad);
	 
	 
	 for (String hijo : todasVentanas) {
		
		 if(!ventanaPadre.equalsIgnoreCase(hijo))
		 {
			 driver.switchTo().window(hijo);
			 driver.findElement(By.name("q")).sendKeys("Selenium Webdriver");
			 
			 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 driver.close();
		 }
		 
		 
		 
		 driver.switchTo().window(hijo);
		 
		 System.out.println("Titulo de la ventana padre es "+driver.getTitle() );
	}
	 
	 
	}
	public static void main(String[] args) {
		 
		MV1 obj=new MV1();
		obj.setUp();
		
		

	}//Main

}//Clase
