package listaJ;

import java.util.Scanner;

public class J10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resp = "sim", respPesq;
		double gol = 0, palio = 0, corsa = 0, rep = 0, perc1, perc2, perc3;
		
		while(resp.equalsIgnoreCase("sim")) {
			System.out.println("Qual desses automóveis você prefere? \nCorsa \nPalio \nGol");
			respPesq = sc.next();
			
			if(respPesq.equalsIgnoreCase("corsa")) {
				corsa++;
			} else if(respPesq.equalsIgnoreCase("gol")) {
				gol++;
			} else if(respPesq.equalsIgnoreCase("palio")) {
				palio++;
			}
			
			rep++;
			System.out.println("Deseja adicionar uma nova resposta? \nSim \nNão");
			resp = sc.next();
			System.out.println("");
			
		}
		
		perc1 = ((corsa / rep)* 100);
		perc2 = ((palio / rep)* 100);
		perc3 = ((gol / rep)* 100);
		System.out.println("A votação foi concluída com um total de " + rep + " votos!");
		
		if(corsa > palio){
			if(palio > gol)
				System.out.println("Em 1º lugar ficou o Corsa \n2º lugar Palio \n3º lugar Gol");
		}
		
		if(corsa > gol){
			if(gol > palio)
				System.out.println("Em 1º lugar ficou o Corsa \n2º lugar Gol \n3º lugar Palio");
		}
		
		
		if(palio > corsa){
			if(corsa > gol)
				System.out.println("Em 1º lugar ficou o Palio \n2º lugar Corsa \n3º lugar Gol");
		}
		
		if(palio > gol){
			if(gol > corsa)
				System.out.println("Em 1º lugar ficou o Palio \n2º lugar Gol \n3º lugar Corsa");
		}
		
		if(gol > corsa){
			if(corsa > palio)
				System.out.println("Em 1º lugar ficou o Gol \n2º lugar Corsa \n3º lugar Palio");
		}
		
		if(gol > palio){
			if(palio > corsa)
				System.out.println("Em 1º lugar ficou o Gol \n2º lugar Palio \n3º lugar Corsa");
		}
		
		if(corsa == palio){
			if(palio == gol)
				System.out.println("Os três carros empataram!!!");
		} 
		
		if(corsa == palio){
			if(palio > gol)
				System.out.println("Em 1º lugar ficou o Corsa e Palio empatados \n2º e em 2º lugar Gol");
		}
		
		if(corsa == gol){
			if(gol > palio)
				System.out.println("Em 1º lugar ficou o Corsa e gol empatados \\n2º e em 2º lugar palio");
		}
		
		if(palio == gol){
			if(gol > corsa)
				System.out.println("Em 1º lugar ficou o Palio e Gol empatados \\n2º e em 2º lugar Corsa");
		}
		
		if(corsa == gol){
			if(gol > palio)
				System.out.println("Em 1º lugar ficou o Corsa e gol empatados \\n2º e em 2º lugar palio");
		}
		
		System.out.println("Corsa com " + perc1 + "% dos votos.");
		System.out.println("Palio com " + perc2 + "% dos votos.");
		System.out.println("Gol com " + perc3 + "% dos votos.");
	}

}
