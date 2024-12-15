package listaI;

import java.util.Scanner;

public class I7 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int qntaluno,idade,aluno,soma;
    double media;
    soma = 0;
    System.out.println("Digite a quantidade de alunos da sala: ");
    qntaluno = entrada.nextInt();
    
    for(aluno = 1 ; aluno <= qntaluno; aluno++ ) {
    	//System.out.println("");
    	System.out.println("\nAluno " +aluno);
    	System.out.println("Digite a idade do aluno");
    	idade = entrada.nextInt();
    	soma = (soma + idade);
    	
    }
    
    
    
    media = (soma / qntaluno);
    
    System.out.println("A media das idades dos alunos é " +media);
	}
	
}
