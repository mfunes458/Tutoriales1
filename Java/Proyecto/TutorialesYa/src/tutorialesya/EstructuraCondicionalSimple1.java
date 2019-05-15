
package tutorialesya;
import java.util.Scanner;


//Ingresar el sueldo de una persona, 
//si supera los 3000 pesos mostrar un mensaje en pantalla indicando que debe abonar impuestos.

  

public class EstructuraCondicionalSimple1 {
    
     public static void main(String[] args) {
     
         
           Scanner sc=new Scanner(System.in);
           int sueldo;
           System.out.println("Ingrese el sueldo del operario");
           sueldo=sc.nextInt();
           
           if(sueldo>300)
           {
               System.out.println("DEBE ABONAR GANANCIAS");
           }
           
           
          
    }//Main
    
}//clase
