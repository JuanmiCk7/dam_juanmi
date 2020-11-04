package relacion3;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int num1, num2, resto = 1, resul_final = 0, resul_div = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduce el primer número: ");
			num1 = Integer.parseInt(sc.nextLine());
			System.out.println("Introduce el segundo número: ");
			num2 = Integer.parseInt(sc.nextLine());
		} while (num1 <= 0 && num2 <= 0);
		
		
		
		while (resto != 0) {
			
			
			
			resto = num1%num2;
			
			num1 = resto;
			
			
			resul_final = num2%resto;
			
			
			num1 = resto;
			
			System.out.println("RESTO " + resto);
			System.out.println("RESUL " + resul_final);
			System.out.println("NUM2 " + num2);
		}
		System.out.println(String.format("El m.c.d de %d y de %d es : %d", num1, num2, resul_final));
		//System.out.println(num1%num2);
	}

}
