package relacion3;

import java.util.Scanner;

public class Ejercicio2Extra {

	public static void main(String[] args) {

		// Declaraci�n de variables
		int num, resto = 0, reverse = 0, auxiliar;

		Scanner sc = new Scanner(System.in);

		// do {
		System.out.print("Introduce un n�mero: ");
		num = Integer.parseInt(sc.nextLine());
		// } while (num < 0);
		
		auxiliar = num;

		while (num != 0) {

			resto = num % 10;
			num = num / 10;
			reverse = reverse * 10;
			reverse = reverse + resto;

		}
		
		System.out.println(reverse);
		
		if (auxiliar == reverse) {
			System.out.println("El n�mero es capic�a");
		}
		else {
			System.out.println("El n�mero no es capic�a");
		}

		//System.out.println(reverse);

		sc.close();

	}

}
