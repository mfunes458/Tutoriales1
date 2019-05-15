 
package tutorialesya;
 
import java.util.Scanner;

//Problema:
//Realizar un programa que solicite ingresar dos números distintos y muestre por pantalla el mayor de ellos.



public class EstructuraCondicionalCompuesta1 {
    
    public static void main(String[] args) { 
        
         Scanner sc=new Scanner(System.in); 
         int numero1,numero2; 
           System.out.println("Ingrese un numero cualquiera");
           numero1=sc.nextInt();
           System.out.println("Ingrese otro numero");
           numero2=sc.nextInt();
             
           
           
           
           if(numero1>numero2)
           {
               System.out.println("El mayor es el numero "+" "+numero1);
           }else
           {
            System.out.println("El mayor es el numero "+" "+numero2);
           }
           
         
         
         
         
    }//Main4
       
}//Clase
