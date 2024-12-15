package listaG;

import java.util.Scanner;

public class G3 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);	
	double salario,novo,reajust;
	String cod;
	
	System.out.println("Digite o valor do salario do funcionário:  ");
    salario = entrada.nextDouble();
    System.out.println("Digite o valor do codigo: ");
    cod = entrada.next();	
    
    
    switch(cod){
	case "5":
		reajust=((salario/100)*5);
		novo=(salario + reajust);
		System.out.println("Seu salário antigo de R$"+salario+ " passará por um reajuste de 5% e terá um valor de R$"+novo);		
		break;
	case "15":
		reajust=((salario/100)*10);
		novo=(salario + reajust);
		System.out.println("Seu salário antigo de R$"+salario+ " passará por um reajuste de 10% e terá um valor de R$"+novo);			
		break;	
	case "20":
		reajust=((salario/100)*15);
		novo=(salario + reajust);
		System.out.println("Seu salário antigo de R$"+salario+ " passará por um reajuste de 15% e terá um valor de R$"+novo);					
		break;
	case "25":
		reajust=((salario/100)*20);
		novo=(salario + reajust);
		System.out.println("Seu salário antigo de R$"+salario+ " passará por um reajuste de 20% e terá um valor de R$"+novo);			
		break;	
	case "30":
		reajust=((salario/100)*25);
		novo=(salario + reajust);
		System.out.println("Seu salário antigo de R$"+salario+ " passará por um reajuste de 25% e terá um valor de R$"+novo);					
		break;
	case "35":
		reajust=((salario/100)*30);
		novo=(salario + reajust);
		System.out.println("Seu salário antigo de R$"+salario+ " passará por um reajuste de 30% e terá um valor de R$"+novo);			
		break;	    
	}

  }
	
}	
