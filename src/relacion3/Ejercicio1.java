package relacion3;

import java.util.Arrays;
//import java.util.Collections;
import java.util.Scanner;


public class Ejercicio1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//Declaración de variables
		Integer [] numArray = new Integer[3];
		int userInput;
		
		/*
		 * Como sabemos la cantidad de iteraciones que necesitamos podemos utilizar un bucle for.
		 * Lo que hace este bucle es que cuando i sea menor que 3, que es la cantidad de números que vamos a introducir,
		 * vuelva a pedirnos un número y lo guarde dentro del array en la posición que le indica la variable i.
		 * Como cada vez que iteramos incrementamos i, el número que introduzcamos se almacenará en la siguiente posición
		 * dentro del array.
		 */
		
		for (int i=0; i < 3 ;i++) {
			System.out.println("Introduce un número: ");
			userInput = sc.nextInt();
			numArray[i]=userInput;
		}
		
		
		
		/*
		 * En mi cabeza lo que verás a continuación era espectacular hasta que me di cuenta de que el ejercicio
		 * pedía que los números fueran ordenados de menor a mayor, cosa que el método sort hace automáticamente xD
		 */
		
		/*
		 * Utilizamos el método sort para ordenar el array de números enteros de menor a mayor.
		 * El problema es que el ejercicio no dice que lo hagamos de mayor a menor.
		 * Entonces la solución que he encontrado es utilizar el método reverseOrder de la clase Collections,
		 * para darle la vuelta al output del método.
		 * 
		 * Más tarde tenemos que transformar el array de entero a una cádena de carácteres, para mostrarlo
		 * por pantalla.
		 *
		 * */
		
		/*
		
		Arrays.sort(numArray,Collections.reverseOrder());
		
		System.out.println("El orden de los números de mayor a menor es: " + Arrays.toString(numArray));
		
		*/
		
		/*
		 * He aquí el ejercicio como debería ser.
		 */
		
		Arrays.sort(numArray);
		System.out.println("El orden de los números de menor a mayor es: " + Arrays.toString(numArray));
		sc.close();
		
		/*
		 * PD: Este programa ha sido realizado enteramente por mi. :)
		 */
	}
}
