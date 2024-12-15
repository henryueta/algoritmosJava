package listaG;

import java.util.Scanner;

public class G4 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
		double salario,reajust,novo;
		String cod;
		System.out.println("Digite o valor do salário do funcionário: ");
		salario = entrada.nextDouble();
		System.out.println("Digite o valor do código entre 1 e 4: ");
		cod = entrada.next();
		

		
		switch(cod){
		case "1":
			reajust=((salario/100)*5);
			novo=(salario + reajust);
			System.out.print("Sua função é Operador. Seu salário antigo de R$" +salario);
			System.out.print(" passará por um reajuste de 5% e terá um valor de R$" +novo);			
			break;
		case "2":
			reajust=((salario/100)*10);
			novo=(salario + reajust);
			System.out.print("Sua função é Programador. Seu salário antigo de R$" +salario);
			System.out.print(" passará por um reajuste de 10% e terá um valor de R$" +novo);	
			break;	
		case "3":
			reajust=((salario/100)*15);
			novo=(salario + reajust);
			System.out.print("Sua função é Analista. Seu salário antigo de R$" +salario);
			System.out.print(" passará por um reajuste de 15% e terá um valor de R$" +novo);			
			break;
		case "4":
			reajust=((salario/100)*25);
			novo=(salario + reajust);
			System.out.print("Sua função é Gerente. Seu salário antigo de R$" +salario);
			System.out.print(" passará por um reajuste de 25% e terá um valor de R$" +novo);	
			break;	
			
			
		}
		
		
	}

}
