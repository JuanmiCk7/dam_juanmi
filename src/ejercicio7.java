import java.util.Scanner;

public class ejercicio7 {
	public static void main(String[] args) {
		
		//Creamos el objeto teclado para poder recoger un valor
		Scanner teclado = new Scanner(System.in);

		//Le pedimos las variables al usuario y las definimos
		System.out.println("Introduzca su estado civil:");
		char civil = teclado.nextLine().charAt(0);
		System.out.println("Introduzca su edad:");
		int edad = Integer.parseInt(teclado.nextLine());
		
		//Cerramos el objeto teclado
		teclado.close();
		
		//Expresiones lógicas
		if ((civil == 'S' || civil == 'D')&& edad < 35) {
			System.out.println("Su retención es del 12%");
		}
		else if ((civil == 'V' || civil == 'C')&& edad < 35) {
			System.out.println("Su retención es del 11.3%");
		}
		else if (edad > 50) {
			System.out.println("Su retención es del 8.5%");
		}
		else {
			System.out.println("Su retención es del 10.5%");
		}
	}
}
