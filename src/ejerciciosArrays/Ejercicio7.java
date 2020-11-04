package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int[] numArray;
		int longitudArray;
		int numSearch;
		int posicionArray;
		

		// Le pedimos al usuario el tama�o del array
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Introduce el tama�o del array: ");
			longitudArray = teclado.nextInt();
			if (longitudArray <= 0) {
				System.out.println("Tienes que introducir un n�mero mayor que 0");
			}
		} while (longitudArray <= 0);
		
		
		
		// Creamos el array con la longitud indicada por el usuario
		numArray = new int[longitudArray];

		// Introducimos tantos n�meros como quepan en el array
		numArray = longArray(numArray, longitudArray);
		
		// Comprobamos si el n�mero se encuentra o no en el array
		
		
		System.out.println("Introduce el n�mero que desea buscar dentro del array");
		numSearch = teclado.nextInt();
		
		
		
		posicionArray = buscarNumero(numArray, numSearch);
		
		if (found(numArray, numSearch) == true) {
			System.out.printf("El n�mero %d ha sido encontrado en la posici�n %d", numSearch, posicionArray);
			teclado.close();
		}
		else {
			System.out.printf("El n�mero %d no ha sido encontrado dentro del array", numSearch);
		}
		
			
		

	}
	
	// Con este m�todo introducimos los n�mero del array
		public static int[] longArray(int[] numArray, int longitudArray) {
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < numArray.length; i++) {
				System.out.println("Introduce un n�mero en el array");
				numArray[i] = sc.nextInt();
			}
			return numArray;	
		}
		
		// Con este m�todo buscamos el n�mero dentro del array
		public static int buscarNumero(int[] numArray, int posicionArray) {
			for (int i = 0; i < numArray.length; i++) {
				if (numArray[i] == posicionArray) {
					posicionArray = i;
				}			
			}
			return posicionArray;

		}
		
		public static boolean found(int[] numArray, int posicionArray) {
			boolean find = false;
			for (int i = 0; i < numArray.length; i++) {
				if (numArray[i] == posicionArray) {
					find = true;
				}
			}
			return find;

		}

}
