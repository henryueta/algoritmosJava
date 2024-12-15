package listaI;

import java.util.Scanner;

public class I8 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //REAJUSTE:= (SALARIO_ATUAL / 100) * PERCENTUAL;SALARIO_NOVO:= SALARIO_ATUAL + REAJUSTE
	double salario, reajust, salarionovo;	
    int qntfunc,func, cod;
    
	System.out.println("Digite a quantidade de funcionários da empresa: ");
	qntfunc = entrada.nextInt();
	System.out.println("Total de funcionários: " +qntfunc);
	
	
	for(func = 1 ; func <= qntfunc; func++  ) {
		
		System.out.println("\nFuncionário número " +func);
		System.out.println("Digite o salário atual do funcionário");
		salario = entrada.nextDouble();
		System.out.println("Digite seu código: ");
		cod = entrada.nextInt();
		
		switch(cod) {
		
		case 1 :
		reajust = ((salario/100)*5);
		salarionovo = (salario + reajust );
		System.out.println("Seu salário antigo era de R$" +salario);
		System.out.println("O reajuste foi de 5% e aumentou seu salário para R$"+salarionovo);
		break;
		case 2 :
		reajust = ((salario/100)*15);
		salarionovo = (salario + reajust );
		System.out.println("Seu salário antigo era de R$" +salario);
		System.out.println("O reajuste foi de 15% e aumentou seu salário para R$"+salarionovo);
		break;
			
		case 3 :
		reajust = ((salario/100)*25);
		salarionovo = (salario + reajust );
		System.out.println("Seu salário antigo era de R$" +salario);
		System.out.println("O reajuste foi de 25% e aumentou seu salário para R$"+salarionovo);
		break;
			
		case 4 :
		reajust = ((salario/100)*30);
		salarionovo = (salario + reajust );
		System.out.println("Seu salário antigo era de R$" +salario);
		System.out.println("O reajuste foi de 30% e aumentou seu salário para R$"+salarionovo);
		break;
		
		
		
		
		
		}
		
		
		
	}
    
  }

}
