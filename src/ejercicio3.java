import java.util.Scanner;

public class ejercicio3 {
	
	public static void main(String[] args) {
		
		//Creo una clase para el teclado
		Scanner teclado = new Scanner(System.in);
		
		//Variables
		int num1;
		
		System.out.println("Introduce un n�mero para saber si es m�ltiplo de 2 o de 3");
		
		//Asignamos el valor que ha introducido el usuario por teclado a la variable num1
		
		num1= Integer.parseInt(teclado.nextLine());
		
		//Cierro teclado
		
		teclado.close();
		
		//Expresiones l�gicas
		
		if(num1%2==0 & num1%3==0) {
			System.out.println("El numero es m�ltiplo de 2 y de 3");
		}
		else {
			if(num1%2==0) {
				System.out.println("El numero es multiplo de 2");
			}
			else {
				if(num1%3==0) {
					System.out.println("El numero es m�ltiplo de 3");
				}
				else {
					System.out.println("El n�mero no es m�ltiplo ni de 2 ni de 3");
				}
			}
		}
	}
}