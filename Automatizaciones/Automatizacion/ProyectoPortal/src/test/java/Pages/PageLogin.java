package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

 

public class PageLogin {

	private WebDriver driver;
	private By billNumberField; 
	private By loginButton;
	//constructor que inicia con un Driver
	//driver permite capturar  los objetos de la Pagina.
	public PageLogin(WebDriver d)
	{
		this.driver=d;	
		this.billNumberField=By.id("billNumber"); 
		this.loginButton=By.linkText("Ver portal como línea");
	}
	
	 
	
	public void loguearBillNumber(String billNumber)
	{
		 driver.findElement(billNumberField).sendKeys(billNumber);
	WebElement botonLogin=driver.findElement(loginButton);
	botonLogin.click();
	 
	}
	
	
}
