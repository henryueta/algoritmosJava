package listaI;

import java.util.Scanner;

public class I9 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int qntpessoas,pessoas,mat,anel;
    String filme;
    mat=0;
    anel=0;
    qntpessoas = 20;
    System.out.println("20 pessoas selecionadas para a pesquisa de filmes");

    for(pessoas = 1; pessoas <= qntpessoas; pessoas++  ) {
    	System.out.println("\nPessoa número " +pessoas);
    	System.out.println("Qual a prefência de filmes? Matrix ou SenhordosAnéis?");
    	filme = entrada.next();
    	
    	switch(filme) {
    	
    	case "Matrix":
    		mat++;
    		System.out.println("Preferência para filme Matrix");
    		
    	break;
    	
    	case "SenhordosAnéis":
    		System.out.println("Preferência para filme Senhor dos Anéis");
    		
    		anel++;
    	break;
    	
    	}
    	
    }
    
    
    System.out.println("\nRESULTADO FINAL");
		
    if(mat > anel) {
    	System.out.println("A saga Matrix foi a mais votada!");
    	System.out.println("Total de votos para Matrix: " +mat);
    	System.out.println("Total de votos para Senhor dos Anéis: " +anel);

    }
    
    if(anel > mat) {
    	System.out.println("A saga Senhor dos Anéis foi a mais votada!");
    	System.out.println("Total de votos para Senhor dos Anéis: " +anel);
    	System.out.println("Total de votos para Matrix: " +mat);

    }
       
    
		
	}

}
