package PA;

import java.util.Scanner;

public class ON1 {
	
	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String mostrar="",nome,sexo;
    int cod=0,idade;
    int registro [] [] = new int [11] [4];
    int numeros [] [] = new int [11] [4];
    int linha, coluna;
    int teste2=0;
	int teste3=0;
	int teste4=0;
    
    System.out.println("SISTEMA PARA PASSAGENS");
    
    while(cod !=3) {
	System.out.println("\n1-VENDA\n2-RESUMO\n3-FINALIZAR");
	cod = entrada.nextInt();
    switch (cod){
	case 1:
		for(linha = 0; linha <= 10; linha++ ) {
			for(coluna = 0; coluna <= 3; coluna++) {
				teste2 = teste2+1;
				teste3 = teste3+1;
				
				  //Random ger = new Random();ger.nextInt(22);
			   numeros [linha] [0] = teste2;
			   numeros [linha] [1] = teste2;
			   numeros [linha] [2] = teste2+1;
			   numeros [linha] [3] = teste2-1;
			   
			  
			  
			   mostrar = mostrar + numeros [linha] [coluna] + " - " ;
				
			} 
			
			mostrar = mostrar + "\n";
		}	
	System.out.println(mostrar+"\nEscolha seu lugar: ");		
	
	
	
    System.out.println("Digite seu nome: ");
    nome = entrada.next();
    
    System.out.println("Digite seu sexo: ");
    sexo = entrada.next();
    
    System.out.println("Digite sua idade: ");
    idade = entrada.nextInt();
    break;
    
    
	case 2:
	System.out.println("");
    break;
	case 3:
		System.out.println("SISTEMA FINALIZADO");
	    break;
    
}
	
	
	
	
    }

		
	}

}
