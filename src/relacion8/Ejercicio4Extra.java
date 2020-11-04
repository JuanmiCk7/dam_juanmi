package relacion8;

import java.util.Scanner;

public class Ejercicio4Extra {

	public static void main(String[] args) {
		
		
		//Declaración de variables
		
		int hora, minutos, segundos, sum_hora, sum_min, sum_seg, resul_hora, resul_min, resul_seg; 
		boolean nextDay = false;
		
		Scanner sc = new Scanner(System.in);
		
		// Con los do while hacemos que las horas, los minutos y los segundos introducidos sean menores que su límite.
		
		do {
		System.out.print("Introduce la hora base: ");
		hora = sc.nextInt();
		} while (hora > 23 && hora < 0);
		
		do {
		System.out.print("Introduce los minutos base: ");
		minutos = sc.nextInt();
		} while (minutos > 59 && minutos < 0);
		
		do {
		System.out.print("Introduce los segundos base: ");
		segundos = sc.nextInt();
		} while (segundos > 59 && segundos < 0);
		
		do {
		System.out.print("Introduce cuantas horas quieres sumar: ");
		sum_hora = sc.nextInt();
		} while (sum_hora > 23 && sum_hora < 0);
		
		do {
		System.out.print("Introduce cuantos minutos quieres sumar: ");
		sum_min = sc.nextInt();
		} while (sum_min > 59 && sum_min < 0);
		
		do {
		System.out.print("Introduce cuantos segundos quieres sumar: ");
		sum_seg = sc.nextInt();
		} while (sum_seg > 59 && sum_seg < 0);
		
		/*
		 * La lógica es que si la hora base más la suma de la otra la variable nextDay se active para que el programa indique que el día ha cambiado,
		 * si es así sumamos ambas horas y le restamos 24 para saber que hora es del día siguiente.
		 * 
		 * Hacemos lo mismo con los minutos y los segundos, pero a diferencia de las horas, cuando supera el límite lo que hacemos es sumar 1 a su nivel superior.
		 * Es decir, si tenemos de minuto base 59 segundo y le sumamos 13, calculamos 59 + 13 - 60 para saber los minutos sobrantes y al resultado  de la hora le 
		 * sumamos 1.
		 * 
		 * En todo caso si la suma de horas, minutos y segundos con sus sumadores no supera el límite simplemente se suman.
		 * 
		 */
		
		// Calculamos la varible resul_hora fuera del if porque nos hace falta para usarla de comparador.
		resul_hora = hora + sum_hora;
		
		/* 
		 * Con este primer if comprobamos si la suma de las horas es 24 o mayor para activar la variable nextDay y sumarlas siempre teniendo en cuenta que
		 * siempre que pasa un día se le resta 24 a la hora actual.
		 *
		 */
		
		if (resul_hora >= 24) {
			resul_hora = hora + sum_hora - 24;
			nextDay = true;
		}
		else {
			resul_hora = hora + sum_hora;
		}
		
		// Calculamos el resultado de la suma de los minutos
		resul_min = minutos + sum_min;
		
		/*
		 * Con este if comprobamos si la suma de los minutos es igual o mayor a 60, pero en vez de activar una variable nextDay, sumamos 1 al resultado de las
		 * horas y volvemos a comparar si la hora es mayor o igual a 24 para activar la variable nextDay y para restarle 24 al resultado de la suma de las variables
		 * hora y sum_hora
		 */
		
		if (resul_min >= 60) {
			resul_min = minutos + sum_min - 60;
			resul_hora ++;
			
			if (resul_hora >= 24) {
				resul_hora = hora + sum_hora - 24;
				nextDay = true;
				resul_hora++;
			}
		}
		else {
			resul_min = minutos + sum_min;
		}
		
		// Calculamos el resultado de las suma de los segundos
		resul_seg = segundos + sum_seg;
		
		/*
		 * En este if hacemos lo mismo que en el anterior pero con los segundos, pero tenemos que introducir 2 if más para comprobar si al sumar los minutos y
		 * superar el límite no se está superando también el límite de los minutos y de las horas. Ejemplo: Si introduzco 23:59:59 y sumo 00:00:01, estaría sumando 1 a
		 * los minutos que ahora también superan el límite y hay que sumarle 1 a las horas que ahora es igual a 24 por lo tanto ya serían las 00:00:00.
		 */
		
		if (resul_seg >= 60) {
			resul_seg = segundos + sum_seg - 60;
			resul_min ++;
			
			if (resul_min >= 60) {
				resul_min = minutos + sum_min - 60;
				resul_hora ++;
				resul_min++;
			}
				if (resul_hora >= 24) {
					resul_hora = hora + sum_hora - 24;
					nextDay = true;
					resul_hora++;
				}
		}
		else {
			resul_seg = segundos + sum_seg;
		}
		
		// Dependiendo de si a la varible nextDay se le ha asignado un resultado verdadero o falso, indicamos si es el siguiente día o no.
		
		if (nextDay == true) {
			System.out.printf("La hora resultante es: %02d:%02d:%02d (Del siguiente día)", resul_hora, resul_min, resul_seg);
		}
		else {
			System.out.printf("La hora resultante es: %02d:%02d:%02d", resul_hora, resul_min, resul_seg);
		}
		sc.close();
	}
}
