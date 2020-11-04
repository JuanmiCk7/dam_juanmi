package relacion3;

import java.util.Scanner;

public class EjercicioInversa {

	public static void main(String[] args) {
		
		// Declaración de variables
		int num, resto = 0, reverse = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//do {
		System.out.print("Introduce un número: ");
		num = Integer.parseInt(sc.nextLine());
		//} while (num < 0);
		
		
		while (num != 0) {
			
			resto = num % 10;
			num = num / 10;
			reverse = reverse * 10;
			reverse = reverse + resto;
				
		}
		
		System.out.println(reverse);
		
		
		sc.close();
		
	}

}
