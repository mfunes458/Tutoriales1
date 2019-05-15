 
package tutorialesya;
import java.util.Scanner;

// Problema: 
//Confeccionar un programa que pida por teclado tres notas de un alumno, calcule el promedio e imprima alguno de estos mensajes:
//Si el promedio es >=7 mostrar "Promocionado".
//Si el promedio es >=4 y <7 mostrar "Regular".
//Si el promedio es <4 mostrar "Reprobado".


public class EstructuraCondicionalAnidada1 {
    
    
     public static void main(String[] args) { 
         
         Scanner sc=new Scanner(System.in);
         int nota1,nota2,nota3;
         float promedio;
         
         System.out.println("Ingrese nota 1");
         nota1=sc.nextInt();
         System.out.println("Ingrese nota 2");
         nota2=sc.nextInt();
         System.out.println("Ingrese nota 3");
         nota3=sc.nextInt();
         
         //Calculo el promedio
        promedio=(nota1+nota2+nota3)/3;
         System.out.println("El promedio es "+" "+promedio);
        if(promedio>=7)
        {
         System.out.println("el alumno esta Promocionado");
        }else if(promedio>=4 )
        {
            System.out.println("el alumno esta Regular");
        }else
        {
            System.out.println("el alumno esta Reprobado");
        }
         
         
          
    }//main
}//clase
