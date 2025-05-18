package proyecto1;


public class ProblemaArray1 {
	private int [] array;
	public ProblemaArray1() {
		array = new int[100];
		
	}
	public void cargarValoresAleatorios() {
		for (int f= 0; f < array.length; f++) {
			array[f] =1 + (int) (Math.random() * 10);
		}
	}
	public void imprimir() {
		for (int f=0; f < array.length; f++) {
			System.out.print(array[f] + "-");
		}
		System.out.println();
	}
	public void cantidadIguales10() {
		int cant = 0;
		for (int f = 0; f < array.length; f++) {
			if (array[f] == 10) {
				cant += 1;
			}
		}
		System.out.println("Cantidad de elementos que tiene un 10: " + cant);
}
	public static void main (String[] args) {
		ProblemaArray1 pa = new ProblemaArray1();
		pa.cargarValoresAleatorios();
		pa.imprimir();
		pa.cantidadIguales10();
	}
}