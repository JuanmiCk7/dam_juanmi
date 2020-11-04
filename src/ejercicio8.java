import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce una hora por teclado en formato hh:mm:ss");
		String first = new String(teclado.nextLine());
		System.out.println("Introduce una segunda hora por teclado en formato hh:mm:ss");
		String second = new String(teclado.nextLine());
		
		DateFormat datos = new 
		SimpleDateFormat("hh:mm:ss");
		
		
			
	}

}
