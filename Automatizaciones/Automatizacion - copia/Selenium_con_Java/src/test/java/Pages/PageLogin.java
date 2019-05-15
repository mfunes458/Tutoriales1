package Pages;

import java.util.List;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;


//captura pantalla
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;//captura pantalla
import java.io.IOException;


import org.apache.commons.io.FileUtils; 
import com.google.common.io.Files;


//formato date
import java.text.DateFormat;
import java.text.SimpleDateFormat;


//importar
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.net.LinuxEphemeralPortRangeDetector;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



import Atajos.Helpers;

public class PageLogin {

	private WebDriver driver;
	
	//PageObject
	//@FindBy(how=How.NAME,using="userName")	
	@FindBy(name="userName")	
	//@FindBy(name="userName")
	private WebElement userFieldElement;
	 
	    
	@FindBy(how=How.NAME,using="password")
//	@FindBy(name="password")
	private WebElement passFieldElement;
	
	@FindBy(how=How.NAME,using="login")	
	//@FindBy(name="login")
	private WebElement loginButtonElement;
	
	
	@FindBy(how=How.TAG_NAME,using="input")	 
	//@FindBy(tagName="input")	 
    // private ArrayList<WebElement>   listadoPageObject;
   private List<WebElement>   listadoPageObject;
 
 	 
	// private By userField;
 	//	private By passField;
 	//	private By loginButton;
	//constructor que inicia con un Driver
	//driver permite capturar  los objetos de la Pagina.	
	//private By inputs;
	
	 
	public PageLogin(WebDriver d)
	{
		this.driver=d;	
		PageFactory.initElements(d, this);
		// this.userField=By.name("userName");
		//this.passField=By.name("password");
		//		this.loginButton=By.name("login");
		//this.inputs=By.tagName("input");
		
		
		//listadoPageObject=new ArrayList<WebElement>();
		
	}
	
	//Metodo Login
	
	public void login(String usuario,String password)
	{
		userFieldElement.sendKeys(usuario);
		passFieldElement.sendKeys(password);
		loginButtonElement.click();
		
		
		  //driver.findElement(userField).sendKeys(usuario);;
//		driver.findElement(passField).sendKeys(password);
//		driver.findElement(loginButton).click();
		
		
		
		
		//Captura de Pantalla (objeto abstracto)
		
//		
//		File captura=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	 
//		String directorio = "C:\\Users\\Valentino Falcucci\\Desktop\\Automatizacion\\Selenium_con_Java\\Capturas\\";
//		
//		//inserto el objeto abstracto en un objeto real
//		//Lo guarda dentro del directorio del proyecto
//		try {
//		 
//			  Date fecha = new Date();
//			  DateFormat formato = new SimpleDateFormat("yyyy-mm-dd HH.mm.ss");
//			   FileUtils.copyFile(captura, new File(directorio + "LOGIN " + formato.format(fecha) + ".png"));
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
		
		
		
		//si la pagina tarda mas de 10 segundos en cargar arroja timeout
		//si se carga en dos segundo deja de operar el metodo
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Helpers helper=new Helpers();
		// helper.demora(3);  
	}
	
	
	//verificar anda mal
	public void fields_login(String user, String pass)
	{
//		ArrayList<WebElement> listaInputs=(ArrayList<WebElement>) driver.findElements(inputs);
//		listaInputs.get(1).sendKeys(user);
//		listaInputs.get(2).sendKeys(pass);
 
		
		//((WebElement) listadoPageObject.get(1)).sendKeys(user);
		//((WebElement) listadoPageObject.get(2)).sendKeys(pass);
		
		  listadoPageObject.get(2).sendKeys(user);
		  listadoPageObject.get(3).sendKeys(pass);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	//verificar anda mal
	public void verificarInputs()
	{
//		ArrayList<WebElement> listaInputs=(ArrayList<WebElement>) driver.findElements(inputs);
//		System.out.println(listaInputs.size());
//		Assert.assertTrue(listaInputs.size()==5);//asignacion comparacion
		
		System.out.println(String.valueOf(listadoPageObject.size()));
 		Assert.assertTrue(listadoPageObject.size()==4);//asignacion comparacion
	}
	
	
	
	
	
	
	//Metodo para capturar el Titulo
	//<title>Welcome: Mercury Tours</title>
	 
	public void insertarTituloUsuario()
	{
		String titulo=driver.getTitle();
		login(titulo,"a");
		Assert.assertEquals("Welcome: Mercury Tours", titulo);
		
	}
	
	
	 
	
	
	
	
}//clase
