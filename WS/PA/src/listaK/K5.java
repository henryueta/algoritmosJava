package listaK;

import java.util.Scanner;

public class K5 {

	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    String resp,sexo,regiao;
	    int idade;
	    double quant=0, masc=0 , fem=0 , 
	    centrom=0 , lestem=0 , oestem=0 , nortem=0 , sulm=0 , 
	    centrof=0 , lestef=0, oestef=0 , nortef=0 , sulf=0,
	    nulo=0,menorNorte =0, maiorOeste = 0, cent;
	    
	    
	    resp="sim";
	    while(resp.equalsIgnoreCase("sim")) {
	    	
	    	System.out.println("Digite a sua idade: ");
	    	idade = entrada.nextInt();
	    	
	    	System.out.println("Qual seu sexo?\nmasculino\nfeminino");
	    	sexo = entrada.next();
	    	
	    	if(sexo.equalsIgnoreCase("masculino")) {
	    		masc++;	
	    	}
	    	
	    	if(sexo.equalsIgnoreCase("feminino")) {
	    		fem++;
	    	}
	    	
	    	
	    	System.out.println("Em qual região você mora?\nCentro \nLeste\nOeste\nNorte\nSul");
	    	regiao = entrada.next();
	    	quant++;
	        
	    	if(regiao.equalsIgnoreCase("centro")) {
	    		
	    		if(sexo.equalsIgnoreCase("masculino")) {
	        		centrom++;	
	        	}  		
	    			if(sexo.equalsIgnoreCase("feminino")) {
	    				centrof++;
	    			}    		    		
	    	}
	        if(regiao.equalsIgnoreCase("leste")) {
	    		
	    		if(sexo.equalsIgnoreCase("masculino")) {
	        		lestem++;
	        	}  		
	    		   	if(sexo.equalsIgnoreCase("feminino")) {
	        		lestef++;
	        	   }	
	    	}
	        if(regiao.equalsIgnoreCase("oeste")) {
	    		
	    		if(sexo.equalsIgnoreCase("masculino")) {
	        		oestem++;	
	        	}  		
	    		   if(sexo.equalsIgnoreCase("feminino")) {
	        		  oestef++;
      		  		if(idade>18) {
    		  			maiorOeste++;
    		  		}  	
	        	   }    		    		
	    	}
	        if(regiao.equalsIgnoreCase("norte")) {
	    		
	    		if(sexo.equalsIgnoreCase("masculino")) {
	        		nortem++;
	        		if(idade<18) {
    					menorNorte++;
    				}
	        	}  		
	    		   if(sexo.equalsIgnoreCase("feminino")) {
	        		  nortef++;
	        	   }    		    		
	    	}
	    
	        if(regiao.equalsIgnoreCase("sul")) {
	    		
	    		if(sexo.equalsIgnoreCase("masculino")) {
	        		sulm++;	
	        	}  		
	    		   if(sexo.equalsIgnoreCase("feminino")) {
	        		  sulf++;	    		
	    	       }
	        }
	        if(regiao.equals("")) {
	        	nulo++;
	        }
	        
	        
	    	System.out.println("Cadastro feito!");
	    	System.out.println("Deseja realizar outro cadastro?\nSim\nNao");
	    	resp= entrada.next();
	    	
	      }
	 
	      
	     System.out.println("\nRESUMO DA PESQUISA");
	     System.out.println("Total de pessoas que moram em São Paulo: " +quant);
	     
	     
	     
	     
	     
	     System.out.println("\nTOTAL DE HOMENS: "+masc);
	     if(centrom <= 0) {
	     	 System.out.println("Nenhum homem reside na região Central");
	     } 
	        if(centrom > 0) {
	        	System.out.println(centrom+ " homens residem na região Central");
	        }
	        if(lestem <= 0) {
		     	 System.out.println("Nenhum homem reside na região Leste");
	        } 
	           if(lestem > 0) {
	           	System.out.println(lestem+" homens residem na região Leste");
	           }
	  	           
	             if(nortem <= 0) {
			     	 System.out.println("Nenhum homem reside na região Norte");
	              } 
	                 if(nortem > 0) {
	                 	System.out.print(nortem+" homens moram na região Norte");
	                 }
	                  if(menorNorte > 0) {
		                 	System.out.println("(("+menorNorte+" são menores de idade))");
	                  }
    
	     System.out.println("\nTOTAL DE MULHERES: "+fem);
         
	           if(centrof <= 0) {
	   	        System.out.println("0% das mulheres moram na região Central");
	   	     }    
	   	              
	   	     	if(centrof > 0 ) {
	   	     		cent=((centrof/fem)*100);
	   	     		System.out.println(cent+"% das mulheres moram na região Central");
	   	     	}
	   	     	
	   	     	
	           if(oestef <= 0) {
	          	 System.out.println("0% das mulheres moram na região Oeste");
	          } 
	             if(oestef > 0) {
	             	cent=((oestef/fem)*100);
	             	System.out.print(cent+"% das mulheres moram na região Oeste");
	             }
	             	if(maiorOeste > 0) {
		             	cent=((maiorOeste/fem)*100);
	                 	System.out.println("(("+cent+"% são menores de idade))");
	             	}

	             
	             if(nortef <= 0) {
	              	 System.out.println("0% das mulheres moram na região Norte");
	              } 
	                 if(nortef > 0) {
	                 	cent=((nortef/fem)*100);
	                 	System.out.println(cent+"% das mulheres moram na região Norte");
	                 }
	                 if(sulf <= 0) {
	                  	 System.out.println("0% das mulheres moram na região Sul");
	                  } 
	                     if(sulf > 0) {
	                     	cent=((sulf/fem)*100);
	                     	System.out.println(cent+"% das mulheres moram na região Sul");
	                     }
	                     
	     	
		}

	}