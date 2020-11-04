package ejerciciosExtra_Peter;

import java.util.Scanner;

public class EjercicioDadosPeter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dice_faces, rolls, result; 
		
		do {
			
			System.out.print("Introduce el número de caras del dado: ");
			dice_faces = sc.nextInt();
			System.out.print("Introduce el número de tiradas: ");
			rolls = sc.nextInt();
			
			switch (dice_faces) {
			case 4: {
				for (int i = 1; i <= rolls; i++) {
					result = (int)(Math.random()*4 + 1);
					System.out.println("La tirada " + i + " ha salido el número " + result);
				}
				break;
			}
			case 6: {
				for (int i = 1; i <= rolls; i++) {
					result = (int)(Math.random()*6 + 1);
					System.out.println("La tirada " + i + " ha salido el número " + result);
				}
				break;
			}
			case 8: {
				for (int i = 1; i <= rolls; i++) {
					result = (int)(Math.random()*8 + 1);
					System.out.println("La tirada " + i + " ha salido el número " + result);
				}
				break;
			}
			case 10: {
				for (int i = 1; i <= rolls; i++) {
					result = (int)(Math.random()*9);
					System.out.println("La tirada " + i + " ha salido el número " + result);
				}
				break;
			}
			case 12: {
				for (int i = 1; i <= rolls; i++) {
					result = (int)(Math.random()*12 + 1);
					System.out.println("La tirada " + i + " ha salido el número " + result);
				}
				break;
			}
			case 20: {
				for (int i = 1; i <= rolls; i++) {
					result = (int)(Math.random()*20 + 1);
					System.out.println("La tirada " + i + " ha salido el número " + result);
				}
				break;
			}
			default: {
				System.out.print("El número de caras del dado introducido no es válido. Terminando ejecución...");
			}
			}
			
		} while (dice_faces == 4 || dice_faces == 6 || dice_faces == 8 || dice_faces == 10 || dice_faces == 12 || dice_faces == 20);
		
		
		sc.close();
	}

}
