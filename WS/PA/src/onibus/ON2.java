package onibus;

import java.util.Scanner;

public class ON2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numeros [] [] = new int [11] [4];
		int linha, coluna;
		int teste [] [] = new int [5] [6];
		int teste2=0;
		int teste3=0;
		int teste4=0;
		String nums = "";
		String nums2 = "";
		String nums3 = "";

		int lugares [] = new int [44];
		int lugares2 [] = new int [44];
        int escolha=-1;
        int analise = 0;
	    int i = 0;
		int j =0;
		int z = 0;
		int o =0;
		boolean per = true,cod;
		
		
		for(int total = 0;total < 44;total++) {
			teste4=teste4+1;
			lugares[total]=teste4;
			nums2 = nums2 + lugares [total]+ "-";
			
			
		}
		for(linha = 0; linha <= 10; linha++ ) {
			for(coluna = 0; coluna <= 3; coluna++) {
				teste2 = teste2+1;
				teste3 = teste3+1;
				
				  //Random ger = new Random();ger.nextInt(22);
			   numeros [linha] [0] = teste2;
			   numeros [linha] [1] = teste2;
			   numeros [linha] [2] = teste2+1;
			   numeros [linha] [3] = teste2-1;
			   
				
			  
			  
				nums = nums + numeros [linha] [coluna] + " - " ;
				
			} 
			
			nums = nums + "\n";
		
		}
		
		
		
		
		System.out.println(nums);
		
		while( i < lugares.length) {
			
		
		
		
		
		
		System.out.println("Escolha um lugar"+i);
		if(per == true) {
		escolha = sc.nextInt();
		lugares2[i]= escolha;
		System.out.println(lugares2[i]);
		System.out.println(j);
		System.out.println(per);
		nums3= nums3 + lugares2 [i] + " - " ;
		} 
		
		if(per == false) {
			
			System.out.println(per);
			System.out.println(i);
			System.out.println(j);
		}
		

		
		
		System.out.println(nums3);
		System.out.println(analise);
		for(j=0; j < i;j++) {
			
			
			if(lugares2[i] == lugares2[j]) {
				analise = sc.nextInt();
				System.out.println("AAAAAAA");
				per = false;
				}
				else {
					per = true;
				}
			
			
			}
		
		
	
		for( o = 0;o < lugares.length;o++) {
        if(lugares[o] == escolha) {
				
				}
        
        
			for( z=0;z<o;z++) {
			
			
			if(lugares[z] == lugares[o]) {
				System.out.println("ERRRO");
				}
		}
	 }
	
		
		if(per == true) {
			i++;
		}
    }
		

		
	}

}
