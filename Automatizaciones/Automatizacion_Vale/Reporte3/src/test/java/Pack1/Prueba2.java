package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class Prueba2 {
	
	
	
	
	 @Test

	    public void verifySeleniumBlog(){



	          // Create object of extent report and specify the Class name in get method

	          // in my case I have used AdvanceReporting.class

	          ExtentReports extent = ExtentReports.get(Prueba1.class);



	          // Call init method and specify the location where you want to save this report

	          // second parameter is set to true it means it will overwrite report with new one

	          extent.init("C:\\Users\\Valentino\\Desktop\\Automatizacion\\Reporte3\\Report\\myreport.html", true);//misma carpeta que driver



	          // Start Test

	          extent.startTest("Verify Page Title");


	//
//	          System.setProperty("webdriver.gecko.driver", "C:\\Users\\Valentino\\Desktop\\Automatizacion\\Reporte3\\Driver\\Firefox\\geckodriver.exe");
//	          WebDriver driver = new FirefoxDriver(); 
	          
	          System.setProperty("webdriver.chrome.driver", "C:\\Users\\Valentino\\Desktop\\Automatizacion\\Reporte3\\Driver\\Firefox\\chromedriver.exe");
	 		 WebDriver driver = new ChromeDriver();
	 		 
	 		 
	          driver.manage().window().maximize();

	          extent.log(LogStatus.INFO, "Browser started"); 
	          // Open application
	         
	           driver.get("http://learn-automation.com");
	          //driver.get(" https://stackoverflow.com/questions/24709769/java-using-system-getpropertyuser-dir-to-get-the-home-directory?lq=1");
	          extent.log(LogStatus.INFO, "Navigated to www.learn-automation.com");



	          // get title

	          String title=driver.getTitle();

	          extent.log(LogStatus.INFO, "Get the current title");



	          // Verify title

	           Assert.assertTrue(title.contains("Selenium"));

	           extent.log(LogStatus.PASS, "Title verified");



	           // In case you want to attach screenshot then use below method

	           // I am taking random image but you have to take screenshot at run time and specify the path

	           extent.attachScreenshot("C:/Users/Valentino/Desktop/Automatizacion/Reporte3/Report/FOTOOOO.jpg");




	           // Close application

	           driver.quit();

	           extent.log(LogStatus.INFO, "Browser closed");



	           // close report

	           extent.endTest();



	    }
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
