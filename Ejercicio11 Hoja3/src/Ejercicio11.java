import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		int num;
		int cont=0;
		int k=1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserte un n�mero:");
		num = teclado.nextInt();
		
		for(k = 1; k <= num; k = k + 1){
			if(k % 3 == 0){
				System.out.println(k);
				cont = cont + 1;
			}
		}
		System.out.println("Contador: "+cont);
	}

}
