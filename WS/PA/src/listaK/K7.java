package listaK;

import java.util.Scanner;

public class K7 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
	String resp = "sim";	
    int vot1=0,vot2=0,voto;
	
	System.out.println("Os candidatos a cargo da CBF são Ricardo  Teixeira  e  Paulo  Falcão");
	
    do{
    System.out.println("\nEm quem você vai votar? \n1=Ricardo Teixeira \n2-Paulo Falcão");
    voto = entrada.nextInt();
    
    if(voto == 1) {
    vot1++;    	
    }
    			
    if(voto == 2) {
    vot2++;	
    }
    
    System.out.println("Deseja continuar com a votação?");
    resp = entrada.next();
    
    }while(resp.equalsIgnoreCase("sim"));
    
    System.out.println("\nRESULTADO");
    System.out.println("Total de votos para Ricardo Teixera: " +vot1);
    System.out.println("Total de votos para Paulo Falcão: " +vot2);
    
    
    if(vot1>vot2) {
    	System.out.println("O novo presidente será Ricardo Teixeira");
    }
    if(vot2>vot1) {
    	System.out.println("O novo presidente será Paulo Falcão");
    }
    
    if(vot1==vot2) {
    	System.out.println("EMPATE OCORRIDO!");
    	System.out.println("Uma nova eleição será realizada");
    }
    
    
	}

}
