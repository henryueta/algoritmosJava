package listaJ;

import java.util.Scanner;

public class J6 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String resp,sexo,regiao;
    int idade;
    double quant=0, masc=0 , fem=0 , 
    centrom=0 , lestem=0 , oestem=0 , nortem=0 , sulm=0 , 
    centrof=0 , lestef=0, oestef=0 , nortef=0 , sulf=0,
    nulo=0,menorleste =0, maiorsul = 0, cent;
    
    
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
    	
    	//REGIAO-------------------------------------------------------------------------------------------------------------
    	
    	System.out.println("Em qual região você mora?\nCentro \nLeste\nOeste\nNorte\nSul");
    	regiao = entrada.next();
    	quant++;
        
    	//CENTRO
    	if(regiao.equalsIgnoreCase("centro")) {
    		
    		if(sexo.equalsIgnoreCase("masculino")) {
        		centrom++;	
        	}  		
    			if(sexo.equalsIgnoreCase("feminino")) {
    				centrof++;
    			}    		    		
    	}
    	//CENTRO
    	//LESTE
        if(regiao.equalsIgnoreCase("leste")) {
    		
    		if(sexo.equalsIgnoreCase("masculino")) {
        		lestem++;
        				if(idade<18) {
        					menorleste++;
        				}
        	}  		
    		   	if(sexo.equalsIgnoreCase("feminino")) {
        		lestef++;
        	   }	
    	}
    	//LESTE
        //OESTE
        if(regiao.equalsIgnoreCase("oeste")) {
    		
    		if(sexo.equalsIgnoreCase("masculino")) {
        		oestem++;	
        	}  		
    		   if(sexo.equalsIgnoreCase("feminino")) {
        		  oestef++;
        	   }    		    		
    	}
    	//OESTE
        //NORTE
        if(regiao.equalsIgnoreCase("norte")) {
    		
    		if(sexo.equalsIgnoreCase("masculino")) {
        		nortem++;	
        	}  		
    		   if(sexo.equalsIgnoreCase("feminino")) {
        		  nortef++;
        	   }    		    		
    	}
    	//NORTE
        //SUL
        if(regiao.equalsIgnoreCase("sul")) {
    		
    		if(sexo.equalsIgnoreCase("masculino")) {
        		sulm++;	
        	}  		
    		   if(sexo.equalsIgnoreCase("feminino")) {
        		  sulf++;
        		  		if(idade>18) {
        		  			maiorsul++;
        		  		}  		    		
    	       }
        }
        //SUL
        //NADA
        if(regiao.equals("")) {
        	nulo++;
        }
        //NADA
        
        
    	System.out.println("Cadastro feito!");
    	System.out.println("Deseja realizar outro cadastro?\nSim\nNao");
    	resp= entrada.next();
    	
      }
 
    //RESUMO-----------------------------------------------------------------------------------------------------------------
      
     System.out.println("\nRESUMO DA PESQUISA");
     System.out.println("Total de pessoas que moram em São Paulo: " +quant);
     
     
     
     //PORCENTAGEM DE PESSOAS
     
     //HOMENS
     System.out.println("\nTOTAL DE HOMENS: "+masc);
     if(centrom <= 0) {
     	 System.out.println("0% dos homens moram na região Central");
     } 
        if(centrom > 0) {
        	cent=((centrom/masc)*100);
        	System.out.println(cent+"% dos homens moram na região Central");
        }
        if(lestem <= 0) {
        	 System.out.println("0% dos homens moram na região Leste");
        } 
           if(lestem > 0) {
           	cent=((lestem/masc)*100);
           	System.out.println(cent+"% dos homens moram na região Leste");
           }
        	System.out.println("("+menorleste+" homens menores de idade residem na região Leste)");
           if(oestem <= 0) {
          	 System.out.println("0% dos homens moram na região Oeste");
          } 
             if(oestem > 0) {
             	cent=((oestem/masc)*100);
             	System.out.println(cent+"% dos homens moram na região Oeste");
             }
             if(nortem <= 0) {
              	 System.out.println("0% dos homens moram na região Norte");
              } 
                 if(nortem > 0) {
                 	cent=((nortem/masc)*100);
                 	System.out.println(cent+"% dos homens moram na região Norte");
                 }
                 if(sulm <= 0) {
                  	 System.out.println("0% dos homens moram na região Sul");
                  } 
                     if(sulm > 0) {
                     	cent=((sulm/masc)*100);
                     	System.out.println(cent+"% dos homens moram na região Sul");
                     }
        
        
     //MULHERES 
     System.out.println("\nTOTAL DE MULHERES: "+fem);
     if(centrof <= 0) {
        System.out.println("0% das mulheres moram na região Central");
     }    
              
     	if(centrof > 0 ) {
     		cent=((centrof/fem)*100);
     		System.out.println(cent+"% das mulheres moram na região Central");
     	}
     	 if(lestef <= 0) {
        	 System.out.println("0% das mulheres moram na região Leste");
        } 
           if(lestef > 0) {
           	cent=((lestef/masc)*100);
           	System.out.println(cent+"% das mulheres moram na região Leste");
           }
           if(oestef <= 0) {
          	 System.out.println("0% das mulheres moram na região Oeste");
          } 
             if(oestef > 0) {
             	cent=((oestef/masc)*100);
             	System.out.println(cent+"% das mulheres moram na região Oeste");
             }
             if(nortef <= 0) {
              	 System.out.println("0% das mulheres moram na região Norte");
              } 
                 if(nortef > 0) {
                 	cent=((nortef/masc)*100);
                 	System.out.println(cent+"% das mulheres moram na região Norte");
                 }
                 if(sulf <= 0) {
                  	 System.out.println("0% das mulheres moram na região Sul");
                  } 
                     if(sulf > 0) {
                     	cent=((sulf/masc)*100);
                     	System.out.println(cent+"% das mulheres moram na região Sul");
                     }
                     	if(maiorsul <= 0) {
                     		System.out.println("Nenhuma mulher maior de idade reside na região Sul");
                     	}
                     		if(maiorsul > 0) {
                    	        cent = ((maiorsul / fem)*100);
                     			System.out.println("("+cent+"% das mulheres maiores de idade residem na região Sul)");
                     		}
                     
     	
	}

}
