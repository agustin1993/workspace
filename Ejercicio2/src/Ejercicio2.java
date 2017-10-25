import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int numero1;
		int k;
		int suma;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese número:");
		numero1 = teclado.nextInt();
		
		if(numero1 < 0){
			numero1 = -numero1;
		}
		suma = 0;
		for (k=1; k<=numero1; k=k+1){
			if (k % 2== 0){
				suma = suma + k * k;
			}
		}
		System.out.println("La suma de los cuadrados es " + suma);
	}

}
