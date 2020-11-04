package relacion2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
			
			int counter = 1;
			int num;
			
			Scanner sc = new Scanner(System.in);
			do {
			System.out.println("Introduce un número para saber si es perfecto");
			num = Integer.parseInt(sc.nextLine());
			} while (num < 0);
			
			sc.close();
			
			for (int i=1;i <= num;i--) {
				counter = counter * i;
			}
			if (counter == num) {
				System.out.println("El número " + num + " es perfecto");
			}
			else {
				System.out.println("El número " + num + " no es perfecto");
			}	
		}

	}

