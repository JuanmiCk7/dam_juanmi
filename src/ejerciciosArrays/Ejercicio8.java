package ejerciciosArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int[] numArray;
		int longitudArray;
		int numSearch;
		int posicionArray;
		String reverse;
		boolean reverseSioNo = false;

		// Le pedimos al usuario el tama�o del array
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Introduce el tama�o del array: ");
			longitudArray = teclado.nextInt();
			if (longitudArray <= 0) {
				System.out.println("Tienes que introducir un n�mero mayor que 0");
			}
		} while (longitudArray <= 0);
		
		
		do {
			System.out.println("Introduce si quieres que se invierta el array o no (Si o No): ");
			reverse = teclado.nextLine();
			if (reverse == "Si") {
				reverseSioNo = true;
			}
			else if (reverse == "No") {
				reverseSioNo = false;
			}
		} while (reverse != "Si" || reverse != "No");
		
		
		// Creamos el array con la longitud indicada por el usuario
		numArray = new int[longitudArray];

		// Introducimos tantos n�meros como quepan en el array
		numArray = longArray(numArray, longitudArray);
		
		
		// Si el usuario indica que quiere invertir el array, llamamos al m�todo reverseArray
		if (reverseSioNo == true) {
		numArray = reverseArray(numArray);
		}

		// Comprobamos si el n�mero se encuentra o no en el array
		
		
		System.out.println("Introduce el n�mero que desea buscar dentro del array");
		numSearch = teclado.nextInt();
		
		
		
		posicionArray = buscarNumero(numArray, numSearch);
		
		if (found(numArray, posicionArray)>0) {
			System.out.printf("El n�mero %d ha sido encontrado en la posici�n %d", numSearch, posicionArray);
		}
		else {
			System.out.printf("El n�mero %d no ha sido encontrado en el array", numSearch);
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
		
		public static int found(int[] numArray, int posicionArray) {
			int find = -1;
			for (int i = 0; i < numArray.length; i++) {
				if (numArray[i] == posicionArray) {
					find = 1;
				}
			}
			return find;

		}
		
		public static int[] reverseArray(int[] numArray) {
			Collections.reverse(Arrays.asList(numArray));
			return numArray;
			
		}
		
		
		

}
