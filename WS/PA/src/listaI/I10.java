package listaI;

import java.util.Scanner;

public class I10 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int qntnum;
    double num,inicio,valor,min,max;
	min=0;
	max=0;
	valor=0;
    System.out.println("Programa para indicar o menor e o maior valor de um conjunto.");
    System.out.println("\nDigite a quantidade de números do conjunto: ");
    qntnum = entrada.nextInt();
   
    
    for(inicio = 1; inicio <= qntnum; inicio++) {
    	System.out.println("Digite o valor do " +inicio+ "º Número: ");
    	valor = entrada.nextDouble();
    	min = valor;	
    	if( valor > 0) {
    	 if(valor > max ) {
    	        max = valor;	
    	 }
    	 
    	 if(min == 0) {
    		min = valor; 
    	 }
    	 
    	    if(valor < min) {
    	    	min = valor;
    	    }
    	}
    	

    }
    
   
    System.out.println("\nO menor valor do conjunto é " +min);
    System.out.println("O maior valor do conjunto é " +max);


	}

}
