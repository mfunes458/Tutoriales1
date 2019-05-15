import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prueba1 {

	public static void main(String[] args) {
	 
		String projectPath=System.getProperty("user.dir"); //Devuelve el directorio donde se encuentra el proyecto.
		System.out.println(projectPath);
		
		  
			 //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Valentino\\Desktop\\Automatizacion\\Proyectos\\Driver\\Firefox\\geckodriver.exe");
		 System.setProperty("webdriver.gecko.driver",projectPath+"\\Driver\\Firefox\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
			 driver.get("https://www.lavoz.com.ar");
			 
			 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				 
				e.printStackTrace();
				System.out.println(e.toString());
			}
			 driver.quit();
		
		
	}//main

}//clase
