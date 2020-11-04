package ejerciciosExtra_Peter;

public class EjercicioRandomArrayPeter {

	public static void main(String[] args) {

		final int aleatorio = 6000;
		final int rango = 6;
		float porcentaje_total;
		int numArray[] = new int[rango];
		int numero;

		for (int i = 0; i <= aleatorio; i++) {
			numero = (int) Math.floor(Math.random() * 6);

			switch (numero) {
			case 0: {
				numArray[0]++;
				break;
			}
			case 1: {
				numArray[1]++;
				break;
			}
			case 2: {
				numArray[2]++;
				break;
			}
			case 3: {
				numArray[3]++;
				break;
			}
			case 4: {
				numArray[4]++;
				break;
			}
			case 5: {
				numArray[5]++;
				break;
			}
			}
		}

		System.out.println("El nº 0 se ha repretido " + numArray[0] + " veces. Esto equivale a un "
				+ (float) numArray[0] / 6000 * 100 + "%");
		System.out.println("El nº 1 se ha repretido " + numArray[1] + " veces. Esto equivale a un "
				+ (float) numArray[1] / 6000 * 100 + "%");
		System.out.println("El nº 2 se ha repretido " + numArray[2] + " veces. Esto equivale a un "
				+ (float) numArray[2] / 6000 * 100 + "%");
		System.out.println("El nº 3 se ha repretido " + numArray[3] + " veces. Esto equivale a un "
				+ (float) numArray[3] / 6000 * 100 + "%");
		System.out.println("El nº 4 se ha repretido " + numArray[4] + " veces. Esto equivale a un "
				+ (float) numArray[4] / 6000 * 100 + "%");
		System.out.println("El nº 5 se ha repretido " + numArray[5] + " veces. Esto equivale a un "
				+ (float) numArray[5] / 6000 * 100 + "%");

		porcentaje_total = (float) numArray[0] / 6000 * 100 + (float) numArray[1] / 6000 * 100
				+ (float) numArray[2] / 6000 * 100 + (float) numArray[3] / 6000 * 100 + (float) numArray[4] / 6000 * 100
				+ (float) numArray[5] / 6000 * 100;

		System.out.println("La suma de todos los porcentajes es equivalente al " + (int) porcentaje_total + "%.");

	}

}
