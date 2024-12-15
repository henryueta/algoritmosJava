package listaI;

import java.util.Scanner;

public class I6 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int qntalunos,alunos, aprovado;
    double media;
    aprovado = 0;
		qntalunos = 20;
    
    for(alunos = 1; alunos <= qntalunos; alunos++) {
    	System.out.println("Digite o valor da média do " +alunos+ "º aluno:");
    	media = entrada.nextDouble();
    	if(media >= 6) {
    		aprovado++;
    	}
    	
    }
	
System.out.println("\nNo total " +aprovado+ " alunos foram aprovados!" );
    	
    	
    	
    	
	}
}
