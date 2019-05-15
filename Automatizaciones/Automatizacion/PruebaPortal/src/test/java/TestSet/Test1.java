package TestSet;

import java.sql.DriverPropertyInfo;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test1 {

	
	private WebDriver driver;
	private   By botonLogin=By.xpath("/html[1]/body[1]/main[1]/div[1]/div[2]/div[1]/form[1]/button[1]"); 
	private By inputLogin=By.name("billNumber");
	String billNumber="3512090009";
	
	//Google
	private By inputGoogle=By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]");
	private By botonGoogle=By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[3]/center[1]/input[1]");
	

	
	public WebDriver Setup() {
		DesiredCapabilities cap=new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Valentino Falcucci\\Desktop\\Automatizacion\\PruebaPortal\\Driver\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://testing-simple.claro.com.ar/inicio/login?/");
		System.out.println("LOGUEA PORTAL PADRE");
		try {
			Thread.sleep(7000);//espera 5 segundos
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		driver.findElement(inputLogin).sendKeys(billNumber);
		 driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[2]/div[1]/form[1]/button[1]")).click(); 
		 
		 return driver;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void login1(WebDriver driver)
	{
		
		 
		
//		JavascriptExecutor objJavasript1=(JavascriptExecutor)driver;
// 		String ventanaTab1="window.open('\"https://testing-simple.claro.com.ar/inicio/login?/\"')";
// 		objJavasript1.executeScript(ventanaTab1);
// 		System.out.println("LOGUEA PORTAL HIJO1");
// 		try {
//			Thread.sleep(4000);//espera 5 segundos
//			
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
// 		
//		 try {
//				Thread.sleep(4000);//espera 5 segundos
//				
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} 
		
		
		
 		JavascriptExecutor objJavasript2=(JavascriptExecutor)driver;
 		//String ventanaTab2="window.open('https://testing-simple.claro.com.ar/inicio/')";
 		String ventanaTab2="window.open('https://testing-simple.claro.com.ar/inicio/login?/')";
 	
 		objJavasript2.executeScript(ventanaTab2);
 		System.out.println("LOGUEA PORTAL HIJO2"); 
 		
 		try {
			Thread.sleep(4000);//espera 5 segundos
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
 		
// 		
// 		JavascriptExecutor objJavasript3=(JavascriptExecutor)driver;
// 		String ventanaTab3="window.open('https://www.google.com/')";
// 		objJavasript3.executeScript(ventanaTab3);
// 		System.out.println("LOGUEA PORTAL HIJO3"); 
		
 		
 		
 				
 		
 		
 		
 		
 		
 		
 		 String ventanaPadre=driver.getWindowHandle();
 		 
 		 System.out.println("Ventana Padre "+ventanaPadre);
 		 
 		 Set<String> todasVentanas=driver.getWindowHandles();//importar java.utils
 		 
 		 int cantidad=todasVentanas.size();
 		 
 		 System.out.println("Las ventanas abiertas"+cantidad);
 		 
 		 
 		 for (String hijo : todasVentanas) {
 			
 			 if(!ventanaPadre.equalsIgnoreCase(hijo))
 			 {
 				 driver.switchTo().window(hijo);
 				//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("la voz");
 				 

 		 		driver.findElement(inputLogin).sendKeys("3512015137");
 				 driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[2]/div[1]/form[1]/button[1]")).click(); 
 				
 				
 				 try {
 					Thread.sleep(7000);
 				} catch (InterruptedException e) {
 					// TODO Auto-generated catch block
 					e.printStackTrace();
 				}
 				 
 				  driver.close();
 			 }
 		 } 
 			 
 			 
 		 driver.switchTo().window(ventanaPadre);
 		 System.out.println("Titulo de la ventana padre es "+driver.getTitle());
 	
 
 		  
	}//metodo
	
	
	
	
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
	public void login2(WebDriver driver)
	{
		
		 
		
//		JavascriptExecutor objJavasript1=(JavascriptExecutor)driver;
// 		String ventanaTab1="window.open('\"https://testing-simple.claro.com.ar/inicio/login?/\"')";
// 		objJavasript1.executeScript(ventanaTab1);
// 		System.out.println("LOGUEA PORTAL HIJO1");
// 		try {
//			Thread.sleep(4000);//espera 5 segundos
//			
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
// 		
//		 try {
//				Thread.sleep(4000);//espera 5 segundos
//				
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} 
 		JavascriptExecutor objJavasript24=(JavascriptExecutor)driver;
 		//String ventanaTab2="window.open('https://testing-simple.claro.com.ar/inicio/')";
 		String ventanaTab24="window.open('	https://testing-simple.claro.com.ar/inicio/login?/')";
 	
 		objJavasript24.executeScript(ventanaTab24);
 		System.out.println("LOGUEA PORTAL HIJO2"); 
 		
 		try {
			Thread.sleep(4000);//espera 5 segundos
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
 		
// 		
// 		JavascriptExecutor objJavasript3=(JavascriptExecutor)driver;
// 		String ventanaTab3="window.open('https://www.google.com/')";
// 		objJavasript3.executeScript(ventanaTab3);
// 		System.out.println("LOGUEA PORTAL HIJO3"); 
		
 		
 		
 				
 		
 		
 		
 		
 		
 		
 		 String ventanaPadre=driver.getWindowHandle();
 		 
 		 System.out.println("Ventana Padre "+ventanaPadre);
 		 
 		 Set<String> todasVentanas=driver.getWindowHandles();//importar java.utils
 		 
 		 int cantidad=todasVentanas.size();
 		 
 		 System.out.println("Las ventanas abiertas"+cantidad);
 		 
 		 
 		 for (String hijo : todasVentanas) {
 			
 			 if(!ventanaPadre.equalsIgnoreCase(hijo))
 			 {
 				 driver.switchTo().window(hijo);
 				//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("la voz");
 				 

 		 		driver.findElement(inputLogin).sendKeys("3512004951");
 				 driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[2]/div[1]/form[1]/button[1]")).click(); 
 				
 				
 				 try {
 					Thread.sleep(7000);
 				} catch (InterruptedException e) {
 					// TODO Auto-generated catch block
 					e.printStackTrace();
 				}
 				 
 				 
 				  driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/a[1]")).click();
 				  
 				  
 				 try {
  					Thread.sleep(7000);
  				} catch (InterruptedException e) {
  					// TODO Auto-generated catch block
  					e.printStackTrace();
  				}
 				 
 				  driver.close();
 			 }
 		 } 
 			 
 			 
 		 
 		 driver.switchTo().window(ventanaPadre);
 		 System.out.println("Titulo de la ventana padre es "+driver.getTitle());
 	
	}//metodo
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void login3(WebDriver driver)
	{
		
		 
		
//		JavascriptExecutor objJavasript1=(JavascriptExecutor)driver;
// 		String ventanaTab1="window.open('\"https://testing-simple.claro.com.ar/inicio/login?/\"')";
// 		objJavasript1.executeScript(ventanaTab1);
// 		System.out.println("LOGUEA PORTAL HIJO1");
// 		try {
//			Thread.sleep(4000);//espera 5 segundos
//			
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
// 		
//		 try {
//				Thread.sleep(4000);//espera 5 segundos
//				
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} 
 		JavascriptExecutor objJavasript24=(JavascriptExecutor)driver;
 		//String ventanaTab2="window.open('https://testing-simple.claro.com.ar/inicio/')";
 		String ventanaTab24="window.open('	https://testing-simple.claro.com.ar/inicio/login?/')";
 	
 		objJavasript24.executeScript(ventanaTab24);
 		System.out.println("LOGUEA PORTAL HIJO2"); 
 		
 		try {
			Thread.sleep(4000);//espera 5 segundos
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
 		
// 		
// 		JavascriptExecutor objJavasript3=(JavascriptExecutor)driver;
// 		String ventanaTab3="window.open('https://www.google.com/')";
// 		objJavasript3.executeScript(ventanaTab3);
// 		System.out.println("LOGUEA PORTAL HIJO3"); 
		
 		
 		
 				
 		
 		
 		
 		
 		
 		
 		 String ventanaPadre=driver.getWindowHandle();
 		 
 		 System.out.println("Ventana Padre "+ventanaPadre);
 		 
 		 Set<String> todasVentanas=driver.getWindowHandles();//importar java.utils
 		 
 		 int cantidad=todasVentanas.size();
 		 
 		 System.out.println("Las ventanas abiertas"+cantidad);
 		 
 		 
 		 for (String hijo : todasVentanas) {
 			
 			 if(!ventanaPadre.equalsIgnoreCase(hijo))
 			 {
 				 driver.switchTo().window(hijo);
 				//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("la voz");
 				 

 		 		driver.findElement(inputLogin).sendKeys("1154090321");
 				 driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[2]/div[1]/form[1]/button[1]")).click(); 
 				
 				
 				 try {
 					Thread.sleep(7000);
 				} catch (InterruptedException e) {
 					// TODO Auto-generated catch block
 					e.printStackTrace();
 				}
 				 
 				 
 				  driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/a[1]")).click();
 				  
 				  
 				 try {
  					Thread.sleep(7000);
  				} catch (InterruptedException e) {
  					// TODO Auto-generated catch block
  					e.printStackTrace();
  				}
 				 
 				  driver.close();
 			 }
 		 } 
 			 
 			 
 		 
 		 driver.switchTo().window(ventanaPadre);
 		 System.out.println("Titulo de la ventana padre es "+driver.getTitle());
 	
	}//metodo
	
	
	
	
	
	public static void main(String[] args) {
		
		WebDriver driver;
		Test1 obj=new Test1();
		driver=obj.Setup();
		obj.login1(driver);	
		
		obj.login2(driver);	
		obj.login3(driver);	
		//obj.login1(driver);
		
		
		

	}//main

}//clase
