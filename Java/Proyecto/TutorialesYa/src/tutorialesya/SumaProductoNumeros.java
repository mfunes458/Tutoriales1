 
package tutorialesya;

import java.util.Scanner;


//Problema:
//Realizar la carga de dos números enteros por teclado e imprimir su suma y su producto.

 
public class SumaProductoNumeros {
    
     public static void main(String[] args) {
     
         //Entrada 
         int numero1,numero2, producto , suma; 
        
         Scanner sc=new Scanner(System.in);
         System.out.println("INGRESE UN NUMERO ");
         numero1=sc.nextInt();
         System.out.println("INGRESE OTRO NUMERO ");
         numero2=sc.nextInt();
         
                 
         //Operaciones 
         suma=numero1+numero2;
         producto=numero1*numero2;
         
         
         
         //Salida 
         System.out.println("La suma es "+"  "+suma);
         System.out.println("El producto es "+"  "+producto);
         
          
    }//Main
    
    
}//clase
