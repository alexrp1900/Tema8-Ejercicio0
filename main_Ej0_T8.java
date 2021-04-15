package Ejer1;

import java.util.Scanner;

public class main_Ej0_T8 {

	public static void main(String[] args) {
		
		
		double[] notaEst = {7, 8.5, 4, 8, 6, 7.5, 5};
		
		
		Estudiante e1 = new Estudiante("Juan", 20,"Renault Clio Rojo", 12345, "1ºDAM", notaEst );
		
		
		
		Profesor p1 = new Profesor("Fernando", 45, "Opel Corsa Blanco", "D104", "Lunes de 10:00 a 13:00");
		
		System.out.println("Nombre del Estudiante: "+e1.getNombre()+" , la nota media es "+e1.getNotaMedia());
		
		System.out.println("Nombre del Profesor: "+p1.getNombre()+" ,  la consulta es el "+p1.getConsultas());
		
	}
	
	
}
