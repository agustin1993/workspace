import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		int num;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserte un n�mero:");
		num = teclado.nextInt();
		
		if(num > 0){
			System.out.println("El n�mero " +num+ " es positivo.");
		}
		if(num < 0){
			System.out.println("El n�mero " +num+ " es negativo.");
		}
		if(num == 0){
			System.out.println("El n�mero es " +num);
		}
	}

}
