package relacion3;

import java.util.Arrays;
//import java.util.Collections;
import java.util.Scanner;


public class Ejercicio1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//Declaraci�n de variables
		Integer [] numArray = new Integer[3];
		int userInput;
		
		/*
		 * Como sabemos la cantidad de iteraciones que necesitamos podemos utilizar un bucle for.
		 * Lo que hace este bucle es que cuando i sea menor que 3, que es la cantidad de n�meros que vamos a introducir,
		 * vuelva a pedirnos un n�mero y lo guarde dentro del array en la posici�n que le indica la variable i.
		 * Como cada vez que iteramos incrementamos i, el n�mero que introduzcamos se almacenar� en la siguiente posici�n
		 * dentro del array.
		 */
		
		for (int i=0; i < 3 ;i++) {
			System.out.println("Introduce un n�mero: ");
			userInput = sc.nextInt();
			numArray[i]=userInput;
		}
		
		
		
		/*
		 * En mi cabeza lo que ver�s a continuaci�n era espectacular hasta que me di cuenta de que el ejercicio
		 * ped�a que los n�meros fueran ordenados de menor a mayor, cosa que el m�todo sort hace autom�ticamente xD
		 */
		
		/*
		 * Utilizamos el m�todo sort para ordenar el array de n�meros enteros de menor a mayor.
		 * El problema es que el ejercicio no dice que lo hagamos de mayor a menor.
		 * Entonces la soluci�n que he encontrado es utilizar el m�todo reverseOrder de la clase Collections,
		 * para darle la vuelta al output del m�todo.
		 * 
		 * M�s tarde tenemos que transformar el array de entero a una c�dena de car�cteres, para mostrarlo
		 * por pantalla.
		 *
		 * */
		
		/*
		
		Arrays.sort(numArray,Collections.reverseOrder());
		
		System.out.println("El orden de los n�meros de mayor a menor es: " + Arrays.toString(numArray));
		
		*/
		
		/*
		 * He aqu� el ejercicio como deber�a ser.
		 */
		
		Arrays.sort(numArray);
		System.out.println("El orden de los n�meros de menor a mayor es: " + Arrays.toString(numArray));
		sc.close();
		
		/*
		 * PD: Este programa ha sido realizado enteramente por mi. :)
		 */
	}
}
