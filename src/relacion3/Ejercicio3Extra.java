package relacion3;

import java.util.Scanner;

public class Ejercicio3Extra {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Constantes
		
		final int M = 1000;
		final int D = 500;
		final int C = 100;
		final int L = 50;
		final int X = 10;
		final int V = 5;
		final int I = 1;
		
		// Variables
		
		String numero;
		int resultado = 0;
		
		System.out.println("Introduce un número romano");
		numero = sc.nextLine();
		
		/* Necesitamos un for para recorrer el número romano hasta que i sea mayor que la variable
		*
		* Con el switch ejecutamos la acciones necesarias si el número en romano es igual a cada uno de los casos.
		* 
		* Dependiendo del número romano que sea también puede restar si se encuentra delante de un número mayor que
		* el mismo. Por eso lo comprobamos con el if cuando sea necesario. Si el número que va delante del que estamos
		* comprobando es mayor lo restamos, sino se suma a la variable resultado.
		* 
		* El problema de este programa es que solo puede transformar del número 3999 hacia detrás, puesto que, se usa otra
		* simbología para representar del número 4000 en adelante. De la forma en la que está hecha el programa realmente
		* podríamos introducir más de 3 M's. Ejemplo: Si introducimos MMMM, nos dará como resultado 4000. Pero esto no está
		* permitido.
		* 
		* Dentro del if hemos controlado también el overflow, porque i empieza en 0, pero el método length empieza desde el 1		 
		*
		*/
		
		for (int i = 0; numero.length() > i; i++) {

			switch (numero.charAt(i)) {
			case 'M': {
				resultado += M;
			}
				break;
			case 'D': {
				resultado += D;
				break;
			}
			case 'C': {
				if (i != numero.length() - 1) {
					if (numero.charAt(i + 1) == 'D' || numero.charAt(i + 1) == 'M') {
						resultado -= C;
					} else {
						resultado += C;
					}
				} else {
					resultado += C;
				}
			}
				break;
			case 'L': {
				resultado += L;
			}
				break;
			case 'X': {
				if (i != numero.length() - 1) {
					if (numero.charAt(i + 1) == 'L' || numero.charAt(i + 1) == 'C') {
						resultado -= X;
					} else {
						resultado += X;
					}
				} else {
					resultado += X;
				}
			}
				break;
			case 'V': {
				resultado += V;
			}
				break;
			case 'I': {
				if (i != numero.length() - 1) {
					if (numero.charAt(i + 1) == 'V' || numero.charAt(i + 1) == 'X') {
						resultado -= I;
					} else {
						resultado += I;
					}
				} else {
					resultado += I;
				}
			}
				break;
			
			}

		}
		System.out.println(resultado);
		sc.close();
	}
}