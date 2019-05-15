package TestSet;

import org.openqa.selenium.WebDriver;

import Prestamo.PrestamoController;
import Prestamo.PrestamoModelo;

public class Test3 {

	public static void main(String[] args) {



		PrestamoModelo prestamo=new PrestamoModelo();
		PrestamoController pc=new PrestamoController();
		String linea="1154090321";
		//3512090009
		
		Test1 obj=new Test1();
//		obj.eliminarPresta(linea);
//		System.out.println("ELIMINO EL PRESTAMO");
		
		
		
		
//		//vencer costo servicio
//		prestamo=pc.devolverObjPrestamo(linea);
//		pc.vencerCostoServicio(prestamo);
//		pc.editarPrestamo(prestamo);
//		System.out.println(prestamo.getFREESERVICECOSTDATE());
		
		
		//vencer costo servicio
				prestamo=pc.devolverObjPrestamo(linea);
				pc.saldarPrestamoParcialmente(prestamo);
				System.out.println(prestamo.getCURRENTACCCREDITAMT());//10 prestamo
				System.out.println(prestamo.getDEBITAMOUNT());//5 saldado 
				System.out.println(prestamo.getLOANTIMELOANAMOUNT());//lo que debe 5
				
		
		
//		pc.activarCostoServicio(prestamo);
//		pc.editarPrestamo(prestamo);
//		System.out.println(prestamo.getFREESERVICECOSTDATE());
		
		//ELIMINO EL PRESTAMO
		//obj.eliminarPresta(linea);
		 
		 
		
		

	}//MAIN

}//CLASE
