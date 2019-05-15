package Pages;

//importar
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PageLogon { //mail logueado

	private WebDriver driver;
	private By logonText;
	  
	public PageLogon(WebDriver d)
	{
		this.driver=d;		
		this.logonText=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font/b");
	}
	
	
	
	public void  assertLogonPage()
	{
		Assert.assertTrue(driver.findElement(logonText).getText().contains("Welcome back to Mercury Tours!"));
		
	}
	
	
}//clase
