
package tutorialesya;

//Para plantear un diagrama de flujo debemos tener muy en claro el problema a resolver.

import java.util.Scanner;

//Ejemplo : Calcular el sueldo mensual de un operario conociendo la cantidad de horas trabajadas
//y el pago por hora.

//Entradas : cantidadHoras-sueldoHora
//Proceso: sueldo=cantidadHoras*sueldoHora
//Salida: sueldo

public class SueldoOperario {
    
    public static void main(String[] args) {
        
        //Declaracion variable
        Scanner sc=new Scanner(System.in);
        int cantidadHoras;
        int  sueldoHora;
        int  sueldoTotal;
        
        //Entrada
        System.out.println("Ingrese la cantidad de horas trabajadas por el empleado:");
        cantidadHoras=sc.nextInt();
        System.out.println("Ingrese el sueldo por hora:");
        sueldoHora=sc.nextInt();
        
        
        //Operacion
        sueldoTotal=cantidadHoras*sueldoHora;
                
        //Salida
       System.out.println("El sueldo total es : ");
       System.out.println(sueldoTotal);
        
        
    }//Clase
  }//paquete
