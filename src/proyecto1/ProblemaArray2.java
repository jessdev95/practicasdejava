package proyecto1;

import java.util.Scanner;

public class ProblemaArray2 {
	private Scanner teclado;
	private int[] array;
	
	public ProblemaArray2() {
		teclado = new Scanner(System.in);
		System.out.println("Cuantos elementos tendra el arreglo: ");
		int cant = teclado.nextInt();
		array = new int[cant];

	}
	public void cargar() {
		for (int f = 0; f < array.length; f++) {
			array[f] = 1 + (int) (Math.random()*10);					
		}
	}
	
	public void imprimir() {
		for (int f = 0; f < array.length; f++) {
			System.out.print(array[f] + "-");
			
		}
	}
	
	public static void main (String[] args) {
		ProblemaArray2 pa2 = new ProblemaArray2();
		pa2.cargar();
		pa2.imprimir();
	}
	
}

