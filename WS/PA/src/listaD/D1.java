package listaD;

import java.util.Scanner;

public class D1 {

	public static void main(String[] args) {

		double n1, n2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		n1 = leia.nextDouble();
		System.out.println("Digite o segundo valor:");
		n2 = leia.nextDouble();
		
		if (n1 > n2) {
			System.out.println("o valor " + n1 + " é maior que o valor " + n2 + "!");
		}
		if (n2 > n1) {
			System.out.println("O valor " + n2 + " é maior que o valor " + n1 + "!");
		}
		if (n1 == n2) {
			System.out.println("Os dois valores sãos iguais!");
		}
		
	}

}
