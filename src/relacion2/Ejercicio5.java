package relacion2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int num_max = Integer.MIN_VALUE;
		int num_min = Integer.MAX_VALUE;
		int acumulador = 0;
		int contador = 0;
		char respuesta = 's';
		
		Scanner sc = new Scanner(System.in);
		
		while (respuesta == 's') {
			System.out.println("Introduce un número entero: ");
			int num = Integer.parseInt(sc.nextLine());
			
			contador++;
		
		if (num < num_min) {
			num_min = num;
		}
		if (num > num_max) {
			num_max= num;
		}
		
		
		acumulador += num;
		
		
		do {
			System.out.println("¿Quieres continuar introduciendo número?");
			respuesta = Character.toLowerCase(sc.nextLine().charAt(0));
		} while (respuesta != 'n' && respuesta != 's');
		
	}
		System.out.println("El mayor número introducido es " + num_max);
		System.out.println("El menor número introducido es " + num_min);
		System.out.println("La media de los números es " + (acumulador/(float)contador));
		sc.close();
	}
}
