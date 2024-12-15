package listaD;

import java.util.Scanner;

public class D6 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int n1;
     
    System.out.println("Digite o valor do número: ");
    n1 = entrada.nextInt();
    
    if(n1 < 0) {
		System.out.println("Erro inesperado! Impossível de apresentar informações de números menores que 0!");
    }
    
    if(n1==0) {
    	System.out.println("O valor digitado é o número zero (0)");
    }
	
    if(n1==1) {
    	System.out.println("O valor digitado é o número um (1)");
    }
	
    if(n1==2) {
		System.out.println("O valor digitado é o número dois (2)");
	}
	
	if(n1==3) {
		System.out.println("O valor digitado é o número três (3)");
	}
	
	if(n1==4) {
		System.out.println("O valor digitado é o número quatro (4)");
	}
	
	if(n1==5) {
		System.out.println("O valor digitado é o número cinco (5)");
	}
	
	if(n1==6) {
		System.out.println("O valor digitado é o número seis (6)");
	}
	
	if(n1==7) {
		System.out.println("O valor digitado é o número sete (7)");
	}
	
	if(n1==8) {
		System.out.println("O valor digitado é o número oito (8)");
	}

	if(n1==9) {
		System.out.println("O valor digitado é o número nove (9)");
	}
	
	if(n1==10) {
		System.out.println("O valor digitado é o número dez (10)");
	}
	
	if(n1 > 10) {
		System.out.println("Erro inesperado! Impossível de apresentar informações de números maiores que 10!");
	}
	
	
	
  }
}