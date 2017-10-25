
public class Ejercicio5 {

	public static void main(String[] args) {
		int k;
		int A;
		int cont=0;
		A = 1;
			
			for(k = 0; k <= 100; k = k + 1){
				if(k%2==1){
					cont = cont + 1;
					System.out.println(A * k);
				}
			}
			System.out.println("Hay "+cont+" impares.");
	}

}
