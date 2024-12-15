package listaF;

import java.util.Scanner;

public class F3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double n1, n2, n3, n4, media;
		String cond;
		
		System.out.println("Informe a primeira nota:");
		n1 = leia.nextDouble();
		System.out.println("Informe a segunda nota:");
		n2 = leia.nextDouble();
		System.out.println("Informe a terceira nota:");
		n3 = leia.nextDouble();
		System.out.println("Informe a quarta nota:");
		n4 = leia.nextDouble();
		
		media = ((n1 + n2 + n3 + n4) / 4 );
		
		
		if (media >= 5) {
			cond = "Aprovado";
			System.out.println("Aluno com média de " + media + cond);
		}
		else {
			cond = "Reprovado";
			System.out.println("Aluno " + cond + " com a média " + media);
		}
	}

}
