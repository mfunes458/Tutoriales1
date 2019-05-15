package Pruebas;

import org.openqa.selenium.By;
//Importar
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
////anotaciones @Test @BeforeMethod  @AfterMethod
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Importar Clase
import Atajos.Helpers;
import Pages.PageLogin;
import Pages.PageLogon;
import Pages.PageReservation;

public class Test1 {
	
	private WebDriver driver;

	
	@BeforeMethod
	public void setUp()
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Valentino\\Desktop\\Automatizacion\\Selenium_con_Java\\Drivers\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://newtours.demoaut.com/");
		
		 Helpers helper=new Helpers();
		 helper.demora(5);
		 
		
	}//setUp
	
	
	
	

@Test
	public void PruebaUno()
	{
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
	public void PruebaTres()
	{
		PageLogin pageLogin=new PageLogin(driver);
		pageLogin.login("mercury","mercury");
	    PageReservation pageReservation=new PageReservation(driver); 
	    pageReservation.assertReservationPage();
	    Helpers helper=new Helpers();
		 helper.demora(5);
	    pageReservation.selectPasajero(3);
	    helper.demora(5);
	    pageReservation.selectPartida(3);
	    helper.demora(5);
	    pageReservation.selectDestino("London");
	    helper.demora(5);
		 
	}
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		
	}
	
	
	public static void main(String[] args) {
		
		Test1 obj=new Test1();
		obj.setUp();
		obj.PruebaUno();
		obj.tearDown();
		

	}//main

}
