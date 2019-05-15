package Pruebas;


import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
//Importar
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.PageLogin;


public class Test1 {

	
	//Objetos
	private WebDriver driver;
	private   By botonLogin=By.xpath("/html[1]/body[1]/main[1]/div[1]/div[2]/div[1]/form[1]/button[1]"); 
	private By inputLogin=By.name("billNumber");
	String billNumber="3512090009";

	//HOME
	
	private  By linkVerMas=By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/a[1]");
	private By prestamo10=By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]");
	private By prestamo21=By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]");
	private By botonConfirmar=By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/button[2]");
	private By botonClickAca=By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/p[1]/a[1]");
	
	
	
	//texto
	
	private By textoPrestamo=By.xpath("//*[@id=\"loan_amount_block\"]/a[2]");
	private By textoPendiente=By.xpath("//*[@id=\"loan_amount_block\"]/a[2]");
	private By textoSaldado=By.xpath("//*[@id=\"loan_amount_block\"]/a[2]");

	
			
	
			
	
	@BeforeMethod
	public void setUp()
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Valentino Falcucci\\Desktop\\Automatizacion\\Selenium_con_Java\\Drivers\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://testing-simple.claro.com.ar/inicio/login?/");
		
		options.setUserPreferences( { credentials_enable_service: false } );
		let builder = new webdriver.Builder();
		builder.setChromeOptions( options );
		const driver = builder.forBrowser( 'chrome' ).build();
		
		try {
			Thread.sleep(5000);//espera 5 segundos
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 
		
	}//setUp
	
	
	
	@Test
	public void loginPortal()
	{
		driver.findElement(inputLogin).sendKeys(billNumber);
		driver.findElement(botonLogin).click(); 
		
	}
	
	
	@Test
	public void solicitarPrestamo()
	{
	 
		driver.findElement(linkVerMas).click();
		driver.findElement(prestamo10).click();
		driver.findElement(botonConfirmar).click();
		
	}
	
	@Test
	public void verificarPrestamo()
	{
		String diner=driver.findElement(textoPrestamo).getText();
		Assert.assertTrue(driver.findElement(textoPrestamo).getText().contains("$10,00"));
		Assert.assertEquals(driver.findElement(textoPrestamo).getText(),"$10,00");
		 
	 System.out.println(diner);
	}
	
	
	
	
	
	public void Prueba1()
	{
		ArrayList<WebElement> listaItem = (ArrayList<WebElement>) driver.findElements(By.xpath("//*[@id=\"smartphone\"]")); 

		for (WebElement element: listaItem) {
		      System.out.println(element.getText());
		}

	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
	
	
	public static void main(String[] args) {
		
		Test1 test1=new Test1();
		test1.setUp();
		test1.loginPortal();
		test1.solicitarPrestamo();
		test1.verificarPrestamo();
		test1.Prueba1();
	}//main


	
}//Clase
