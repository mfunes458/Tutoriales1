package Pruebas;

//importar
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import MetodoVarios.Aleatorio;
import Modelo.*;

public class Test1 {

//	private int numero1=5;
//	private int numero2=10;
	
//	private int numero1;
//	private int numero2;
//	
	
	private int[] arreglo;
	
	
	//@BeforeMethod
	public void setup()
	{
//		numero1=5;
//		numero2=10; 
		
		Aleatorio objAleatorio=new Aleatorio();
		arreglo=objAleatorio.generarAleatorio();
		System.out.println("BEFOREMETHOD");
		System.out.println(arreglo[0]);
		System.out.println(arreglo[1]);
	}
	
	
	
	
	//@Test
	public void assertNullNotNull()
	{
		//Assert.assertTrue(numero1+5==numero2);
		Assert.assertTrue(arreglo[0]>arreglo[1],"EL PRIMERO DEBERIA SER MAYOR QUE EL SEGUNDO");
		Usuario usuario=null;
		//Usuario usuario;  // no se puede
		Assert.assertNull(usuario); 
		usuario=new Usuario();
		Assert.assertNotNull(usuario);
		//Assert.assertNull(usuario); //falla
	}
	
	
	
	//@Test
	public void assertNull1()
	{
		//Assert.assertTrue(numero2-5==numero1);
		Assert.assertTrue(arreglo[0]<arreglo[1],"EL SEGUNDO DEBERIA SER MAYOR QUE EL SEGUNDO");
		Usuario usuario=null;
		//Usuario usuario;  // no se puede
		Assert.assertNull(usuario); 
		
	}
	
	//falla
	//@Test
	public void assertNull2()
	{	Assert.assertTrue(arreglo[0]==arreglo[1],"DEBERIAN SER IGUALES");
		Usuario usuario=new Usuario();
		Assert.assertNull(usuario); 
	}
	
	
	
	//@Test
	public void assertNotNull1()
	{
		//Assert.assertTrue(numero1+10==numero2+5);
		Assert.assertTrue(arreglo[0]>100 ||arreglo[1]>100,"EL RANGO ES HASTA 100");
		Usuario usuario=null;
		//Usuario usuario;  // no se puede
		Assert.assertNotNull(usuario); 
		
	}
	
	//falla
	//@Test
	public void assertNotNull2()
	{
		Usuario usuario=new Usuario();
		Assert.assertNotNull(usuario); 
	}
	
	
	
	
	
	@Test(enabled=false)
	public void Prueba1()
	{ 
		System.out.println("PRUEBA1");
	}
	
	
	@Test(enabled=true)
	public void Prueba2()
	{ 
		System.out.println("PRUEBA2");
	}
	
	
	@Test(enabled=false)
	public void Prueba3()
	{ 
		System.out.println("PRUEBA3");
	}
	
	
	@Test(enabled=true)
	public void Prueba4()
	{ 
		System.out.println("PRUEBA4");
	}
	
	
	
	
	
	
	
	
	
	
	//@Test
	public void assertTrue1()
	{
		Assert.assertTrue(1==1);
		Assert.assertTrue('A'=='A');
		
	}
	
	//Falla
	//@Test
	public void assertTrue2()
	{
		Assert.assertTrue(1==1);
		Assert.assertTrue('A'=='B');
		
	}
	
	
	
	//falla
	//@Test
	public void assertFalse1()
	{
		int i=1;
		int j=2; 
		Assert.assertFalse(i==j);
		
	}
	 
	
	
	//falla
	//@Test
	public void assertFalse2()
	{
		int i=1;
		int j=1;
		Assert.assertTrue(1==1);
		Assert.assertTrue('A'=='A');
		Assert.assertTrue(i==j);
		
	}
	
	
	
	//@Test	
	public void assertEquals1()
	{
	 
		Assert.assertEquals(5,5);
		Assert.assertTrue('C'=='C'); 
	}
	
	//Falla
	//@Test	
	public void assertEquals2()
	{
	 
		Assert.assertEquals(5,4);
		Assert.assertTrue('C'=='C'); 
	}
	
	
	
	//@Test	
	public void assertNotEquals1()
	{ 
		Assert.assertNotEquals(4,5);
		Assert.assertNotEquals('A','H');
	}
	
	//no pasa
	//@Test	
	public void assertNotEquals2()
	{ 
		Assert.assertEquals(5,5);
		Assert.assertEquals('A','H');
	}
	
	
	
	
	
	//@AfterMethod
	public void finalizacion()
	{
		System.out.println("AFTERMETHOD");
		System.out.println("Ejecutando las PostCondiciones");
		System.out.println("Se ejecuta por cada Test");
		
	}
	
	

}//clase
