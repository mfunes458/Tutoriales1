package Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PruebaMozilla {

	public static void main(String[] args) {
		  
		String projectPath=System.getProperty("user.dir");
		System.out.println("projectPath "+projectPath);//si no trae nada es null (no existe) 
		System.setProperty("webdriver.gecko.driver",projectPath+"\\Driver\\Firefox\\geckodriver.exe");

		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Valentino Falcucci\\Desktop\\semana 20-25\\Raghav\\AutomationStep\\Driver\\Firefox\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.seleniumhq.org/");

	}//clase
}//Espacio
