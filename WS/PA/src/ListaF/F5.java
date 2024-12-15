package listaF;

import java.util.Scanner;

public class F5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double cod, salarioAtual, reajuste, salarioNovo;
		
		System.out.println("Digite o código do funcionário:");
		cod = leia.nextDouble();
		System.out.println("Informe o salário atual do funcionário:");
		salarioAtual = leia.nextDouble();
		
		
		  if(cod == 1) {
			  reajuste = ((salarioAtual / 100) * 5);
			  salarioNovo = (salarioAtual + reajuste);
			  System.out.println("O salário de " + salarioAtual + " foi atualizado para " + salarioNovo + " com reajuste de " + reajuste + "R$.");
		} else if(cod == 2) {
					reajuste = ((salarioAtual / 100) * 10);
					salarioNovo = (salarioAtual + reajuste);
					System.out.println("O salário de " + salarioAtual + " foi atualizado para " + salarioNovo + " com reajuste de " + reajuste + "R$.");
		}	   else if(cod == 3) {
						reajuste = ((salarioAtual / 100) * 15);
						salarioNovo = (salarioAtual + reajuste);
						System.out.println("O salário de " + salarioAtual + " foi atualizado para " + salarioNovo + " com reajuste de " + reajuste + "R$.");
		}			 else if(cod == 4) {
							reajuste = ((salarioAtual / 100) * 20);
							salarioNovo = (salarioAtual + reajuste);
							System.out.println("O salário de " + salarioAtual + " foi atualizado para " + salarioNovo + " com reajuste de " + reajuste + "R$.");
		}				  else if(cod == 5) {
								reajuste = ((salarioAtual / 100) * 25);
								salarioNovo = (salarioAtual + reajuste);
								System.out.println("O salário de " + salarioAtual + " foi atualizado para " + salarioNovo + " com reajuste de " + reajuste + "R$.");
		}					   else if(cod == 6) {
									  reajuste = ((salarioAtual / 100) * 30);
									  salarioNovo = (salarioAtual + reajuste);
									  System.out.println("O salário de " + salarioAtual + " foi atualizado para " + salarioNovo + " com reajuste de " + reajuste + "R$.");									  
		}
	}

}
