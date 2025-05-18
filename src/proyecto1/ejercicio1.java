package proyecto1;

import java.util.Scanner;

public class ejercicio1 {
	private Scanner teclado;
	private int[] array;
	
	public ejercicio1() {
		teclado = new Scanner(System.in);
		System.out.println("Cuanto numeros hay: ");
		int cantidad = teclado.nextInt();
		array = new int[cantidad];
		
	}
	public void cargar2() {
		for (int f = 0; f < array.length; f++ ) {
			array[f] = 1 + (int) (Math.random() * 100); 
			
		}
	}
	
	public void calculoValorAcumulado() {
		int suma = 0;
		for (int f =0; f< array.length; f++) {
			suma += array[f];
			}
			
		System.out.println("La suma es: " + suma);
	}

	public void CantidadValorMayor50( ) {
		int cantidad = 0;
		for (int f =0; f< array.length; f++) {
			if (array[f] > 50) {
				cantidad += 1;
			}
		}
		System.out.println("Número mayor a 50:  " + cantidad);
	
    }
	public void mostrar() {
		for (int f = 0; f < array.length; f++) {
			System.out.print(array[f] + "-");
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ejercicio1 ta = new ejercicio1 ();
		ta.cargar2();
		ta.mostrar();
		ta.calculoValorAcumulado();
		ta.CantidadValorMayor50();
		}
}