package ejercicios_Extra;

public class Ejercicio2_Extra {

	public static void main(String[] args) {
		
		int[] numArray = {-5,2,-4,6,-6,-6,7,-8,-9,10};
		int contador = 0;
		
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] < 0) {
				contador ++;
			}
		}
		System.out.print(contador);
	}

}
