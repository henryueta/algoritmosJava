package listaD;

import java.util.Scanner;

public class D9 {

	public static void main(String[] args) {

	double cod, salario, a, b;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o código:");
	cod = leia.nextDouble();
	System.out.println("Digite o salario atual do funcionário:");
	salario = leia.nextDouble();
	
	if(cod == 1) {
		a = (salario * 0.05);
		b = (salario + a);
		System.out.println("O salário antigo era " + salario + " e o novo salário é de " + b + " com o valor de " + a + " de reajuste na função de Operador.");
	}
	if(cod == 2) {
		a = (salario * 0.10);
		b = (salario + a);
		System.out.println("O salário antigo era " + salario + " e o novo salário é de " + b + " com o valor de " + a + " de reajuste na função de Programador.");
	}
	if(cod == 3) {
		a = (salario * 0.15);
		b = (salario + a);
		System.out.println("O salário antigo era " + salario + " e o novo salário é de " + b + " com o valor de " + a + " de reajuste na função de Analista.");

	}
	}

}
