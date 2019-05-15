package TestSet;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class Test2 {

	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) {

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                try {
					FileUtils.copyFile(SrcFile, DestFile);
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

    }
	
	
	
	

	@Test
	public void probarReportes()
	{
		 
		 ExtentReports logueo=ExtentReports.get(Test1.class);
		logueo.init("C:\\ReporteSelenium\\report1.html",true);
		logueo.startTest("PRIMERA PRUEBA");
		
	 
		

		 // Create a new instance of the Firefox driver
		 
		 String exePath = "C:\\Users\\Valentino\\Desktop\\Automatizacion\\Reportes\\Driver\\Chrome\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 
		 
			logueo.log(LogStatus.INFO,"EL BROWSER SE INICIO"); 
			 
			  System.out.println("EL BROWSER SE INICIO");
		        //Launch the Online Store Website
		 driver.get("https://www.toolsqa.com/selenium-webdriver/running-tests-in-chrome-browser/");
		 
		 
		 String titulo=driver.getTitle();
		 logueo.log(LogStatus.INFO,"CAPTAMOS EL TITULO"); 
		 System.out.println("CAPTAMOS EL TITULO");
		 
		 Assert.assertTrue(titulo.contains("Steps to Running tests in Chrome browser using Selenium"));
		 logueo.log(LogStatus.PASS,"EL TITULO SE VERIFICO");  
		 this.takeSnapShot(driver, "C:\\ReporteSelenium\\t.png") ;  
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		 logueo.attachScreenshot("C:\\Imagen\\Imagen1.png","SE CAPTO LA IMAGEN CORRECTAMENTE");
		 System.out.println("EL TITULO SE VERIFICO");
		 System.out.println("guardo imagen");
		 
		 logueo.endTest();
		 
		        // Print a Log In message to the screen
		        System.out.println("Successfully opened the website www.Store.Demoqa.com");
		 
		 //Wait for 5 Sec
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
		
	}
	
	
	
	public static void main(String[] args) {
	 
 
		Test2 obj=new Test2();
		obj.probarReportes();

	}//Main

}//clase
