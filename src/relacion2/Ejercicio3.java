package relacion2;

import java.util.Scanner;

public class Ejercicio3 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Declaramos variables
		int contador = 0;
		int num;
		int i;
		
		while (contador <= 0 ) {
		System.out.println("Introduce la cantidad de veces a iterar: ");
		contador = Integer.parseInt(sc.nextLine());
		}
		for (i=0;i < contador;i++) {
			System.out.println("Introduce un número para saber si es par o impar");
			num = Integer.parseInt(sc.nextLine());
			
			if (num%2==0) {
				System.out.println("El número " + num + " es par");
			}
			else if (num%3==0) {
				System.out.println("El número " + num + " es impar");
			}
			else {
				System.out.println("El número " + num + " no es par ni impar");
			}
		}
	}
}
