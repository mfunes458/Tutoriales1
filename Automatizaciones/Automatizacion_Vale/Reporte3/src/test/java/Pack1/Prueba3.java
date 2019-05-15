package Pack1;

import javax.naming.ldap.ExtendedRequest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;





public class Prueba3 {

	
	ExtentReports extent;
    ExtendedRequest test;
    WebDriver driver;
     
    
    
    @BeforeTest
    public void init()
    {
        extent = new ExtentReports();
        extent.init("", true);
    }
    
     
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
