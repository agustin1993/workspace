import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numero1;
		int k;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		numero1 = teclado.nextInt();
		
		while(numero1 < 1 || numero1 > 100){
			System.out.println("Has introducido un numero invalido");
			numero1 = teclado.nextInt();
		}
		for(k = 1; k <= 10; k = k + 1){
			System.out.println(numero1 + " * " + k +" = " + numero1 * k);
		}
	}

}
