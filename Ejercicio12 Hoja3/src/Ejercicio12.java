
public class Ejercicio12 {

	public static void main(String[] args) {
		int k=1;
		int suma=0;
		int suma1=0;
		
		for(k = 1; k <= 100; k = k + 1){
			if(k % 2 == 0){
				suma = suma + k;
			}
			if(k % 2 == 1){
				suma1 = suma1 + k;
			}
		}
		System.out.println("La suma de los pares es: " +suma);
		System.out.println("La suma de los impares es: " +suma1);
	}

}
