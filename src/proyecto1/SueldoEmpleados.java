package proyecto1;

import java.util.Scanner;

public class SueldoEmpleados {
	private Scanner teclado;
	private	int[] sueldos;
	
	public SueldoEmpleados() {
		teclado = new Scanner(System.in);
		sueldos = new int [5];
		for (int f = 0; f < 5; f++) {
			System.out.print("Ingrese valor de la componente: ");
			sueldos[f] = teclado.nextInt();
		
		}
	}
	public void imprimir() {
		for (int f=0; f<5; f++) {
			System.out.println(sueldos[f]);
			
		}
	}

	public static void main(String[] args) {
		SueldoEmpleados se = new SueldoEmpleados();
		se.imprimir();
		
	
	}
}
