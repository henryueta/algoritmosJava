package PA;

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
		int lugares [] = new int [44];
        int escolha=-1;
	    int i = 0;
		int j =1;
		boolean per = true;
		
		
		for(int total = 0;total < 44;total++) {
			teste4=teste4+1;
			lugares[total]=teste4;
			nums2 = nums2 + lugares [total]+ "-";
			System.out.println(nums2);
			
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
			
			
		i++;
		
		System.out.println("Escolha um lugar"+i);
		escolha = sc.nextInt();
		for(int o = 0;o < 44;o++) {
			for(int z=0;z<o;z++) {
			if(lugares[o] == escolha) {
				if(lugares[z] != lugares[o]) {
				System.out.println("Lugar Escolhido");
				}
			}
			if(lugares[z] == lugares[o]) {
				System.out.println("ERRRO");
				}
		}
		}
		
	
		
		
		
		
		
		for(j=0; j < i-1;j++) {
			
		if(lugares[j] == lugares[i]) {
			System.out.println("j"+j);
			System.out.println("i"+i);
			per = false;
		}
		
		else {
			
		}
		
		
		
		
		
		
		
		
		
		}
		
		if(escolha < 1) {
			System.out.println("Este lugar n�o existe no �nibus!");
			i--;
		}
		
		if(escolha > 44) {
			System.out.println("Este lugar n�o existe no �nibus!");
			i--;
		}
		
		if(per == false) {
			i--;
		}
		}
		

		
	}

}

