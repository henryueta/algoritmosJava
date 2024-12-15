package listaK;

import java.util.Scanner;

public class K9 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String resp = "sim", respPesq;
			double fer = 0, porsh = 0, merc = 0, rep = 0, perc1, perc2, perc3;
			
			while(resp.equalsIgnoreCase("sim")) {
				System.out.println("Qual desses automóveis você prefere? \nFerrari \nMercedes \nPorsh");
				respPesq = sc.next();
				
				if(respPesq.equalsIgnoreCase("Ferrari")) {
					fer++;
				} else if(respPesq.equalsIgnoreCase("Porsh")) {
					porsh++;
				} else if(respPesq.equalsIgnoreCase("Mercedes")) {
					merc++;
				}
				
				rep++;
				System.out.println("Deseja adicionar uma nova resposta? \nSim \nNão");
				resp = sc.next();
				System.out.println("");
				
			}
			
			perc1 = ((fer / rep)* 100);
			perc2 = ((porsh / rep)* 100);
			perc3 = ((merc / rep)* 100);
			System.out.println("A votação foi concluída com um total de " + rep + " votos!");
			
			if(fer > merc){
				if(merc > porsh)
					System.out.println("Em 1º lugar ficou o Ferrari \n2º lugar Mercedes \n3º lugar Porsh");
			}
			
			if(fer > porsh){
				if(porsh > merc)
					System.out.println("Em 1º lugar ficou o Ferrari \n2º lugar Porsh \n3º lugar Mercedes");
			}
			
			
			if(merc > fer){
				if(fer > porsh)
					System.out.println("Em 1º lugar ficou o Mercedes \n2º lugar Ferrari \n3º lugar Porsh");
			}
			
			if(merc > porsh){
				if(porsh > fer)
					System.out.println("Em 1º lugar ficou o Mercedes \n2º lugar Porsh \n3º lugar Ferrari");
			}
			
			if(porsh > fer){
				if(fer > merc)
					System.out.println("Em 1º lugar ficou o Porsh \n2º lugar Ferrari \n3º lugar Mercedes");
			}
			
			if(porsh > merc){
				if(merc > fer)
					System.out.println("Em 1º lugar ficou o Porsh \n2º lugar Mercedes \n3º lugar Ferrari");
			}
			
			if(fer == merc){
				if(merc == porsh)
					System.out.println("Os três carros empataram!!!");
			} 
			
			if(fer == merc){
				if(merc > porsh)
					System.out.println("Em 1º lugar ficou o Ferrari e Mercedes empatados \n2º e em 2º lugar Porsh");
			}
			
			if(fer == porsh){
				if(porsh > merc)
					System.out.println("Em 1º lugar ficou o Ferrari e Porsh empatados \\n2º e em 2º lugar Mercedes");
			}
			
			if(merc == porsh){
				if(porsh > fer)
					System.out.println("Em 1º lugar ficou o Mercedes e Porsh empatados \\n2º e em 2º lugar Ferrari");
			}
			
			if(fer == porsh){
				if(porsh > merc)
					System.out.println("Em 1º lugar ficou o Ferrari e Porsh empatados \\n2º e em 2º lugar Mercedes");
			}
			
			System.out.println("Ferrari com " + perc1 + "% dos votos.");
			System.out.println("Porsh com " + perc2 + "% dos votos.");
			System.out.println("Mercedes com " + perc3 + "% dos votos.");
		}

	}
