package relacion3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Declaraci�n de variables
		int alumnos = 0;
		int notas = 0;
		int suspensos = 0;
		int aprobados = 0;

		Scanner sc = new Scanner(System.in);
		
		// Filtramos que la cantidad de alumnos sea mayor a 0 y se los pedimos al usuario
		
		do {
			System.out.println("Introduce el n�mero de alumnos: ");
			alumnos = Integer.parseInt(sc.nextLine());
		} while (alumnos < 0);
		
		// Hacemos que el usuario introduzca las notas del n�mero de alumnos que ha seleccionado antes
		
		for (int i = 1; alumnos >= i; i++) {
			System.out.println("Introduce la nota del alumno: ");
			notas = Integer.parseInt(sc.nextLine());
			
			// Filtramos que las notas sean entre 0 y 10 y sumamos 1 a la variable aprobados 
			// si la nota es mayor a 5. Si es menor que 0, sumo a la variable aprobados. Si el n�mero no est�
			// en ese rango mando un mensaje
			
			if (notas > 0 && notas < 10) {

				if (notas >= 5) {
					aprobados++;
				} else {
					suspensos++;

				}
			} else {
				System.out.println("El n�mero que has introducido no es v�lido");
			}
			
			sc.close();
			
			System.out.println("El n�mero de aprobados es: " + aprobados);
			System.out.println("El n�mero de suspensos es: " + suspensos);

		}
	}
}
