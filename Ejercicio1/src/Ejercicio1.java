import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		int suma;
		int k;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese primer valor:");
		numero1 = teclado.nextInt();
		System.out.println("Ingrese segundo valor:");
		numero2 = teclado.nextInt();
		while(numero1 > numero2){
			System.out.println("Introducir otro numero mayor o igual que " +numero1);
			numero2 = teclado.nextInt();	
		}
		suma = 0;
		for(k = numero1; k <= numero2; k++){
			if(k % 2 != 0){
				suma = suma + k;
			}
		}
		System.out.println("La suma de los impares es:  " + suma);
	}

}
