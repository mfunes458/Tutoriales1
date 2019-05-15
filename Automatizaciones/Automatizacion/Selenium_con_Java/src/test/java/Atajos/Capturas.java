package Atajos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Capturas {
	
	public static void sacarCaptura(String nombre,WebDriver driver)
	{
		
		File captura=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		try {
		 
			FileUtils.copyFile(captura,new File(nombre+" "+System.currentTimeMillis()+".png"));
			
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
	}
	

}//clase
