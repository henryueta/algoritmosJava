package listaJ;

import java.util.Scanner;

public class J4 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int cod=0,sexmasc = 0,sexfem = 0;
    double med=0,eng=0,psi=0,adm=0,medfem=0,cent1=0,cent2=0,cent3=0,total=0;
    String sexpessoa,resp;
    resp = "sim";
    sexpessoa = "none";
    
    while(resp.equals("sim")) {  
    
    	
    System.out.println("\n Qual seu sexo?");
    sexpessoa = entrada.next();

    System.out.println("Digite o seu código: ");
    cod = entrada.nextInt();
    
    total++;
    	
     if(sexpessoa.equals("feminino")) {
    	sexfem++;
    }
    
     if(sexpessoa.equals("masculino")) {
    	 sexmasc++;
     }
    
     if(cod == 1) {
 	 System.out.println("Sua curso é Engenharia da Computação");
     }
 		if(sexpessoa.equals("masculino")) { 
 	     if(cod == 1) {
 			eng++;
 	}
     }
 
    	
    if(cod == 2) {
    	System.out.println("Sua curso é Administração");
    }	
	if(sexpessoa.equals("masculino")) { 
	     if(cod == 2) {
			adm++;
	}
    }
    
    if(cod == 3) {
    	System.out.println("Sua curso é Medicina");
        med++;
    }
    if(sexpessoa.equals("feminino")) { 
	     if(cod == 3) {
			medfem++;
	}
    }
    
    
    if(cod == 4) {
    	System.out.println("Sua curso é Psicologia");
    }
		if(sexpessoa.equals("feminino")) { 
	 	     if(cod == 4) {
	 			psi++;
	 	}
	     }
		
	System.out.println("Deseja continuar a pesquisa?\nSim\nNão");
	resp=entrada.next();
		
    
    }
    
    
    cent1 = ((medfem / sexfem)* 100); 
	cent2 = ((adm / sexmasc)* 100);
    cent3=((med/total) * 100);
	System.out.println("n/RESUMO");
    System.out.println("O total de homens que pretendem cursar Engenharia da Computação é " +eng);
    System.out.println("O total de mulheres que pretendem cursar Psicologia é " +psi);
    System.out.println("O percentual de mulheres que pretendem cursar Medicina é " +cent1+ "%");
    System.out.println("O percentual de homens que pretendem cursar Administração é " +cent2+ "%");
    System.out.println("O percentual de pessoas que pretendem cursar Medicina é " +cent3+ "%");

    
    
	}
    
    }
    
	


