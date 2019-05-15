package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;//objeto dropdowns
import org.testng.Assert;

public class PageReservation {

	
	private WebDriver driver;
	private By reservationText;
	
	//objeto dropDowns
	private By pasajeroDrops;
	private By partidaDrops;
    private By destinoDrops;
	
	public PageReservation(WebDriver d)
	{
		this.driver=d;		
		this.reservationText=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font");
		this.pasajeroDrops=By.name("passCount");
		this.partidaDrops=By.name("fromPort");
		this.destinoDrops=By.name("toPort");
	
	}
	
	
	
	public void  assertReservationPage()
	{
		Assert.assertTrue(driver.findElement(reservationText).getText().contains("Use our Flight Finder to search for the lowest"));
		
	}
	
	
	//Metodo seleccionar Item Pasaje
	//Parametro: cantidad pasajero quiero
	//Creo objeto select(combo) , envio la cantidad para que se muestre
	//selecciono por text visible
	public void selectPasajero(int cantidad)
	{
		Select selectPasajero=new Select(driver.findElement(pasajeroDrops));
		selectPasajero.selectByVisibleText(Integer.toString(cantidad));
		
	}
	
	
	//selecciona por el indice comienza en CERO
	public void selectPartida(int indice)
	{
		Select selectPasajero=new Select(driver.findElement(partidaDrops));
		selectPasajero.selectByIndex(indice);		
	}
	
	
	//Selecciona por el Value 
	public void selectDestino(String ciudad)
	{
		Select selectPasajero=new Select(driver.findElement(destinoDrops));
		selectPasajero.selectByValue(ciudad);
		
	}
	
	
	
	
	
	
}//clase
