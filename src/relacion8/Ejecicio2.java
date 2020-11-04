package relacion8;

import java.util.Scanner;
import java.util.Arrays;

public class Ejecicio2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Declaración del array
		
		int[] numArray = {5, 10, 2, 30, 4, 15, 6, 88, 3, 9} ;
		int aux = numArray[9];
		
		
		
		System.out.println(Arrays.toString(numArray));
		
	
			
			for (int j = 0; j < numArray.length; j++) {
				
				numArray[j] = aux;
				
				
				
			}
		
		
		
		sc.close();
		
		
	}
}
