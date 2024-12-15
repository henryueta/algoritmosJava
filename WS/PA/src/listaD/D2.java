package listaD;

import java.util.Scanner;

public class D2 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

	
	System.out.print("Por favor digite um número: ");
	double n1 = entrada.nextDouble();
	
	if(n1 > 100) {
		System.out.println(" O número "  +n1+  " é maior que 100");
	}
	
	if(n1 < 100) {
		System.out.println(" O número " +n1+ " é menor que 100");
	}
	
	if(n1==100) {
		System.out.println("O número " +n1+ " é igual a 100");				
	}
		
		
		

	}

}
