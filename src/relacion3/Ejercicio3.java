package relacion3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int num;
		int resultado = 1;
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero entero: ");
		num = Integer.parseInt(sc.nextLine());
		
		resultado = num;
		
		while (resultado!=0) {
			resultado = resultado/10;
			contador++;
		}
		System.out.println(String.format("El n�mero es de %d cifras.", contador));
		sc.close();
	}

}
