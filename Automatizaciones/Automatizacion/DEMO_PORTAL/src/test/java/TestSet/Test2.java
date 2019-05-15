package TestSet;

public class Test2 {

	
	
	
	
	
	public static void main(String[] args) {
		 
		
		String saldoInicialString="$522,00";
		String saldoFinalString="$532,00";
		String prestamoString="$10,00";
		 
	 int 	saldoInicialInt=Integer.parseInt(saldoInicialString.substring(1,4));
	int 	saldoFinalInt=Integer.parseInt(saldoFinalString.substring(1,4));
	int 	prestamoInt=Integer.parseInt(prestamoString.substring(1,3));
	
	int resultado=saldoFinalInt-saldoInicialInt;
	System.out.println(saldoInicialInt);
	System.out.println(saldoFinalInt);
	System.out.println(prestamoInt);
	System.out.println(resultado);
		
	}//main

}//clase
