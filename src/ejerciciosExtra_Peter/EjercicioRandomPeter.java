package ejerciciosExtra_Peter;

public class EjercicioRandomPeter {

	public static void main(String[] args) {
		
		final int aleatorio = 6000;
		int contador0 = 0, contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, contador5 = 0, numero;
		float porcentaje_total;
		
		for (int i = 0; i <= aleatorio; i++) {
			numero = (int)Math.floor(Math.random()*6);
			
			switch (numero) {
			case 0: {
				contador0++;
				break;
			}
			case 1: {
				contador1++;
				break;
			}
			case 2: {
				contador2++;
				break;
			}
			case 3: {
				contador3++;
				break;
			}
			case 4: {
				contador4++;
				break;
			}
			case 5: {
				contador5++;
				break;
			}
			}
		}
		
		System.out.println("El nº 0 se ha repretido " + contador0 + " veces. Esto equivale a un " + (float)contador0/6000*100 + "%");
		System.out.println("El nº 1 se ha repretido " + contador1 + " veces. Esto equivale a un " + (float)contador1/6000*100 + "%");
		System.out.println("El nº 2 se ha repretido " + contador2 + " veces. Esto equivale a un " + (float)contador2/6000*100 + "%");
		System.out.println("El nº 3 se ha repretido " + contador3 + " veces. Esto equivale a un " + (float)contador3/6000*100 + "%");
		System.out.println("El nº 4 se ha repretido " + contador4 + " veces. Esto equivale a un " + (float)contador4/6000*100 + "%");
		System.out.println("El nº 5 se ha repretido " + contador5 + " veces. Esto equivale a un " + (float)contador5/6000*100 + "%");
		
		porcentaje_total = (float)contador0/6000*100 + (float)contador1/6000*100 + (float)contador2/6000*100 + (float)contador3/6000*100 + (float)contador4/6000*100 + (float)contador5/6000*100;
		
		System.out.println("La suma de todos los porcentajes es equivalente al " + (int)porcentaje_total + "%." );
	}

}
