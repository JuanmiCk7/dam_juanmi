import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		//NICEEEEEEEEEE
		
		Scanner teclado = new Scanner(System.in);
		char character;
		int num1, num2, resultado;
		boolean isValid = false;
		
		while (isValid == false) {
			System.out.println("Introduce un caracter o un operador aritmético");
			character = teclado.nextLine().charAt(0);
			
			if (character != '+' && character != '-' && character != '*' && character != '/') {
				System.out.println("No se puede operar con este carácter");
				
			}
			else {
				
				isValid = true;
				System.out.println("Introduce el numero 1:");
				num1 = Integer.parseInt(teclado.nextLine());
				System.out.println("Introduce el numero 2");
				num2 = Integer.parseInt(teclado.nextLine());
				teclado.close();
				
				switch (character) {
				case '+':
					resultado = num1 + num2;
					System.out.println("El resultado es: " + resultado);
					break;
				case '-':
					resultado = num1 - num2;
					System.out.println("El resultado es: " + resultado);
					break;
				case '*':
					resultado = num1 * num2;
					System.out.println("El resultado es: " + resultado);
					break;
				case '/':
					if (num2 <= 0) {
						System.out.println("No se puede dividir entre 0");
					}
					else {
						resultado = num1 / num2;
						System.out.println("El resultado es: " + resultado);
					}
					break;
				}
			}
		}

	}

}
