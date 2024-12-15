package listaD;

import java.util.Scanner;

public class D7 {

	public static void main(String[] args) {

		double a;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		a = leia.nextDouble();
		
		if(a > 5)
			if(a < 10) {
				System.out.println("Este número está entre 5 e 10.");
			}
		if(a < 5) {
			System.out.println("Este número é menor que 5.");
		}
		if(a > 10) {
			System.out.println("Este número é maior que 10.");
		}
	}

}