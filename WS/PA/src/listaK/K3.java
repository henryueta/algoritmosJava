package listaK;

import java.util.Scanner;

public class K3 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int cod=0,sexmasc = 0,sexfem = 0;
    double med=0,eng=0,psi=0,adm=0,medfem=0,cent2=0,cent3=0,total=0;
    String sexpessoa,resp;
    resp = "sim";
    sexpessoa = "none";
    
    do{  
    
    	
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
 	 System.out.println("Seu curso é Engenharia da Computação");
     }
 		if(sexpessoa.equals("masculino")) { 
 	     if(cod == 1) {
 			eng++;
 	}
     }
 
    	
    if(cod == 2) {
    	System.out.println("Seu curso é Administração");
    }	
	if(sexpessoa.equals("feminino")) { 
	     if(cod == 2) {
	    	 adm++;
	}
    }
    
    if(cod == 3) {
    	System.out.println("Seu curso é Medicina");
        med++;
    }
    if(sexpessoa.equals("feminino")) { 
	     if(cod == 3) {
			medfem++;
	}
    }
    
    
    if(cod == 4) {
    	System.out.println("Seu curso é Psicologia");
    }
		if(sexpessoa.equals("feminino")) { 
	 	     if(cod == 4) {
	 			psi++;
	 	}
	     }
		
	System.out.println("Deseja continuar a pesquisa?\nSim\nNão");
	resp=entrada.next();
		
    
    }while(resp.equalsIgnoreCase("sim"));
    
    

	cent2 = ((eng / sexmasc)* 100);
    cent3=((psi/total) * 100);
	System.out.println("n/RESUMO");
    System.out.println("O total de mulheres que pretendem cursar Administração é " +adm);
    System.out.println("O total de pessoas que pretendem cursar Medicina é " +med);
    System.out.println("O percentual de homens que pretendem cursar Engenharia da Computação é " +cent2+ "%");
    System.out.println("O percentual de pessoas que pretendem cursar Psicologia é " +cent3+ "%");

    
    
	}
    
    
    
    
		
	}


