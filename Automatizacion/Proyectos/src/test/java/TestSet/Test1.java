package TestSet;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Prestamo.PrestamoController;
import Prestamo.PrestamoModelo;
import Prestamo.Varios;

import org.openqa.selenium.JavascriptExecutor;
 
 

 

public class Test1 {
	

	
	
	
private WebDriver driver;
	
	private By inputLogin=By.name("billNumber");
	String billNumber="1132260012";
	
	
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
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Valentino Falcucci\\Desktop\\Programas\\Driver\\Chrome Driver\\ChromeDriver 74\\chromedriver.exe");
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
		
		 
			 
		
			
//		 
		
		
		
 		JavascriptExecutor objJavasript2=(JavascriptExecutor)driver;
 		 
 		String ventanaTab2="window.open('https://testing-simple.claro.com.ar/inicio/login?/')";
 	
 		objJavasript2.executeScript(ventanaTab2);
 		System.out.println("LOGUEA PORTAL HIJO2"); 
 		
 		try {
			Thread.sleep(4000);//espera 5 segundos
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
 		
 
 		
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
 				 //LA LINEA TIENE QUE TENER MAS DE 100 PESOS
 				 
 				 System.out.println("SALDO INICIAL");
 				 System.out.println(driver.findElement(textoSaldo).getText());
 				saldoInicialInt=Integer.parseInt(driver.findElement(saldoInicialString).getText().substring(1,4));
 				v.retardar();
 				driver.findElement(linkVerMas).click();
 				  
 				 
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
	 			
	 		 		driver.findElement(inputLogin).sendKeys(linea);
	 				 driver.findElement(botonLogin).click(); 
	 				v.retardar();
	 				
	 				
	 				
	 			 //2-ETAPA -PRESIONAR LINK VER DETALLE EN LA HOME
	 				 //Se valida que se vea el LINK VER DETALLES
	 				
	 				 Assert.assertTrue(driver.findElement(linkVerDetalles).getText().contains("Ver detalles"));
	 				 System.out.println("EL LINK ES "+"  "+driver.findElement(linkVerDetalles).getText());	 				
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
	 	 		 			
	 	 			v.retardar();
	 	 			
	 	 			 
	 				
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
	 			
	 				 
	 		 		driver.findElement(inputLogin).sendKeys(linea);
	 				 driver.findElement(botonLogin).click(); 
	 				v.retardar();
	 				
	 				
	 				
	 			
	 				
	 				
	 			 //2-ETAPA -PRESIONAR LINK VER DETALLE EN LA HOME
	 				 //Se valida que se vea el LINK VER DETALLES
	 				
	 				
	 				Assert.assertTrue(driver.findElement(linkVerDetalles).getText().contains("Ver detalles"));
	 				 System.out.println("EL LINK ES "+"  "+driver.findElement(linkVerDetalles).getText());
	 				
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
	 			
	 				
	 				System.out.println("SALDADO"); 				
	 				 System.out.println( driver.findElement(txtPrestamoSaldado_cv).getText());
	 				Assert.assertTrue(driver.findElement(txtPrestamoSaldado_cv).getText().contains("$0,00"),"PRESTAMO SALDADO");	
	 			
	 				
	 				System.out.println("PENDIENTE"); 
	 				 System.out.println(driver.findElement(txtPrestamoPendiente_cv).getText());
	 				
	 				 
	 				//Valida
	 				 int resultado1=Integer.valueOf(driver.findElement(txtPrestamoPendiente_cv).getText().substring(1,3));
	 				Assert.assertEquals(resultado1, total);
	 	 			Assert.assertTrue(driver.findElement(txtPrestamoPendiente_cv).getText().contains("$12,00"),"PRESTAMO PENDIENTE");	
	 	 			
	 	 			
	 	 		 
	 	 		  
	 	 			
	 	 			System.out.println("COSTO SERVICIO"); 	 			
	 	 			System.out.println( driver.findElement(txtCostoServicioVencido_cv).getText());
	 	 			//es falso por que no deberia aparecer por debajo
	 	 			//Assert.assertFalse(driver.findElement(txtCostoServicioVencido_cv).getText().contains("$2,00"),"COSTO SERVICIO PENDIENTE");	
	 	 			//Verdadero aparece arriba
	 	 			Assert.assertTrue(driver.findElement(txtCostoServicioVencido_cv).getText().contains("$2,00"),"COSTO SERVICIO PENDIENTE");
	 	 				
	 	 			v.retardar();	 	 			
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
	 			
	 				 
	 		 		driver.findElement(inputLogin).sendKeys(linea);
	 				 driver.findElement(botonLogin).click(); 
	 				v.retardar();
	 				
	 				
	 				
	 			
	 				
	 				
	 			 //2-ETAPA -PRESIONAR LINK VER DETALLE EN LA HOME
	 				 //Se valida que se vea el LINK VER DETALLES
	 				
	 				
	 				Assert.assertTrue(driver.findElement(linkVerDetalles).getText().contains("Ver detalles"));
	 				 System.out.println("EL LINK ES "+"  "+driver.findElement(linkVerDetalles).getText());
	 					
	 				
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
	 				
	 				
	 				
	 				
	 				
	 				
	 				System.out.println("SALDADO"); 				
	 				 System.out.println( driver.findElement(textPrestamoSaldado_dp).getText());
	 				//Assert.assertTrue(driver.findElement(textPrestamoSaldado_dp).getText().contains("$5,00"),"PRESTAMO SALDADO");	
	 				//valido
	 				int saldadoFrontend=Integer.valueOf(driver.findElement(textPrestamoSaldado_dp).getText().substring(1,2));
	 				System.out.println(saldadoFrontend);
	 						System.out.println(resultadoSaldado);
	 				Assert.assertEquals(saldadoFrontend, resultadoSaldado); 
	 			
	 				
	 				
	  				 
	  				
	 				
	 				
	 				System.out.println("PENDIENTE"); 
	 				 System.out.println(driver.findElement(txtPrestamoPendiente_dp).getText()); 
	 				//Valida
	 				 int pendienteFrontend=Integer.valueOf(driver.findElement(txtPrestamoPendiente_dp).getText().substring(1,2));
	 				Assert.assertEquals(resultadoPendiente, pendienteFrontend);
	 	 			Assert.assertTrue(driver.findElement(txtPrestamoPendiente_dp).getText().contains("$5,00"),"PRESTAMO PENDIENTE");	
	 	
	 	 			
	 	 			
	 	 		 
	 	 		  
	 	 			
	 	 			System.out.println("COSTO SERVICIO"); 	 			
	 	 			System.out.println( driver.findElement(txtCostoServicioVigente_dp).getText());
	 	 			//es falso por que no deberia aparecer por debajo
	 	 			//Assert.assertFalse(driver.findElement(txtCostoServicioVencido_cv).getText().contains("$2,00"),"COSTO SERVICIO PENDIENTE");	
	 	 			//Verdadero aparece arriba
	 	 			Assert.assertTrue(driver.findElement(txtCostoServicioVigente_dp).getText().contains("$2,00"),"COSTO SERVICIO PENDIENTE");
	 	 					
	 	 			v.retardar(); 

					 v.retardar();
					driver.close();
	 			 

	 			 }
	 				 
	 		 } 
	 			 
	 			 
	 		 driver.switchTo().window(ventanaPadre);
	 		 System.out.println("Titulo de la ventana padre es "+driver.getTitle());
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	public static void main(String[] args) {

		PrestamoModelo prestamo=new PrestamoModelo();
		PrestamoController pc=new PrestamoController();
		String linea="1132260012";
		Test1 obj=new Test1();
		pc.eliminarPrestamo(linea);
		System.out.println("ELIMINO EL PRESTAMO");
		
		
		WebDriver driver; 
 		driver=obj.Setup();
 		 obj.login1(driver,linea);	 
 		obj.detallePrestamo(driver,linea); 
	 
 		
 		
 		//vencer costo servicio
		prestamo=pc.devolverObjPrestamo(linea);
		pc.vencerCostoServicio(prestamo);
		pc.editarPrestamo(prestamo);
			obj.costoServicioVencido(driver, linea);
		prestamo=pc.devolverObjPrestamo(linea);
		System.out.println("FECHA COSTO SERVICIO"+"  "+prestamo.getFREESERVICECOSTDATE());
		
//		prestamo=pc.devolverObjPrestamo(linea); 
//		obj.PrestamoSaldadoParcial(driver, linea);
 	
		
		

	}//main
}//clase
