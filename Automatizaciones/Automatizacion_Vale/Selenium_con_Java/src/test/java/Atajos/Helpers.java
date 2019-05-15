package Atajos;

public class Helpers {
	
	
	public void demora(int segundos)
	{
		int	segundosTotal=segundos*1000;
		try {
			Thread.sleep(segundosTotal);//espera 5 segundos
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}//demora
	 

}//paquete
