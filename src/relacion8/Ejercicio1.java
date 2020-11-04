package relacion8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Declaramos el array para almacenar las notas
		
		Integer[] numArray = new Integer[10];
		
		// Utilizamos el bucle for para recorrer el array e ir introduciendo números
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un número");
			numArray[i] = Integer.parseInt(sc.nextLine());
		}
		
		// Con el método reverse de la clase Collections le damos la vuelta la Array.
		
		Collections.reverse(Arrays.asList(numArray));
		
		// Para poder imprimir el array tenemos que tratarlo como si fuera un String y eso lo hacemos
		// con el método toString de la clase Arrays
		
		System.out.print(Arrays.toString(numArray));
		
		sc.close();
	}

}
