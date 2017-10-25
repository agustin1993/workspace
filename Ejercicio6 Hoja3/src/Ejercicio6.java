import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int k=1;
		int A;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserte un número:");
		A = teclado.nextInt();
		
		if (A <= 9){
			for (k = 1; k <= A; k = k + 1){
				System.out.println(k);
			}
			System.out.println(A+ " es un numero natural.");
		}else{
			for (k = 1; k <= 9; k = k + 1){
				System.out.println(k);
			}
			System.out.println(A+ " no es un numero natural.");
		}
						
	}

}
