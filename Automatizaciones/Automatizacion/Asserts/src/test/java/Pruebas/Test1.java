package Pruebas;

//Importar
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

	
	private int numeroUno=3;
	private int numeroDos=5;
	
	@Test
	public void testNumeroVerdadero() 
	{
		 Assert.assertTrue(numeroDos==numeroUno+2); 
		//Assert.assertTrue(numeroDos==numeroUno+1,"LOS NUMEROS NO SON IGUALES"+"   "+String.valueOf(numeroUno)+"  " +"distinto"+"  "+String.valueOf(numeroDos+1));
		 
	}
	
	
	@Test
	public void testNumeroFalso() 
	{
		 Assert.assertFalse(numeroDos==numeroUno); 
		//Assert.assertFalse(numeroDos!=numeroUno,"LOS NUMEROS NO SON IGUALES"); 
	}

	@Test
	public void testNumeroIgual() 
	{
		Assert.assertEquals(numeroDos,numeroUno+2); 
	}
	
	


	@Test
	public void testNumeroNoIgual() 
	{
		Assert.assertNotEquals(numeroDos,numeroUno*343); 
	}
	
	
	@Test
	public void probarNoNulo()
	{
		Persona persona=new Persona("EMANUEL","TOMASSINI");
		Assert.assertNotNull(persona);
		//Assert.assertNull(persona);
	}
	
	@Test
	public void probarNulo()
	{
		Persona persona=null;//Persona persona; no se puede no es nun objeto hasta que no se instancia(declaracion-iniciar)
		 //Persona persona=new Persona();// no es nulo si tiene un constructor vaciod e la clase
		  //Persona persona; //no se creo el objeto , no existe como objeto
		 Assert.assertNull(persona);
	//	Assert.assertNotNull(persona);
	}
	
	
	@Test
	public void mismoObjeto()
	{
		Persona personaUno=new Persona("Jorge","Ibañez");
		Persona personaDos=new Persona("Jorge","Ibañez"); 
		Assert.assertNotSame(personaUno,personaDos); 
	}
	
	
	
	@Test 
	public void distintoObjeto()
	{
		Persona personaUno=new Persona("uno","uno");
		Persona personaDos=personaUno; 
		Assert.assertSame(personaUno, personaDos,"Las personas son igualesfalla comparando personas");
	}
	
	
	
	
	
	
}//clase
