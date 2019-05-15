package Pruebas;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType; 
import org.openqa.selenium.TakesScreenshot;
//Importar
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
////anotaciones @Test @BeforeMethod  @AfterMethod
import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Atajos.Capturas;
//Importar Clase
import Atajos.Helpers;
import Atajos.WebDriverGestion;
import Pages.PageLogin;
import Pages.PageLogon;
import Pages.PageReservation;
import Pages.Prueba;

//importar ITestResult
import org.testng.ITestResult;

//importar el de selenium no el de java
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;//punto ubicacion



public class Test1 {
	
	private WebDriver driver;
	private ArrayList<String> tabs;
	
	@BeforeMethod
	public void setUp()
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Valentino Falcucci\\Desktop\\Automatizacion\\Selenium_con_Java\\Drivers\\Chrome\\chromedriver.exe");
		
		
//		ChromeOptions chromeOptions=new ChromeOptions();
//		chromeOptions.addArguments("--headless");
//		driver=new ChromeDriver(chromeOptions);
		driver=new ChromeDriver();
		
		//Manipular posicion y tamanio de pantalla 
		//driver.manage().window().maximize();
		//driver.manage().window().fullscreen();//pantalla completa
//		driver.manage().window().setSize(new Dimension(200,400));//tamaño
//		driver.manage().window().setPosition(new Point(200,400));//Posicion
		//mover pantalla
//		for(int i=0;i<=800;i++)
//		{
//			driver.manage().window().setPosition(new Point(i,i));//Posicion 
//		}
		
		//Abrir Pestañas en el navegador
		
		driver.navigate().to("http://newtours.demoaut.com/"); 
//		
//		JavascriptExecutor objJavasript=(JavascriptExecutor)driver;
//		String ventanaTab="window.open('https://www.google.com/')";
//		objJavasript.executeScript(ventanaTab);
//		
//		
//		 JavascriptExecutor objJavasript1=(JavascriptExecutor)driver;
//		String ventanaTab1="window.open('https://www.google.com/')";
//		objJavasript.executeScript(ventanaTab1);
//			
//		//recorre todas las ventanas abiertas y las guarda en una lista
//		tabs=new ArrayList<String>(driver.getWindowHandles());
//		
		
		
		//demora
		 Helpers helper=new Helpers();
		 helper.demora(5); 
	}//setUp
	
	
	
	

	//@Test
	public void loginIncorrecto()//login incorrecto
	{ 
	
		WebDriverGestion.setWindowsSize(driver,"maximizar");
		//cambia tab1
		driver.switchTo().window(tabs.get(2)).navigate().to("https://www.clarin.com/");//hace foto sobre la ultima tab abierta
		driver.switchTo().window(tabs.get(1)).navigate().to("https://www.linguee.es/espanol-ingles/search?source=auto&query=handle");//hace foto sobre la ultima tab abierta
		driver.switchTo().window(tabs.get(0));//volvemos a la primera tab para evitar el error ya que hace foco sobre la ultima y no encuentra elementos
		PageLogin pageLogin=new PageLogin(driver);
		pageLogin.login("user","user");
	    PageLogon pagelogon=new PageLogon(driver);
	 	pagelogon.assertLogonPage();
		 
	 
		
	}
	

	@Test
	public void PruebaDos()
	{
		PageLogin pageLogin=new PageLogin(driver);
		pageLogin.login("mercury","mercury");
	    PageReservation pageReservation=new PageReservation(driver);
	    pageReservation.assertReservationPage();
		 
	}
	
		@Test
		public void LoginIncorrecto()
		{
			PageLogin pageLogin=new PageLogin(driver);
			pageLogin.login("user","user");
			PageLogon pagelogon=new PageLogon(driver);
			pagelogon.assertLogonPage();
			 
		}
	
	
	
	
	//@Test
	public void PruebaTres() //login correcto
	{	
		 //tamanio pantalla
		//WebDriverGestion.setWindowsSize(driver,200,300);
		
		PageLogin pageLogin=new PageLogin(driver);
		pageLogin.login("mercury","mercury");
		
	    PageReservation pageReservation=new PageReservation(driver); 
	    pageReservation.assertReservationPage();
	    
	    
	    Helpers helper=new Helpers();
		 helper.demora(2);
	    pageReservation.selectPasajero(3);
	    helper.demora(2);
	    pageReservation.selectPartida(3);
	    helper.demora(2);
	    pageReservation.selectDestino("London");
     
		 
	}
	
	//@Test
	public void fields_login()
	{
		PageLogin pageLogin=new PageLogin(driver);
		pageLogin.fields_login("mercury","mercury"); 
		
	}
	
	
	//no funciona
	//@Test
	public void pruebaCantidadCampos()
	{
		PageLogin pageLogin=new PageLogin(driver);
		pageLogin.verificarInputs();
	}
	
	
	
	//Metodo Titulo
	//@Test
	public void Titulo()
	{	
		PageLogin pageLogin=new PageLogin(driver);
		pageLogin.insertarTituloUsuario();
	}
	
	
	//Lista de elementos
	//@Test
	public void PruebaLogin()
	{
		Prueba objPrueba=new Prueba(driver);
		objPrueba.login("user","user");
	}
	
	 
	//Lista de elementos
	//@Test
		public void PruebaremostrarElementos()
		{
			Prueba objPrueba=new Prueba(driver);
			objPrueba.mostrarElementos();
		}
		
		
		
		
		
		//Login Lista de elementos
		//@Test
			public void PruebaloginLista()
			{
				Prueba objPrueba=new Prueba(driver);
				objPrueba.loginLista();
			}
 
			//Login Lista de elementos
			//@Test
			public void PruebaloginListaPageObject()
			{
				Prueba objPrueba=new Prueba(driver);
				objPrueba.loginListaPageObject();
			}
			
			
			
			
			
			//Login Lista de elementos
			//@Test
			public void PruebaloginListaArray()
			{
				Prueba objPrueba=new Prueba(driver);
				objPrueba.loginListaArray();
			}
			
			
			
			
			
			
			//Lista de Link
			//@Test
			public void PruebamostrarLink()
			{
				Prueba objPrueba=new Prueba(driver); 
				objPrueba.mostrarLink();
			}
			 
	
	
	
	//@AfterMethod
	public void tearDown()
	{
		driver.close();
		
	}
	
	@AfterMethod
	public void tearDown1(ITestResult result)
	{
//		 if(!result.isSuccess())
//		 {
//			//Captura de Pantalla (objeto abstracto)
//				File captura=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
//				try {
//				 
//					FileUtils.copyFile(captura,new File("LOGIN CON ERROR"+System.currentTimeMillis()+".png"));
//					
//						} catch (IOException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						} 
//		 } 
		
		//Capturas.sacarCaptura( "metodo captura", driver);
		
		 Helpers helper=new Helpers();
		
		 
		 //cerrar Pestañas
		 
//		 driver.switchTo().window(tabs.get(0)).close();//mercury
//		 helper.demora(3); 
//		 driver.switchTo().window(tabs.get(1)).close();//google
//		 helper.demora(3); 
//		 driver.switchTo().window(tabs.get(2)).close();//linguee
		 
		 
		  driver.close();
	}//metodo
	
	
	
	
	
	public static void main(String[] args) {
		
		Test1 obj=new Test1();
	
		obj.setUp();
		obj.PruebaremostrarElementos();
		obj.tearDown();
		

	}//main

}
