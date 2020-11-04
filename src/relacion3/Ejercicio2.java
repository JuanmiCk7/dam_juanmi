package relacion3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int base;
		int exponente;
		int acumulador = 1;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduce la base del número: ");
			base = Integer.parseInt(sc.nextLine());
			System.out.println("Introduce el exponente del número: ");
			exponente = Integer.parseInt(sc.nextLine());
		} while (base < 0 || exponente < 0);

		if (base == 0) {
			System.out.println("Cualquier número con base 0, es 0.");
		} else if (exponente == 0) {
			System.out.println("Cualquier número con exponente 0 es igual a 1");
		} else {
			for (int i = 1; i <= exponente; i++) {
				acumulador = acumulador * base;
			}
			System.out.println("El resultado es: " + acumulador);
		}
		
		sc.close();
	}
}
