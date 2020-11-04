package ejercicios_Extra;

public class Ejercicio1_Extra {

	public static void main(String[] args) {

		int[] numArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sumary = 0;

		for (int i = 0; i < numArray.length; i++) {
			if (i % 2 == 0) {
				sumary += numArray[i];
			}
			
		}
		System.out.print(sumary);
	}
}