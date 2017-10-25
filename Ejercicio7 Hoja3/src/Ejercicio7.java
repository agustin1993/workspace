import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		String frase="";
		int cont=0;
		
		Scanner teclado = new Scanner(System.in);
		
		while (frase.equals("0") != true){
			System.out.println("Inserte una frase (pulsa 0 cuando quieras salir)");
			frase = teclado.next();
			if (frase .equals("0") == false){
				cont = cont + 1;
			}
		}
		System.out.println("Has puesto "+cont+" frases");
	}

}
