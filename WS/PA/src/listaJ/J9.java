package listaJ;

import java.util.Scanner;

public class J9 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	String resp= "sim",curso;
	double cien=0,dir=0,let=0,total=0,cent;
	while(resp.equalsIgnoreCase("sim")) {
	
	System.out.println("Qual curso você prefere? \nCienciadaComputação  \nDireito  \nLetras");	
	curso = entrada.next();
	total++;
	
	if(curso.equalsIgnoreCase("CienciadaComputacao")) {
		cien++;
	  }
	
		if(curso.equalsIgnoreCase("Direito")) {
			dir++;
			}
		
			if(curso.equalsIgnoreCase("Letras")) {
				let++;
			}
	
	System.out.println("Deseja realizar outra pesquisa? \nsim \nnao");
	resp = entrada.next();
	}
	
	System.out.println("\nRESUMO");
	System.out.println("Total de entrevistados: " +total);
    System.out.println("Preferência para curso de Ciência da Computação: "+cien);
    if(cien == 0) {
    	System.out.println("0% do total dos entrevistados");
    }
    	if(cien > 0) {
    		cent=((cien/total)*100);
    		System.out.println(cent+ "% do total dos entrevistados");
    	}
    System.out.println("Preferência para curso de Direito: "+dir);
    if(dir == 0) {
    	System.out.println("0% do total dos entrevistados");
    }
    	if(dir > 0) {
    		cent=((dir/total)*100);
    		System.out.println(cent+ "% do total dos entrevistados");
    	}
    System.out.println("Preferência para curso de Letras: "+let);
    if(let == 0) {
    	System.out.println("0% do total dos entrevistados");
    }
    	if(let > 0) {
    		cent=((dir/total)*100);
    		System.out.println(cent+ "% do total dos entrevistados");
    	}
    System.out.println("\nRANKING");
    
    if(dir>cien) {
    	if(cien>let){
    	System.out.println("\n[1]Direito\n[2]Ciência da Computação\n[3]Letras");
        }
	    }
	    if(dir>let) {
	    	if(let>cien){
	    	System.out.println("\n[1]Direito\n[2]Letras\n[3]Ciência da Computação");
	        }
	    }
		    if(let>dir) {
		    	if(dir>cien){
		    	System.out.println("\n[1]Letras\n[2]Direito\n[3]Ciência da Computação");
		        }
		    }
			    if(let>cien) {
			    	if(cien>dir){
			    	System.out.println("\n[1]Letras\n[2]Ciência da Computação\n[3]Direito");
			        }
			    }
				    if(cien>let) {
				    	if(let>dir){
				    	System.out.println("\n[1]Ciência da Computação\n[2]Letras\n[3]Direito");
				        }
				    }
					    if(cien>dir) {
					    	if(dir>let){
					    	System.out.println("\n[1]Ciência da Computação\n[2]Direito\n[3]Letras");
					        }
					    }
    
						    if(cien==dir) {
						    	if(dir==let){
						    	System.out.println("\nEmpate!");
						        }
						    }
    
							    if(cien==dir) {
							    	if(dir>let){
							        System.out.println("\n[1]Ciência da Computação e Direito\n[2]Letras");
							        }
							    }
    
								    if(cien==let) {
								    	if(let>dir){
								        System.out.println("\n[1]Ciência da Computação e Letras\n[2]Direito");
								        }
								    }
    
									    if(dir==let) {
									    	if(let>cien){
									        System.out.println("\n[1]Direito e Letras\n[2]Ciência da Computação");
									        }
									     }
    
    	
	}

}
