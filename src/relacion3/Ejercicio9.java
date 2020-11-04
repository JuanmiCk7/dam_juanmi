package relacion3;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		
		int resultado;
		
		//Utilizamos el bucle for para aumentar el multiplicando cada vez que iteramos
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("Tabla del " + i);
			
		//Utilizamos el bucle for anidado para aumentar el multiplicador cada vez que iteramos
			
			for (int j = 0; j <= 10; j++) {
				resultado = i * j;
				System.out.println(i + " x " + i + " = " + resultado);
			}
		}
	}
}
