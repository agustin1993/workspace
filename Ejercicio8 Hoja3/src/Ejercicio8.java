import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		String respuesta = "";
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserte S o N:");
		respuesta = teclado.next();
		
		while(!respuesta.equals("S") || !respuesta.equals("S")){
			System.out.println("Lo que has escrito no es ni S ni N, porfavor vuelve a introducirlo");
			respuesta = teclado.next();
		}
		System.out.println("Has introducido " +respuesta);
	}

}
