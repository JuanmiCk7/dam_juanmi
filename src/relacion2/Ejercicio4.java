package relacion2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int contador;
		int sumatorio = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduce un número positivo mayor que cero:");
			contador = Integer.parseInt(sc.nextLine());
		}
		while (contador <= 0);
		
		sc.close();
		
		
		for (int i=0; i <= contador; i++ ) {
			
			sumatorio = i + sumatorio;		
		}
		
		System.out.println("La suma de los " + contador + " primero números es " + sumatorio);
	}

}
