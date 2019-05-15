package Pages;

import org.openqa.selenium.By;
//importar
import org.openqa.selenium.WebDriver;

import Atajos.Helpers;

public class PageLogin {

	private WebDriver driver;
	private By userField;
	private By passField;
	private By loginButton;
	//constructor que inicia con un Driver
	//driver permite capturar  los objetos de la Pagina.
	public PageLogin(WebDriver d)
	{
		this.driver=d;	
		this.userField=By.name("userName");
		this.passField=By.name("password");
		this.loginButton=By.name("login");
	}
	
	//Metodo Login
	
	public void login(String usuario,String password)
	{

		 driver.findElement(userField).sendKeys(usuario);;
		driver.findElement(passField).sendKeys(password);
		driver.findElement(loginButton).click();
		 Helpers helper=new Helpers();
		 helper.demora(3);  
	}
	
	
	
	
	
}//clase
