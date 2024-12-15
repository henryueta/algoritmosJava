package listaI;

import java.util.Scanner;

public class I1 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
	int num1,num2,num3;
	num2=100;
	num3=1;
	
	System.out.println("Sistema para apresentar os números de 1 até 100");
	
	System.out.println("\nORDEM CRESCENTE:");
	
	for(num1 = 1; num1 <= num2; num1++) {
		System.out.println(+num1);
	}
	
	System.out.println("\nORDEM DECRESCENTE:");

	for(num2 = 100; num3 <= num2; num2--) {
		System.out.println(+num2);
	}
	
		
	}

}
