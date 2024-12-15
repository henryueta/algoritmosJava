package listaI;

import java.util.Scanner;

public class I15 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double base,expo,rep,reserv;
	
	
	System.out.println("Digite o valor do expoente para o calculo: ");
	expo = entrada.nextDouble();
    System.out.println("Digite o valor do base para o calculo: ");
	base = entrada.nextDouble();
    rep = base;
    reserv=expo;
	for(expo = expo; 2 <= expo; expo--){
	rep = (rep * base);	     	        
    }
	
	System.out.println("O número " +base+ " elevado a " +reserv+ " é igual a " +rep);
  }
	
}
