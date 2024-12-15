package listaJ;

import java.util.Scanner;

public class J8 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String resp ="sim";
    
    double voto1=0,voto2=0,total=0,cent,vot;
    
    while(resp.equalsIgnoreCase("sim")) {
    	
 	System.out.println("\nQuem você decide votar? \n(1)Fujiro NaKombi \n(2)Takaro Né");
    	vot=entrada.nextInt();
    	
    	total++;   	
    	
    	if(vot==1) {
    		voto1++;
    	}
          if(vot==2) {
    		voto2++;
    	   }
           
           System.out.println("Deseja realizar a votação? \nsim \nnao");
           resp = entrada.next();
      }
	
	
    if(voto2 != voto1) {
	System.out.println("\nVotação para Fujiro NaKombi: " +voto1);
		if(voto1>0) {
			cent = ((voto1/total)*100);
			System.out.println(cent+"% do total de votos");
		}
		if(voto1==0) {
			cent = ((voto1/total)*100);
			System.out.println("0% do total de votos");
		}
			System.out.println("Votação para Takaro Né: " +voto2);
				if(voto2>0) {
					cent = ((voto2/total)*100);
					System.out.println(cent+"% do total de votos");
				}
				if(voto2==0) {
					cent = ((voto2/total)*100);
					System.out.println("0% do total de votos");
				}
					System.out.println("\nRESULTADO FINAL");
	
						if(voto1>voto2) {
							System.out.println("O novo gerente é Fujiro NaKombi!");
						}
							if(voto2>voto1) {
								System.out.println("O novo gerente é Takaro Né!");
							}
		}
	
	
	if(voto2==voto1) {
		System.out.println("EMPATE NOS VOTOS!");
		System.out.println("O desempate será realizado");
		resp = "sim";
	}
	
	 while(resp.equalsIgnoreCase("sim")) {
	    	
		 	System.out.println("\nQuem você decide votar? \n(1)Fujiro NaKombi \n(2)Takaro Né");
		    	vot=entrada.nextInt();
		    	
		    	total++;   	
		    	
		    	if(vot==1) {
		    		voto1++;
		    	}
		          if(vot==2) {
		    		voto2++;
		    	   }
		           
		           System.out.println("Deseja realizar a votação? \nsim \nnao");
		           resp = entrada.next();
		      }
	
	}

}
