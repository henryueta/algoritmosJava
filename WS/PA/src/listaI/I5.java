package listaI;

import java.util.Scanner;

public class I5 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int qntalunos, alunos;
    double media,n1,n2,n3,n4;
	qntalunos = 10;
    System.out.println("Programa para ler a nota de 10 alunos e calcular a média de notas por aluno");
    
    for(alunos=1; alunos <= qntalunos; alunos++) {
    	
    	System.out.println(" \n Aluno número " +alunos);
    	System.out.println("Digite o valor da primeira nota do aluno: ");
    	n1 = entrada.nextDouble();
    	System.out.println("Digite o valor da segunda nota do aluno: ");
    	n2 = entrada.nextDouble();
    	System.out.println("Digite o valor da terceira nota do aluno: ");
    	n3 = entrada.nextDouble();
    	System.out.println("Digite o valor da quarta nota do aluno: ");
    	n4 = entrada.nextDouble();
    	
    	media=((n1+n2+n3+n4)/4);
    	
    	System.out.println("A media do aluno será: " +media);
    	
    	
    }
    
    
		
	}

}
