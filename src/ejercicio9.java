import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		char tipo = '0';
		double precio = 0;
		double rebaja;
		
		while (tipo !='A' && tipo !='B' && tipo != 'C') {
		System.out.println("Introduzca el tipo de producto, los productos pueden ser de tipo A, B o C");
		tipo = teclado.nextLine().charAt(0);
		
		}
		
		System.out.println("Introduzca el precio del producto");
		precio = Integer.parseInt(teclado.nextLine());
		teclado.close();
		
		if (tipo == 'A') {
			rebaja = precio-(precio*(7.0/100.0));
			System.out.println("El precio rebajado es " + rebaja);
		}
		else if (tipo == 'C' && precio < 500) {
			rebaja = precio-(precio*(12.0/100.0));
			System.out.println("El precio rebajado es " + rebaja);
		}
		else {
			rebaja = precio-(precio*(9.0/100.0));
			System.out.println("El precio rebajado es " + rebaja);
		}
	}
}
