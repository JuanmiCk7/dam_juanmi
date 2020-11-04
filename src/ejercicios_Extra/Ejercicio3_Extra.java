package ejercicios_Extra;

import java.util.Scanner;

public class Ejercicio3_Extra {

	public static void main(String[] args) {

		// Declaración de variables. Le damos a la variable min y max el menor y el
		// mayor número posible que es capaz de contener un entero.
		int elements;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, media = 0, repeat_max = 0, repeat_min = 0, sumary = 0;

		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario la cantidad de elementos de array
		do {
			System.out.print("Introduce la cantidad de elementos que contendrá el array: ");
			elements = sc.nextInt();
		} while (elements <= 0);

		// Creamos el array con la longitud indicada por el usuario
		int[] numArray = new int[elements];

		/*
		 * Mientra la longitud del array sea menor que la variable i, me pedirá un nuevo
		 * número y lo introducirá en la siguiente posición del array
		 */

		for (int i = 0; i < numArray.length; i++) {
			System.out.print("Introduce un número al array: ");
			numArray[i] = sc.nextInt();
		}

		// Cerramos el teclado
		sc.close();

		// En el primer for almacenamos la suma de todos los números y si el número es
		// mayor que el valor actual de max, lo almacenamos en esa misma variable.

		for (int j = 0; j < numArray.length; j++) {

			sumary += numArray[j];

			if (numArray[j] > max) {
				max = numArray[j];
			}

			if (numArray[j] < min) {
				min = numArray[j];
			}

		}

		// En este for comprobamos la cantidad de veces que se repite un número

		for (int j = 0; j < numArray.length; j++) {

			if (numArray[j] == min) {
				repeat_min++;
			}

			if (numArray[j] == max) {
				repeat_max++;
			}
		}

		// Calculamos la media
		media = sumary / numArray.length;

		System.out.printf("El mayor número introducido es: %d. Se repite %d veces. %n", max, repeat_max);
		System.out.printf("El menor número introducido es %d. Se repite %d veces. %n", min, repeat_min);
		System.out.printf("La media de los números introducidos es %d %n", media);

	}

}
