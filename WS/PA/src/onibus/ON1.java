package onibus;

import java.util.Scanner;

public class ON1 {
	
	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String mostrar="",nome,sexo,mostrar2="";
    int cod=0,idade;
    int registro [] = new int[44];
    int guarda [] = new int[44];
    int numeros [] [] = new int [11] [4];
    int linha, coluna;
    int teste2=0;
	int teste3=0;
	int teste4=0;
	int escolha = -1,analise=-1,arma=-1;
    int i = 0;
    int teste=0;
    int a=0,b=0,c=0,k=0,d=0,f=0;
    boolean pergunta=false,repetiu=false,ativado=false;
    
    
    System.out.println("SISTEMA PARA PASSAGENS");
    
    for(int j=0; j<44;j++) {
    teste = teste+1;
    registro[j] = teste;
    }
    for(linha = 0; linha <= 10; linha++ ) {
		for(coluna = 0; coluna <= 3; coluna++) {
			teste = teste+1;
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
    
   
    
    while(cod !=3) {
	System.out.println("\n1-VENDA\n2-RESUMO\n3-FINALIZAR");
	cod = entrada.nextInt();
	
	
	
    switch (cod){
	case 1:
		String continuar="sim";
	     while(continuar.equalsIgnoreCase("sim")) {
	    k++;
    System.out.println("Digite seu nome: ");
    nome = entrada.next();
    
    System.out.println("Digite seu sexo: ");
    sexo = entrada.next();
    
    System.out.println("Digite sua idade: ");
    idade = entrada.nextInt();
 
    for(int u=0;u<registro.length;u++) {
    if(guarda[u] == analise) {
    	c=1;
    	System.out.println(1);
    	   if(c==1) {
    		   repetiu = true;
    	   }
    	
    	}
    if(guarda[u] != analise) {
    	c=0;
    	guarda[u] = analise;
    	System.out.println(d);
    	}
    
    }
	System.out.println("\nEscolha seu lugar: ");
	escolha = entrada.nextInt();
	analise = escolha;
	
	
	mostrar2= mostrar2 + guarda[k] + "-";
   for(i=0;i<registro.length;i++) {
    	b=a-1;
    	
    if(repetiu == false) {	
    	if(pergunta == false) {
    	if(analise == registro [i]) {
    		guarda[i] = arma;
    		pergunta = false;
	    	System.out.println("Lugar Escolhido");
	    	
	    }
    	if(analise != registro[i]) {
    		a++;
    		if(b==44) {
            pergunta = true;
    		}
    	}
    	
    	
    		
    	}
    }
   }
    	
   mostrar2 = mostrar2 +  "\n";
	System.out.println(mostrar2);


   if(pergunta == true) {
	   System.out.println("Este lugar não existe!Escolha novamente: ");
	   escolha = entrada.nextInt();
	   analise = escolha;
   }
   
   if(repetiu == true) {
	   System.out.println("Este lugar já está ocupado!Escolha Novamente: ");
	   escolha = entrada.nextInt();
	   analise = escolha;
   }
   
   
	 System.out.println("Deseja continuar com as vendas?");
	 continuar = entrada.next();
	 
	} 
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