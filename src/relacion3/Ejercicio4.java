package relacion3;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio4 {

	public static void main(String[] args) {
		
		
		//Declaramos variables
		int num = 1;
		int counter = 1;
		boolean premio = false;
		int random;
		
		//Creamos el objeto r utilizando la clase Random para generar números aleatorios
		Random r = new Random(System.currentTimeMillis());
		
		//Hacemos que a la varible random se le asigne un número pseudoaleatorio
		random = r.nextInt(100)+1;
		
		//System.out.println(random);
		
		//Creamos el objeto sc para el teclado
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Introduce un número entre 1 y 100");
			num = Integer.parseInt(sc.nextLine());
			
			if (num != random) {
				System.out.println("No has acertado");
				counter++;
				
				if (num > random) {
					System.out.println("Te has pasado");
					
				}
				else if (num < random) {
					System.out.println("Te has quedado corto");
					
				}
			}
			else {
				System.out.println("Has acertado");
				premio = true;
			}
			
		}
		while ((!(num>100) && !(num<1)) && counter<=5 && !(premio==true));
		
		sc.close();
		
		if (counter >= 5) {
			System.out.println("Te has quedado sin intentos :( ");
		}
	}
	
}
