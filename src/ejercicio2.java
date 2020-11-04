
import java.util.Scanner;

public class ejercicio2 {
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Variables
		int num1;
		int num2;
		
		System.out.println("Introduce un nmero");
		num1= Integer.parseInt(teclado.nextLine()); //Leer n�mero 1
		System.out.println("Introduce un n�mero");
		num2= Integer.parseInt(teclado.nextLine()); //Leer n�mero 2
		
		if (num1 == num2) {
			System.out.println("El numero 1 es igual que el numero 2");
		}
		else {
			if (num1>num2) {
				System.out.println("El numero 1 es mayor que el numero 2");
			} 
			else {
				System.out.println("El numero 2 es mayor que el numero 1");
			}
		}
	}
}