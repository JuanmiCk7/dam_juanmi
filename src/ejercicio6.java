//Importamos las utilidades de Java
import java.util.Scanner;


public class ejercicio6 {
	public static void main(String[] args) {
		
		
		System.out.println("Ingresa un caracter en pantalla: ");
		//Creamos el objeto teclado
		Scanner teclado = new Scanner(System.in);
		
		//Declaración de varibles
		char vocal = teclado.nextLine().charAt(0);
		
		//Convertimos el caracter a minúscula para que pase por el switch
		vocal = Character.toLowerCase(vocal);
		
		teclado.close();
		
		switch(vocal) {
			case 'a': 
				System.out.println("Es la primera vocal");
				break;
			case 'e':
				System.out.println("El la segunda vocal");
				break;
			case 'i':
				System.out.println("Es la tercera vocal");
				break;
			case 'o':
				System.out.println("La vocal es o");
				break;
			case 'u':
				System.out.println("La vocal es u");
			default:
				System.out.println("El carácter no es una vocal");
		}	
	}
}
