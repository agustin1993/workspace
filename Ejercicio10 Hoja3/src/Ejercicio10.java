import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int num;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserte un n�mero:");
		num = teclado.nextInt();
		
		if(num % 2 == 0){
			System.out.println("El n�mero " +num+ " es par.");
		}
		if(num % 2 == 1){
			System.out.println("El n�mero " +num+ " es impar.");
		}
	}

}
