package Atajos;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class WebDriverGestion {

	
	public static void setWindowsSize(WebDriver driver,String tamanio) 
	{
		if(tamanio.toLowerCase()=="maximizar")
		{
			driver.manage().window().maximize();

		}
		if(tamanio.toLowerCase()=="pantallaFull")
		{ 
			 driver.manage().window().fullscreen();//pantalla completa

		}
		
	}
	
	
	public static void setWindowsSize(WebDriver driver, int ancho,int alto) 
	{ 
		driver.manage().window().setSize(new Dimension(ancho,alto));//tamaño		 
	}
	
	
	
}//clase
