package relacion2;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int i = 1;
		
		for (i=1; i<=100;i++) {
			
			if (i%13==0 && i%7==0) {
				System.out.println("El número " + i + " es múltiplo de 7 y 13");
			}
			else if (i%13==0) {
				System.out.println("El número " + i + " es múltiplo de 13");
			}
			else if (i%7==0) {
				System.out.println("El número " + i + " es múltiplo de 7");
			}
		}
	}
}
