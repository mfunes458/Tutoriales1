package Pages;

import java.util.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.internal.Systematiser;

public class Prueba {
	
	
	private WebDriver driver;
	private By listado;
	 private By userField;
	 private By passField;
	 private By loginButton;
	 
	 private List<WebElement> listaInput;
	 private List<WebElement> listaLink;//importar java.util
	
	 @FindBy(how=How.TAG_NAME,using="input")
	 private List<WebElement> listaInputPageObject;
	 
	 private ArrayList<WebElement> listaInputArray;
	 
	public Prueba(WebDriver d)
	{
		this.driver=d;	 
		this.listado=By.tagName("input");
		this.userField=By.name("userName");
		this.passField=By.name("password");
		this.loginButton=By.name("login");
		
		this.listaLink=driver.findElements(By.tagName("a"));
		this.listaInput=driver.findElements(By.tagName("input"));
		this.listaInputArray=(ArrayList<WebElement>) driver.findElements(By.tagName("input"));
		
		
		PageFactory.initElements(d, this);
	}
	
	
	public void login(String usuario,String password)
	{
      WebElement inputUsuario=driver.findElement(userField);
      inputUsuario.sendKeys(usuario);
      WebElement inputPass=driver.findElement(passField);
      inputUsuario.sendKeys(password);
      WebElement botonEntrar=driver.findElement(loginButton);
      botonEntrar.click(); 
	}
	
	
	
	

	 public void recorreElemtos()
			{
				ArrayList<WebElement> listaItem = (ArrayList<WebElement>) driver.findElements(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[3]\r\n" + 
						"")); 

				for (WebElement element: listaItem) {
				      System.out.println(element.getText());
				      System.out.println(element.getTagName());
				}

			}
	
	//verificar anda mal
		public void mostrarElementos()
		{
			for (WebElement obj : listaInput) {
				System.out.println(obj.getText());
			}


		}
	
		//verificar anda mal
		public void loginLista()
		{
					
			listaInput.get(2).sendKeys("usuario");
			listaInput.get(3).sendKeys("contaseña");
			//((WebElement) listadoPageObject.get(1)).sendKeys(user);
			//((WebElement) listadoPageObject.get(2)).sendKeys(pass);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			 
		}
		
		
		//verificar anda mal
				public void loginListaPageObject()
				{ 
					 
					  listaInputPageObject.get(2).sendKeys("usuario");
					   listaInputPageObject.get(3).sendKeys("PASSSSS");
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					 
				}
				
		
				
				//verificar anda mal
				public void loginListaArray()
				{ 
					 
					listaInputArray.get(2).sendKeys("usuario");
					listaInputArray.get(3).sendKeys("PASSSSS");
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					 
				}		
				
				
		
		public void mostrarLink()
		{
			for (WebElement obj : listaLink) {
				
				String texto=obj.getText();
				System.out.println(texto); 
			} 
		}
		
}//clase
