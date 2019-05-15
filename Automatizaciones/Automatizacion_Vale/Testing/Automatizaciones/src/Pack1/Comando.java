package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Comando {

	public static void main(String[] args) {
		 
		
		
		
		 String exePath = "C:\\Users\\Valentino\\Desktop\\Testing\\Drivers\\Chrome Driver\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 
		 
		 

		 
		        // Print a Log In message to the screen
		        System.out.println("Se abrio la ventana Correcta");
		
		   	 //Wait for 5 Sec
				 try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
	 
			 
			 // Storing the Application Url in the String variable
			 String url = "https://www.google.com/";
			 
			 //Launch the ToolsQA WebSite
			 driver.get(url);
			 
			 // Storing Title name in the String variable
			 String title = driver.getTitle();
			 
			 // Storing Title length in the Int variable
			 int titleLength = driver.getTitle().length();
			 
			 // Printing Title & Title length in the Console window
			 System.out.println("Title of the page is : " + title);
			 System.out.println("Length of the title is : "+ titleLength);
			 
			 // Storing URL in String variable
			 String actualUrl = driver.getCurrentUrl();
			 
			 if (actualUrl.equals(url)){
			 System.out.println("LA URL ES CORRECTA");
			 }else{
			 System.out.println("LA URL ES INCORRECTA");
			 //In case of Fail, you like to print the actual and expected URL for the record purpose
			 System.out.println("DIRECCION URL ACTUAL : " + actualUrl);
			 System.out.println("DIRECCION URL  ESPERADA " + url);
			 }
			 
			 // Storing Page Source in String variable
			 String pageSource = driver.getPageSource();
			 
			 // Storing Page Source length in Int variable
			 int pageSourceLength = pageSource.length();
			 
			 // Printing length of the Page Source on console
			 System.out.println("Total length of the Pgae Source is : " + pageSourceLength);
			 
			 //Closing browser
			 driver.close();
			 
			 
		

	}//clase

}//paquete
