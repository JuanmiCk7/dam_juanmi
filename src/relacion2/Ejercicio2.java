package relacion2;

import java.util.Scanner;

public class Ejercicio2 {
	
	
	
	public static void main(String[] args) {
		
		//Declaramos variables
		int num = -1;
		//int resultado = 0;
		//int contador = 1;
		//Creamos el objeto teclado
		Scanner pollofrito = new Scanner(System.in);
		
		
		//Recoger solo valores entre 0 y 10
		while (num < 0 || num > 10) {
			System.out.println("Introduce un número entre 0 y 10: ");
			num = Integer.parseInt(pollofrito.nextLine());
		}
		
		
		pollofrito.close();
		
		for (int i=0; i <= 10; i++) {
			//resultado = num * i;
			System.out.println(num + "*" + i + "=" + (num * i));
		}
		/* while (contador <= 10) {
			resultado = num * contador;
			System.out.println(num + "*" + contador + " = " + resultado);
			contador++;
		} */
	}
}


