package TestSet;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

 

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import Metodo.Varios;
import PackModelo.PaqueteModelo;
import Prestamo.PrestamoController;
import Prestamo.PrestamoModelo;


//IMPORTAR CAPTURA
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;







//Precondiciones:
//SALDO entre 0 -99 pesos
//Linea sin prestamo activo
//Linea sin Paquetes (SMS-Internet) vigentes o datos disponibles




public class Test1 {
	

	private WebDriver driver;
	
	private By inputLogin=By.name("billNumber");
	String billNumber="3512090009";
	
	
	//LINK
 			
	  private By linkVerDetalles=By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/a[1]"); 
	  private By linkCLARO=By.partialLinkText("inicio"); 
	  
	 
	
	
	//link 
	private By linkVerMas=By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/a[1]"); 
	private By prestamo10=By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[1]");
	private By prestamo21=By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/p[1]");
	private By linkClickAca=By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/p[1]/a[1]");

	
	//----------
	//---BOTONES
	//----------
	private   By botonLogin=By.xpath("/html[1]/body[1]/main[1]/div[1]/div[2]/div[1]/form[1]/button[1]"); 
	private By botonConfirmar=By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/button[2]");
	private  By botonCancelar=By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/button[1]");
	
	
	//Google
	private By inputGoogle=By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]");
	private By botonGoogle=By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[3]/center[1]/input[1]");
	

	
	
	
	//TEXTO ACREDITACION PRESTAMO
	private By textPrestamo10=By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/a[2]"); // $10,00
	private By textPrestamoSaldado=By.xpath("/html[1]/body[1]/main[1]/div[2]/div[2]/a[2]"); //$0,00
	private By txtPrestamoPendiente=By.xpath("/html[1]/body[1]/main[1]/div[2]/div[3]/a[2]"); //$10,00
	private By txtCostoServicioVigente=By.xpath("/html[1]/body[1]/main[1]/div[3]/a[2]");//$2,00  //txt copiar xpath
	 
 
	
	//TEXTO DETALLE PRESTAMO
	
	private By textPrestamo10_dp=By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/a[2]"); // $10,00
	private By textPrestamoSaldado_dp=By.xpath("/html[1]/body[1]/main[1]/div[1]/div[2]/a[2]"); //$0,00
	private By txtPrestamoPendiente_dp=By.xpath("/html[1]/body[1]/main[1]/div[1]/div[3]/a[2]"); //$10,00
	private By txtCostoServicioVigente_dp=By.xpath("/html[1]/body[1]/main[1]/div[2]/a[2]");//$2,00  //txt copiar xpath
	
	
		//TEXTO COSTO SERVICIO VENCIDO
		
	
	private By txtPrestamoOtorgado_cv=By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/a[2]"); // $10,00+2=12
	private By txtCostoServicioVencido_cv=By.xpath("/html[1]/body[1]/main[1]/div[1]/div[2]/a[2]"); // Figura Arriba
	private By txtPrestamoSaldado_cv=By.xpath("/html[1]/body[1]/main[1]/div[1]/div[3]/a[2]"); // $10,00+2=12
	private By txtPrestamoPendiente_cv=By.xpath("/html[1]/body[1]/main[1]/div[1]/div[4]/a[2]"); // Figura Arriba
	

	//TEXTO
	private By textoSaldo=By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/strong[1]"); // $10,00
	
	private By saldoInicialString=By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/strong[1]"); // $10,00
	private By saldoFinalString=By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/strong[1]"); // $10,00
 
	
	    
 
	
	//objetos
	Varios v=new Varios();//Metodo Retardar

	
	
	
	
	
	
	
	@BeforeMethod
	public WebDriver Setup() {
		DesiredCapabilities cap=new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Valentino Falcucci\\Desktop\\TESTING\\Automatizaciones\\Automatizacion\\Drivers\\Chrome Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		 
		driver.navigate().to("https://claro:quebuenoeselportal@testing-simple.claro.com.ar/inicio/login?/"); 
		//driver.navigate().to("https://testing-simple.claro.com.ar/inicio/login?/");
		System.out.println("LOGUEA PORTAL PADRE");
		try {
			Thread.sleep(7000);//espera 5 segundos
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		driver.findElement(inputLogin).sendKeys("1132260012");
		 driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[2]/div[1]/form[1]/button[1]")).click(); 
		 
		 return driver;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void login1(WebDriver driver,String linea)
	{
		
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		System.out.println("------------CASO DE PRUEBA: ACREDITAR PRESTAMO-----------");
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		
		
		int contador=0;
		String titulo="CP_ACREDITAR_PRESTAMO";
		//Variables
		int saldoInicialInt=0;
		int saldoFinalInt=0;
		int prestamoInt=0;
		
		 
		
			logueo.init("C:\\Users\\Valentino Falcucci\\Desktop\\Automatizacion\\DEMO_PORTAL\\Reporte\\Reporte_Prestamo_Acreditar_Prestamo.html",true);
			logueo.startTest("PROBANDO REPORTES");
			 
		
			
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
 				 
 				 //--------------
 				//1-ETAPA : LOGIN
 				//---------------
 				 
 				
 				 
 		 		driver.findElement(inputLogin).sendKeys(linea);
 				 driver.findElement(botonLogin).click(); 
 				
 				 
 			  //--------------------------
 			 //2-ETAPA -SOLICITAR PRESTAMO
 			//----------------------------	 
 			
 				 
 				 System.out.println("SALDO INICIAL");
 				 System.out.println(driver.findElement(textoSaldo).getText());
 				saldoInicialInt=Integer.parseInt(driver.findElement(saldoInicialString).getText().substring(1,4));
 				v.retardar();
 				driver.findElement(linkVerMas).click();
 				sacarCaptura(titulo,"__"+(contador++)+"__"+"VERIFICAR_OPCIONES__",driver);
 				 
 				v.retardar();
 				driver.findElement(prestamo10).click();
 				v.retardar(); 
 				driver.findElement(botonConfirmar).click();
 		
 				
 					
 			//--------------------------	
 			//3-ETAPA-VERIFICAR PRESTAMO
 			//-------------------------	
 				
 				v.retardar();
 				System.out.println("PRESTAMO OTORGADO ");
 				System.out.println(driver.findElement(textPrestamo10).getText());
 				prestamoInt=Integer.parseInt(driver.findElement(textPrestamo10).getText().substring(1,3)); 				 
 				Assert.assertTrue(driver.findElement(textPrestamo10).getText().contains("$10,00"),"COINCIDEN");	
 			
 				 
 				
 				
 				System.out.println("SALDADO"); 				
 				System.out.println( driver.findElement(textPrestamoSaldado).getText());
 				Assert.assertTrue(driver.findElement(textPrestamoSaldado).getText().contains("$0,00"),"PRESTAMO SALDADO");	
 				
 				
 				System.out.println("PENDIENTE"); 
 				 System.out.println(  driver.findElement(txtPrestamoPendiente).getText());
 	 			Assert.assertTrue(driver.findElement(txtPrestamoPendiente).getText().contains("$10,00"),"PRESTAMO PENDIENTE");	
 	 			
 	 			
 	 			System.out.println("COSTO SERVICIO"); 	 			
 	 			System.out.println( driver.findElement(txtCostoServicioVigente).getText());
 	 			Assert.assertTrue(driver.findElement(txtCostoServicioVigente).getText().contains("$2,00"),"COSTO SERVICIO PENDIENTE");	
 	 			
 	 			v.retardar();
 	 			sacarCaptura(titulo,"__"+(contador++)+"__"+"VERIFICAR_PRESTAMO_ACREDITADO__",driver);
 	 			 
 				
 				driver.findElement(linkClickAca).click(); 	
 				String preciofinalString=driver.findElement(saldoFinalString).getText().substring(1,4);
 				saldoFinalInt=Integer.parseInt(preciofinalString);
 				v.retardar();
 				 
 				
 				
 				
 				System.out.println("SALDO INICIAL "+"  "+saldoInicialInt);
 				System.out.println("SALDO FINAL "+"  "+saldoFinalInt);
 				System.out.println("DIFERENCIA "+"  "+(saldoFinalInt-saldoInicialInt));
 				System.out.println("Prestamo otorgado "+"  "+prestamoInt);
 			
 				if(prestamoInt==(saldoFinalInt-saldoInicialInt))
 				{
 					System.out.println("EL PRESTAMO SE ACREDITO CORRECTAMENTE");
 					
 				}else
 				{
 					System.out.println("EL PRESTAMO NO SE PUDO ACREDITAR");
 					
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	//CP_VERIFICAR_DETALLE_PRESTAMO
	 
	public void detallePrestamo(WebDriver driver,String linea)
	{
		
		
		 
		System.out.println("----------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("---------CASO DE PRUEBA: VALIDAR DETALLE PRESTAMO---------------------");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------");
		
		
		int contador=0;
		String titulo="CP_PRESTAMO_PARCIALMENTE_SALDADO";
		
		
		
		
		
		//Inicia REPORTS
		
		ExtentReports logueo=ExtentReports.get(Test1.class);
		logueo.init("C:\\Users\\Valentino Falcucci\\Desktop\\Automatizacion\\DEMO_PORTAL\\Reporte\\Reporte_Prestamo.html",true);
		logueo.startTest("PROBANDO REPORTES");
			 
	 
		
		
		//ABRE PESTAÑA EN EL BROWSER
 		JavascriptExecutor objJavasript2=(JavascriptExecutor)driver; 
 		String ventanaTab2="window.open('https://testing-simple.claro.com.ar/inicio/login?/')"; 
 		objJavasript2.executeScript(ventanaTab2);
 		System.out.println("LOGUEA PORTAL HIJO2");  
 		v.retardar();
 		
 		
 		
 		//SELECCIONA LA PESTAÑA NUEVA
 		 		
 		 String ventanaPadre=driver.getWindowHandle(); 		 
 		 System.out.println("Ventana Padre "+ventanaPadre); 		 
 		 Set<String> todasVentanas=driver.getWindowHandles();//importar java.utils 		 
 		 int cantidad=todasVentanas.size(); 		 
 		 System.out.println("Las ventanas abiertas"+cantidad);		 
 		 
 		 for (String hijo : todasVentanas) {
 			
 			 if(!ventanaPadre.equalsIgnoreCase(hijo))
 			 {
 				 driver.switchTo().window(hijo); 				
 				 
 				 
 				//1-ETAPA : LOGIN
 				logueo.log(LogStatus.INFO,"LOGIN-INGRESANDO AL PORTAL");
 		 		driver.findElement(inputLogin).sendKeys(linea);
 				 driver.findElement(botonLogin).click(); 
 				v.retardar();
 				
 				
 				
 			 //2-ETAPA -PRESIONAR LINK VER DETALLE EN LA HOME
 				 //Se valida que se vea el LINK VER DETALLES
 				
 				 Assert.assertTrue(driver.findElement(linkVerDetalles).getText().contains("Ver detalles"));
 				 System.out.println("EL LINK ES "+"  "+driver.findElement(linkVerDetalles).getText());
 				 sacarCaptura(titulo,"__"+(contador++)+"__"+"VERIFICAR_LINK_VER_DETALLE__",driver); 	
 				
 				 driver.findElement(linkVerDetalles).click();
 				 v.retardar();
 				
 				 
 					
 			//3-ETAPA-VERIFICAR PRESTAMO OTORGADO
 			
 				 v.retardar();
 				 System.out.println("PRESTAMO OTORGADO ");
 				 System.out.println(driver.findElement(textPrestamo10_dp).getText());
 				 				 
 				Assert.assertTrue(driver.findElement(textPrestamo10_dp).getText().contains("$10,00"),"COINCIDEN");	
 			
 				
 				System.out.println("SALDADO"); 				
 				 System.out.println( driver.findElement(textPrestamoSaldado_dp).getText());
 				Assert.assertTrue(driver.findElement(textPrestamoSaldado_dp).getText().contains("$0,00"),"PRESTAMO SALDADO");	
 	
 				
 				System.out.println("PENDIENTE"); 
 				 System.out.println(  driver.findElement(txtPrestamoPendiente_dp).getText());
 	 			Assert.assertTrue(driver.findElement(txtPrestamoPendiente_dp).getText().contains("$10,00"),"PRESTAMO PENDIENTE");	
 	 		
 	 			
 	 			
 	 			System.out.println("COSTO SERVICIO"); 	 			
 	 			System.out.println( driver.findElement(txtCostoServicioVigente_dp).getText());
 	 			Assert.assertTrue(driver.findElement(txtCostoServicioVigente_dp).getText().contains("$2,00"),"COSTO SERVICIO PENDIENTE");	
 	 			logueo.log(LogStatus.INFO,"VERIFICAR COSTO DE SERVICIO "); 	 			
 	 			v.retardar();
 	 			sacarCaptura(titulo,"__"+(contador++)+"__"+"VERIFICAR_PRESTAMO_ACREDITADO__",driver);
 	 			 
 				
 				 v.retardar();
 				driver.close();

 			 }
 				 
 		 } 
 			 
 			 
 		 driver.switchTo().window(ventanaPadre);
 		 System.out.println("Titulo de la ventana padre es "+driver.getTitle());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//CP_VERIFICAR_COSTO_SERVICIO_VENCIDO
	 
	public void costoServicioVencido(WebDriver driver,String linea)
	{
		
		
		 
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		System.out.println("-------CASO DE PRUEBA: VALIDAR COSTO SERVICIO VENCIDO----");
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		
		
		int contador=0;
		String titulo="CP_COSTO_SERVICIO_VENCIDO";
		
		
		//ATRIBUTOS
	 
		 
		
		
		 
			ExtentReports logueo=ExtentReports.get(Test1.class);
			logueo.init("C:\\Users\\Valentino Falcucci\\Desktop\\Automatizacion\\DEMO_PORTAL\\Reporte\\Reporte_Prestamo_Costo_Servicio.html",true);
			logueo.startTest("PROBANDO REPORTES");
			 
	 
		
		//ABRE VENTANA
 		JavascriptExecutor objJavasript2=(JavascriptExecutor)driver; 
 		String ventanaTab2="window.open('https://testing-simple.claro.com.ar/inicio/login?/')"; 
 		objJavasript2.executeScript(ventanaTab2);
 		System.out.println("LOGUEA PORTAL HIJO2");  
 		v.retardar();
 		
 		
 		
 		
 		 String ventanaPadre=driver.getWindowHandle();
 		 
 		 System.out.println("Ventana Padre "+ventanaPadre);
 		 
 		 Set<String> todasVentanas=driver.getWindowHandles();//importar java.utils
 		 
 		 int cantidad=todasVentanas.size();
 		 
 		 System.out.println("Las ventanas abiertas"+cantidad);
 		 
 		 
 		 for (String hijo : todasVentanas) {
 			
 			 if(!ventanaPadre.equalsIgnoreCase(hijo))
 			 {
 				 driver.switchTo().window(hijo);
 				
 				 
 				//1-ETAPA : LOGIN
 				logueo.log(LogStatus.INFO,"LOGIN-INGRESANDO AL PORTAL");
 				 
 		 		driver.findElement(inputLogin).sendKeys(linea);
 				 driver.findElement(botonLogin).click(); 
 				v.retardar();
 				
 				
 				
 			
 				
 				
 			 //2-ETAPA -PRESIONAR LINK VER DETALLE EN LA HOME
 				 //Se valida que se vea el LINK VER DETALLES
 				
 				
 				Assert.assertTrue(driver.findElement(linkVerDetalles).getText().contains("Ver detalles"));
 				 System.out.println("EL LINK ES "+"  "+driver.findElement(linkVerDetalles).getText());
 				 sacarCaptura(titulo,"__"+(contador++)+"__"+"VERIFICAR_LINK_VER_DETALLE__",driver); 	
 				logueo.log(LogStatus.INFO,"VERIFICAR QUE SE MUESTRE LINK VER DETALLES");
 				 driver.findElement(linkVerDetalles).click();
 				v.retardar();
 				
 				 
 				
 					
 			//3-ETAPA-VERIFICAR PRESTAMO
 				//Hacemos click en 
 				
 				
 				//Calculo el saldo pendiente a pagar desde la base
 				PrestamoModelo pm1=new PrestamoModelo();
 				PrestamoController pc1=new PrestamoController();
 				pm1=pc1.devolverObjPrestamo(linea);
 			     pc1.editarPrestamo(pm1); 			     
 				int total=(pm1.getCURRENTACCCREDITAMT()+pm1.getCURRENTACCSERVICECOST())/100000;
 				
 				
 				
 				 v.retardar();
 				 System.out.println("PRESTAMO OTORGADO ");
 				 System.out.println(driver.findElement(txtPrestamoOtorgado_cv).getText());
 				 				 
 				Assert.assertTrue(driver.findElement(txtPrestamoOtorgado_cv).getText().contains("$10,00"),"COINCIDEN");	
 				logueo.log(LogStatus.INFO,"VERIFICAR PRESTAMO  SOLICITADO ES DE 10 PESOS");
 				
 				System.out.println("SALDADO"); 				
 				 System.out.println( driver.findElement(txtPrestamoSaldado_cv).getText());
 				Assert.assertTrue(driver.findElement(txtPrestamoSaldado_cv).getText().contains("$0,00"),"PRESTAMO SALDADO");	
 				logueo.log(LogStatus.INFO,"VERIFICAR MONTO  SALDADO");
 				
 				System.out.println("PENDIENTE"); 
 				 System.out.println(driver.findElement(txtPrestamoPendiente_cv).getText());
 				
 				 
 				//Valida
 				 int resultado1=Integer.valueOf(driver.findElement(txtPrestamoPendiente_cv).getText().substring(1,3));
 				Assert.assertEquals(resultado1, total);
 	 			Assert.assertTrue(driver.findElement(txtPrestamoPendiente_cv).getText().contains("$12,00"),"PRESTAMO PENDIENTE");	
 	 			logueo.log(LogStatus.INFO,"VERIFICAR MONTO PENDIENTE ");
 	 			
 	 			
 	 		 
 	 		  
 	 			
 	 			System.out.println("COSTO SERVICIO"); 	 			
 	 			System.out.println( driver.findElement(txtCostoServicioVencido_cv).getText());
 	 			//es falso por que no deberia aparecer por debajo
 	 			//Assert.assertFalse(driver.findElement(txtCostoServicioVencido_cv).getText().contains("$2,00"),"COSTO SERVICIO PENDIENTE");	
 	 			//Verdadero aparece arriba
 	 			Assert.assertTrue(driver.findElement(txtCostoServicioVencido_cv).getText().contains("$2,00"),"COSTO SERVICIO PENDIENTE");
 	 			logueo.log(LogStatus.INFO,"VERIFICAR COSTO DE SERVICIO "); 	 			
 	 			v.retardar();
 	 			sacarCaptura(titulo,"__"+(contador++)+"__"+"VERIFICAR_PRESTAMO_ACREDITADO__",driver);
 	 			 
 				

				 v.retardar();
				driver.close();
 			 

 			 }
 				 
 		 } 
 			 
 			 
 		 driver.switchTo().window(ventanaPadre);
 		 System.out.println("Titulo de la ventana padre es "+driver.getTitle());
		
		
	}
	
	
	
	
	
	//CP_VERIFICAR_SALDADO_PARCIALMENTE
	 
	public void PrestamoSaldadoParcial(WebDriver driver,String linea)
	{
		
		
		 
		System.out.println("----------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------");
		System.out.println("-------CASO DE PRUEBA: VALIDAR PRESTAMO PARCIALMENTE SALDADO----");
		System.out.println("----------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------");
		
		
		int contador=0;
		String titulo="CP_PRESTAMO_SALDADO_PARCIAL";
		
		
		//RESULTADOs
				PrestamoModelo pm2=new PrestamoModelo();
				PrestamoController pc2=new PrestamoController();
				pm2=pc2.devolverObjPrestamo(linea);
				
				
			
				System.out.println("--------------------------------------------------------------------");
				System.out.println("------------ PRESTAMO ACREDITADO------------------------------------");
				System.out.println("--------------------------------------------------------------------"); 
				System.out.println("PRESTAMO ACREDITADO"+"  "+pm2.getLOANTIMELOANAMOUNT()/100000);//lo que debe 5
				System.out.println("PRESTAMO SALDADO"+"    "+pm2.getDEBITAMOUNT()/100000);//5 saldado  
				System.out.println("PRESTAMO PENDIENTE"+"   "+pm2.getCURRENTACCCREDITAMT()/100000);//10 prestamo
				
				pc2.saldarPrestamoParcialmente(pm2);
				int resultadoPrestamoAcreditado=Integer.valueOf(pm2.getLOANTIMELOANAMOUNT())/100000;
				int resultadoSaldado=Integer.valueOf(pm2.getDEBITAMOUNT())/100000;
				int resultadoPendiente=Integer.valueOf(pm2.getCURRENTACCCREDITAMT())/100000;
				
				System.out.println("--------------------------------------------------------------------");
				System.out.println("------------ PRESTAMO LUEGO DE SALDARLO PARCIALMENTE----------------");
				System.out.println("---------------------------------------------------------------------"); 
				System.out.println("PRESTAMO ACREDITADO"+"  "+resultadoPrestamoAcreditado);//lo que debe 5
				System.out.println("PRESTAMO SALDADO"+"    "+resultadoSaldado);//5 saldado  
				System.out.println("PRESTAMO PENDIENTE"+"   "+resultadoPendiente);//10 prestamo
				
				
		
		//ATRIBUTOS
	 
		 
		
		
		 
			ExtentReports logueo=ExtentReports.get(Test1.class);
			logueo.init("C:\\Users\\Valentino Falcucci\\Desktop\\Automatizacion\\DEMO_PORTAL\\Reporte\\Reporte_Prestamo_Saldo_Parcial.html",true);
			logueo.startTest("PROBANDO REPORTES");
			 
	 
		
		//ABRE VENTANA
 		JavascriptExecutor objJavasript2=(JavascriptExecutor)driver; 
 		String ventanaTab2="window.open('https://testing-simple.claro.com.ar/inicio/login?/')"; 
 		objJavasript2.executeScript(ventanaTab2);
 		System.out.println("LOGUEA PORTAL HIJO2");  
 		v.retardar();
 		
 		
 		
 		
 		 String ventanaPadre=driver.getWindowHandle();
 		 
 		 System.out.println("Ventana Padre "+ventanaPadre);
 		 
 		 Set<String> todasVentanas=driver.getWindowHandles();//importar java.utils
 		 
 		 int cantidad=todasVentanas.size();
 		 
 		 System.out.println("Las ventanas abiertas"+cantidad);
 		 
 		 
 		 for (String hijo : todasVentanas) {
 			
 			 if(!ventanaPadre.equalsIgnoreCase(hijo))
 			 {
 				 driver.switchTo().window(hijo);
 				
 				 
 				//1-ETAPA : LOGIN
 				logueo.log(LogStatus.INFO,"LOGIN-INGRESANDO AL PORTAL");
 				 
 		 		driver.findElement(inputLogin).sendKeys(linea);
 				 driver.findElement(botonLogin).click(); 
 				v.retardar();
 				
 				
 				
 			
 				
 				
 			 //2-ETAPA -PRESIONAR LINK VER DETALLE EN LA HOME
 				 //Se valida que se vea el LINK VER DETALLES
 				
 				
 				Assert.assertTrue(driver.findElement(linkVerDetalles).getText().contains("Ver detalles"));
 				 System.out.println("EL LINK ES "+"  "+driver.findElement(linkVerDetalles).getText());
 				 sacarCaptura(titulo,"__"+(contador++)+"__"+"VERIFICAR_LINK_VER_DETALLE__",driver); 	
 				logueo.log(LogStatus.INFO,"VERIFICAR QUE SE MUESTRE LINK VER DETALLES");
 				 driver.findElement(linkVerDetalles).click();
 				v.retardar();
 				
 				 
 				
 					
 			//3-ETAPA-VERIFICAR PRESTAMO
 				//Hacemos click en 
 				
 				
 				//Calculo el saldo pendiente a pagar desde la base
 				PrestamoModelo pm1=new PrestamoModelo();
 				PrestamoController pc1=new PrestamoController();
 				pm1=pc1.devolverObjPrestamo(linea);
 			     pc1.editarPrestamo(pm1); 			     
 				int total=(pm1.getCURRENTACCCREDITAMT()+pm1.getCURRENTACCSERVICECOST())/100000;
 				
 				
 				
 				 v.retardar();
 				 System.out.println("PRESTAMO OTORGADO ");
 				 System.out.println(driver.findElement(textPrestamo10_dp).getText());
 				 				 
 				Assert.assertTrue(driver.findElement(textPrestamo10_dp).getText().contains("$10,00"),"COINCIDEN");	
 				logueo.log(LogStatus.INFO,"VERIFICAR PRESTAMO  SOLICITADO ES DE 10 PESOS");
 				
 				
 				
 				
 				
 				System.out.println("SALDADO"); 				
 				 System.out.println( driver.findElement(textPrestamoSaldado_dp).getText());
 				//Assert.assertTrue(driver.findElement(textPrestamoSaldado_dp).getText().contains("$5,00"),"PRESTAMO SALDADO");	
 				//valido
 				int saldadoFrontend=Integer.valueOf(driver.findElement(textPrestamoSaldado_dp).getText().substring(1,2));
 				System.out.println(saldadoFrontend);
 						System.out.println(resultadoSaldado);
 				Assert.assertEquals(saldadoFrontend, resultadoSaldado); 
 				logueo.log(LogStatus.INFO,"VERIFICAR MONTO  SALDADO");
 				
 				
  				 
  				
 				
 				
 				System.out.println("PENDIENTE"); 
 				 System.out.println(driver.findElement(txtPrestamoPendiente_dp).getText()); 
 				//Valida
 				 int pendienteFrontend=Integer.valueOf(driver.findElement(txtPrestamoPendiente_dp).getText().substring(1,2));
 				Assert.assertEquals(resultadoPendiente, pendienteFrontend);
 	 			Assert.assertTrue(driver.findElement(txtPrestamoPendiente_dp).getText().contains("$5,00"),"PRESTAMO PENDIENTE");	
 	 			logueo.log(LogStatus.INFO,"VERIFICAR MONTO PENDIENTE ");
 	 			
 	 			
 	 		 
 	 		  
 	 			
 	 			System.out.println("COSTO SERVICIO"); 	 			
 	 			System.out.println( driver.findElement(txtCostoServicioVigente_dp).getText());
 	 			//es falso por que no deberia aparecer por debajo
 	 			//Assert.assertFalse(driver.findElement(txtCostoServicioVencido_cv).getText().contains("$2,00"),"COSTO SERVICIO PENDIENTE");	
 	 			//Verdadero aparece arriba
 	 			Assert.assertTrue(driver.findElement(txtCostoServicioVigente_dp).getText().contains("$2,00"),"COSTO SERVICIO PENDIENTE");
 	 			logueo.log(LogStatus.INFO,"VERIFICAR COSTO DE SERVICIO "); 	 			
 	 			v.retardar();
 	 			sacarCaptura(titulo,"__"+(contador++)+"__"+"VERIFICAR_PRESTAMO_ACREDITADO__",driver);
 	 			 
 				

				 v.retardar();
				driver.close();
 			 

 			 }
 				 
 		 } 
 			 
 			 
 		 driver.switchTo().window(ventanaPadre);
 		 System.out.println("Titulo de la ventana padre es "+driver.getTitle());
		
		
	}
	
	
	
	
	public void DriverFuncionando( WebDriver driver)
	{
		 
		    
//		DesiredCapabilities cap=new DesiredCapabilities();
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Valentino Falcucci\\Desktop\\Automatizacion\\PruebaPortal\\Driver\\Chrome\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		String link="https://testing-simple.claro.com.ar/inicio/";
//		String usuario="CLARO";
//		String contrasenia="quebuenoeselportal";
//		  String URL = "http:// "+ usuario + ":" + contrasenia + "@" + link;
//		driver.navigate().to(URL);
		
		
		
		
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Valentino Falcucci\\Desktop\\Automatizacion\\DEMO_PORTAL\\Driver\\Firefox\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://www.toolsqa.com");
         
		 
		        // Print a Log In message to the screen
		        System.out.println("Successfully opened the website www.Store.Demoqa.com");
		 
		        
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
	
	
	
	
	
	
	
	

	
	
	
	//-------------------------OTROS METODOS------------------------------------------
	


	public static void sacarCaptura(String casoPrueba, String etapa,WebDriver driver)
	{
		
		File captura=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		try {
		 
			Date fecha = new Date();
			   DateFormat formato = new SimpleDateFormat(("yyyy-mm-dd HH.mm.ss")); 
			   String directorio = "C:\\Users\\Valentino Falcucci\\Desktop\\Automatizacion\\DEMO_PORTAL\\Capturas\\";
			   File destino=new File(directorio);
			  // FileUtils.copyFile(captura,new File(casoPrueba+" "+etapa+" "+System.currentTimeMillis()+".png"));
			   
			  // FileUtils.copyFile(captura, destino);
			   FileUtils.copyFile(captura, new File(directorio +casoPrueba+etapa+formato.format(fecha)+".png"));
			
			
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
	}
	
	
	 
		
	
	
	public void eliminarPresta(String linea)
	{
		PrestamoController pc=new PrestamoController();
		boolean resultado=pc.verificarPoseePrestamo1(linea);
		if(resultado==true)
		{
		 pc.eliminarPrestamo(linea);	
			
		}
	}
	
	
	
	
	
	public void seleccionarElementos(WebDriver driver, String linea)
	{
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------");
		System.out.println("------------CASO DE PRUEBA: VALIDAR LISTADO PAQUETES-----------");
		System.out.println("---------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------");
		
		int contador=0;
		String titulo="CP_ACREDITAR_PRESTAMO";
		//Variables
		int saldoInicialInt;
		int saldoFinalInt;
		int prestamoInt;
		
		 
			ExtentReports logueo=ExtentReports.get(Test1.class);
			logueo.init("C:\\Users\\Valentino Falcucci\\Desktop\\Automatizacion\\DEMO_PORTAL\\Reporte\\Reporte_Prestamo.html",true);
			logueo.startTest("PROBANDO REPORTES");
			 
 		JavascriptExecutor objJavasript2=(JavascriptExecutor)driver;
 		//String ventanaTab2="window.open('https://testing-simple.claro.com.ar/inicio/')";
 		String ventanaTab2="window.open('https://testing-simple.claro.com.ar/inicio/login?/')";
 	
 		objJavasript2.executeScript(ventanaTab2);
 		System.out.println("LOGUEA PORTAL HIJO2"); 
 		
 		v.retardar();
 		
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
 				 

		 				//1-ETAPA : LOGIN
		 				logueo.log(LogStatus.INFO,"LOGIN-INGRESANDO AL PORTAL");
		 				 
		 		 		driver.findElement(inputLogin).sendKeys(linea);
		 				 driver.findElement(botonLogin).click(); 
		 				v.retardar();
		 				
		 				System.out.println("BUSCANDO LOS ELEMENTOS");
		 				ArrayList<PaqueteModelo> lista=new ArrayList<PaqueteModelo>();				  
		 				
		 				
		 				List<WebElement> listado=driver.findElements(By.xpath("/html[1]/body[1]/main[1]/div[2]/div[2]"));
		 				
		 				 for (WebElement we : listado) {
		 					 System.out.println(we.getText());
		 					 
		 					  String nombre=we.getText();
		 					 System.out.println(nombre.substring(0,10));
		 					 
		 					 
//		 					PaqueteModelo paquete=new PaqueteModelo();
//		 						if(we.getText().substring(0,1)=="P")
//		 						{
//		 							System.out.println(we.getText().substring(0,1));
//		 							paquete.setDescripcion(we.getText());
//		 							
//		 						}else if(we.getText().substring(0,1)=="$")
//		 								{
//		 							System.out.println(we.getText().substring(0,1));
//		 							paquete.setPrecio(we.getText());
//		 							
//		 								}
//		 						lista.add(paquete);		 					
		 				 }
 				 
// 				 for (PaqueteModelo p : lista) {
//				System.out.println(p.toString());
//				}
 				 
 			 }//if padre
	
//		Internet
//		Pack 200MB por 1 día
//		$18,00
//		Pack 1GB por 1 día
//		$35,00
		
	    }
		
	}
	
	
	
	
	
	
	
	
	
	
	//CLASE MAIN
	
		
	
	
	public static void main(String[] args) {
		
		PrestamoModelo prestamo=new PrestamoModelo();
		PrestamoController pc=new PrestamoController();
		String linea="3512090009";
		Test1 obj=new Test1();
		obj.eliminarPresta(linea);
		System.out.println("ELIMINO EL PRESTAMO");
		
		
		WebDriver driver; 
 		driver=obj.Setup();
	 	//obj.login1(driver,linea);	
	
		//obj.seleccionarElementos(driver,linea);
		
		//obj.detallePrestamo(driver,linea);
		
		
		
 	//vencer costo servicio
//		prestamo=pc.devolverObjPrestamo(linea);
//		pc.vencerCostoServicio(prestamo);
//		pc.editarPrestamo(prestamo);
// 	
//		obj.costoServicioVencido(driver, linea);
//		prestamo=pc.devolverObjPrestamo(linea);
//		System.out.println("FECHA COSTO SERVICIO"+"  "+prestamo.getFREESERVICECOSTDATE());
//		
//		prestamo=pc.devolverObjPrestamo(linea); 
//		obj.PrestamoSaldadoParcial(driver, linea);
 	
		
		// ELIMINO EL PRESTAMO
		//obj.eliminarPresta(linea);
		 
	 
		obj.seleccionarElementos(driver,linea);
		
		
		

	}//main
	
	
	

}//clase


