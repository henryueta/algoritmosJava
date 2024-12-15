package listaJ;

import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double num,zero;
	zero = 0;
	
	System.out.println("Digite o valor de um número: ");
	num = entrada.nextDouble();
	
	while(zero <= num) {
		
		if(zero%2 != 0) {
			System.out.println(zero+ " = impar");
		}
		else {
			System.out.println(zero+ " = par");
		}
		zero++;

		
		
	}
		
		
		
	}

}
