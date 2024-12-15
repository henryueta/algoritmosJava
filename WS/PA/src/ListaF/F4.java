package listaF;

import java.util.Scanner;

public class F4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double n1, n2, n3, n4, media, media1, exame;
		String cond;
		
		System.out.println("Informe a primeira nota escolar");
		n1 = leia.nextDouble();
		System.out.println("Informe a segunda nota escolar");
		n2 = leia.nextDouble();
		System.out.println("Informe a terceira nota escolar");
		n3 = leia.nextDouble();
		System.out.println("Informe a quarta nota escolar");
		n4 = leia.nextDouble();
		
		media = ((n1 + n2 + n3 + n4) / 4);
		
		if(media >= 7) {
			cond = "Aprovado";
			System.out.println("Aluno " + cond + " com média " + media);
		}
		else if(media < 7) {
			System.out.println("Informe a nota do exame");
			exame = leia.nextDouble();
			media1 = ((exame + media) / 2);
				if(media1 >= 5) {
					cond = "Aprovado";
					System.out.println("Aluno " + cond + " em exame com média " + media1);
				}
				else {
					cond = "Reprovado";
					System.out.println("Aluno " + cond + " com média " + media1);
				}
		}
		
	}

}
