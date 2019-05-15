package MetodoVarios;


import java.util.Random;

public class Aleatorio {
	
	public int []  generarAleatorio()
	{
		Random obj=new Random();
		return  obj.ints(2,0,100).toArray();
		
	}
	

}
