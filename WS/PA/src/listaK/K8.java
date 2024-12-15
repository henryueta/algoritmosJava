package listaK;

import java.util.Scanner;

public class K8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String resp= "sim",curso;
		double med=0,psi=0,eng=0,total=0,cent;
		while(resp.equalsIgnoreCase("sim")) {
		
		System.out.println("Qual curso você prefere? \nMedicina  \nPsicologia   \nEngenhariaElétrica");	
		curso = entrada.next();
		total++;
		
		if(curso.equalsIgnoreCase("Medicina")) {
			med++;
		  }
		
			if(curso.equalsIgnoreCase("Psicologia")) {
				psi++;
				}
			
				if(curso.equalsIgnoreCase("EngenhariaElétrica")) {
					eng++;
				}
		
		System.out.println("Deseja realizar outra pesquisa? \nsim \nnao");
		resp = entrada.next();
		}
		
		System.out.println("\nRESUMO");
		System.out.println("Total de entrevistados: " +total);
	    System.out.println("Preferência para curso de Medicina: "+med);
	    if(med == 0) {
	    	System.out.println("0% do total dos entrevistados");
	    }
	    	if(med > 0) {
	    		cent=((med/total)*100);
	    		System.out.println(cent+ "% do total dos entrevistados");
	    	}
	    System.out.println("Preferência para curso de Psicologia: "+psi);
	    if(psi == 0) {
	    	System.out.println("0% do total dos entrevistados");
	    }
	    	if(psi > 0) {
	    		cent=((psi/total)*100);
	    		System.out.println(cent+ "% do total dos entrevistados");
	    	}
	    System.out.println("Preferência para curso de EngenhariaElétrica: "+eng);
	    if(eng == 0) {
	    	System.out.println("0% do total dos entrevistados");
	    }
	    	if(eng > 0) {
	    		cent=((eng/total)*100);
	    		System.out.println(cent+ "% do total dos entrevistados");
	    	}
	    System.out.println("\nRANKING");
	    
	    if(psi>med) {
	    	if(med>eng){
	    	System.out.println("\n[1]Psicologia\n[2]Medicinao\n[3]EngenhariaElétrica");
	        }
		    }
		    if(psi>eng) {
		    	if(eng>med){
		    	System.out.println("\n[1]Psicologia\n[2]EngenhariaElétrica\n[3]Medicina");
		        }
		    }
			    if(eng>psi) {
			    	if(psi>med){
			    	System.out.println("\n[1]EngenhariaElétrica\n[2]Psicologia\n[3]Medicina");
			        }
			    }
				    if(eng>med) {
				    	if(med>psi){
				    	System.out.println("\n[1]EngenhariaElétrica\n[2]Medicina\n[3]Psicologia");
				        }
				    }
					    if(med>eng) {
					    	if(eng>psi){
					    	System.out.println("\n[1]Medicina\n[2]EngenhariaElétrica\n[3]Psicologia");
					        }
					    }
						    if(med>psi) {
						    	if(psi>eng){
						    	System.out.println("\n[1]Medicina\n[2]Psicologia\n[3]EngenhariaElétrica");
						        }
						    }
	    
							    if(med==psi) {
							    	if(psi==eng){
							    	System.out.println("\nEmpate!");
							        }
							    }
	    
								    if(med==psi) {
								    	if(psi>eng){
								        System.out.println("\n[1]Medicina e Psicologia\n[2]EngenhariaElétrica");
								        }
								    }
	    
									    if(med==eng) {
									    	if(eng>psi){
									        System.out.println("\n[1]Medicina e EngenhariaElétrica\n[2]Psicologia");
									        }
									    }
	    
										    if(psi==eng) {
										    	if(eng>med){
										        System.out.println("\n[1]Psicologia e EngenhariaElétrica\n[2]Medicina");
										        }
										     }
	    
	    	
		}

	}
