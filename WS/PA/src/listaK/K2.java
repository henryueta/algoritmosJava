package listaK;

import java.util.Scanner;

public class K2 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String resp="sim",sexo,op;
    double opqnt=0,total=0,cent1,cent2,masc=0,fem=0,femnao=0,mascsim=0;
    do {
    
    System.out.println("\nQual seu sexo?\nmasculino \nfeminino");
    sexo = entrada.next();
    total++;
    if(sexo.equalsIgnoreCase("Masculino")) {
    	masc++;
    }
    
    if(sexo.equalsIgnoreCase("Feminino")) {
    	fem++;
    }
    
    System.out.println("Você gostou do produto?\nSim \nNao");
    op = entrada.next();
    
    if(op.equalsIgnoreCase("sim")) {
    	opqnt++;
    }
  
    if(sexo.equals("feminino"))
		if(op.equals("nao")) {
			femnao++;
		}
	if(sexo.equals("masculino"))
		if(op.equals("sim")) {
			mascsim++;
		}
    
    
    System.out.println("Deseja realizar uma pesquisa?");
    resp = entrada.next();
    
    }while(resp.equalsIgnoreCase("sim"));
    
    
    cent1 = ((femnao / fem)* 100); 
	cent2 = ((mascsim / masc)* 100);
    System.out.println("\nRESUMO");
    System.out.println("Total de entrevistados: " +total);
    System.out.println("Pessoas que gostaram do produto: " +opqnt);
    System.out.println("Porcentagem de mulheres que responderam não: " +cent1+"%");
    System.out.println("Porcentagem de homens que responderam sim: " +cent2+"%");

    
	}

}
