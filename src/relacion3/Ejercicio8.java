package relacion3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		// Declaramos las variables
		double d_positivo, d_negativo;
		int a, b, c, discriminante;

		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);

		// Filtramos que el valor de a no sea 0
		do {
			System.out.println("Introduce el valor de a");
			a = Integer.parseInt(sc.nextLine());
		} while (a == 0);

		// Pedimos al usuario el resto de valores
		System.out.println("Introduce el valor de b");
		b = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el valor de c");
		c = Integer.parseInt(sc.nextLine());

		// Calculamos el discriminante, que no ayudar� a saber si la ecuaci�n tiene 2, 1
		// o ninguna soluci�n
		discriminante = (b * b) - 4 * a * c;

		/*
		 * Utilizando el discriminante, filtramos la cantidad de soluciones que tiene la
		 * ecuaci�n. Si el discriminante es mayor a 0, tiene 2 soluciones; si es igual a
		 * 0 tiene una soluci�n y si es menor que 0 no tiene soluci�n.
		 */
		if (discriminante > 0) {
			System.out.println("La ecuaci�n tiene 2 soluciones reales distintas");

			d_positivo = ((-b) + Math.sqrt(discriminante)) / (2 * a);

			d_negativo = ((-b) - Math.sqrt(discriminante)) / (2 * a);

			System.out.println("La primera soluci�n de la ecuaci�n es: " + d_positivo);

			System.out.println("La segunda soluci�n de la ecuaci�n es: " + d_negativo);
		} 
		
		// Si solo tiene una soluci�n no calculo la raiz cuadrada del discriminante+ 
		
		else if (discriminante == 0) {
			System.out.println("La ecuaci�n tiene una soluci�n");

			d_positivo = (-b / (2 * a));

			System.out.println("La soluci�n de la ecuaci�n es: " + d_positivo);
		}
		
		else {
			System.out.println("No hay una soluci�n real");
		}

		sc.close();
	}

}
