package relacion3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int num;
		boolean primo = false;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número para saber si es primo o no: ");
		num = Integer.parseInt(sc.nextLine());

		for (int i = 1; (num/2) >= i; i++) {

			if (num % i == 0) {
				primo = false;
			} else {
				primo = true;
			}
		}

		if (primo == true || (num == 2 || num == 3)) {
			System.out.println("El número " + num + " es primo.");
		} else {
			System.out.println("El número " + num + " no es primo.");
		}
		sc.close();
	}
}
