package relacion2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int counter = 0;
		int num;
		
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Introduce un n�mero para saber si es perfecto");
		num = Integer.parseInt(sc.nextLine());
		} while (num < 0);
		
		sc.close();
		
		for (int i=1; (num/2) >= i ; i++) {
			if (num % i == 0) {
				counter += i;
			}
		}
		if (counter == num) {
			System.out.println("El n�mero " + num + " es perfecto");
		}
		else {
			System.out.println("El n�mero " + num + " no es perfecto");
		}	
	}
}
