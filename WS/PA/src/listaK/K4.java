package listaK;

import java.util.Scanner; 

public class K4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resp = "sim", sexo, respPesq;
		int resSim = 0, resNao = 0;
		double perc1, perc2, fem = 0, masc = 0, femSim = 0, mascNao = 0;
		
		do {
			System.out.println("\nQual o seu sexo?");
			sexo = sc.next();
			System.out.println("Você gostou do novo produto?\nsim\nnão");
			respPesq = sc.next();
			
			if(respPesq.equals("sim")) {
				resSim++;
			} else if(respPesq.equals("não")) {
				resNao++;
			}
			
			if(sexo.equals("feminino")) {
				fem++;
			} else if(sexo.equals("masculino")){
				masc++;
			}
			
			
			if(sexo.equals("feminino"))
				if(respPesq.equals("sim")) {
					femSim++;
				}
			if(sexo.equals("masculino"))
				if(respPesq.equals("não")) {
					mascNao++;
				}
			System.out.println("Você deseja continuar com a pesquisa?\nsim\nnão");
			resp = sc.next();
		}while(resp.equalsIgnoreCase("sim"));
		
		
		
		
		perc1 = ((femSim / fem)* 100); 
		perc2 = ((mascNao / masc)* 100);
		System.out.println("O número de mulheres que responderam sim é: " + femSim);
		System.out.println("O número de homens que responderam não é:" + mascNao);
		System.out.println("O percentual de pessoas do sexo feminino que disse sim é de: " + perc1+ "%");
		System.out.println("O percentual de pessoas do sexo masculino que disse não é de: " + perc2+ "%");
	}

}

