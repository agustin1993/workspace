
public class Ejercicio13 {

	public static void main(String[] args) {
		int k=1;
		int cont1=0;
		int cont=0;
		
		System.out.println("//////////Multiplos de 2//////////");
		for(k = 1; k <= 100; k = k + 1){
			if(k % 2 == 0){
				System.out.println("Los numero multiplos de 2 son: " +k);
				cont1 = cont1 + 1;
			}
		}
		System.out.println("//////////Multiplos de 3//////////");
		for(k = 1; k <= 100; k = k + 1){
			if(k % 3 == 0){
				System.out.println("Los numero multiplos de 3 son: " +k);
				cont = cont + 1;
			}
		}
		System.out.println("////////////Contadores////////////");
		System.out.println("Contador multiplo de 2: " +cont1);
		System.out.println("Contador multiplo de 3: " +cont);

	}

}
