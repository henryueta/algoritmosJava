package listaL;

import java.util.Random;
import java.util.Scanner;

public class Loteria {

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
        int escolha=0;
	    int i = 0;
		int j =1;
		for(linha = 0; linha <= 10; linha++ ) {
			for(coluna = 0; coluna <= 3; coluna++) {
				teste2 = teste2+1;
				teste3 = teste3+1;
				
				  //Random ger = new Random();ger.nextInt(22);
			   numeros [linha] [0] = teste2;
			   numeros [linha] [1] = teste2;
			   numeros [linha] [2] = teste2;
			   numeros [linha] [3] = teste2;
			   
			  
			  
				nums = nums + numeros [linha] [coluna] + " - " ;
				
			} 
			
			nums = nums + "\n";
		
		}
		
		
		
		
		
		System.out.println(nums);
		
		while( i < lugares.length) {
			boolean per = true;
		i++;
		System.out.println("Escolha um lugar"+i);
			escolha = sc.nextInt();
			lugares[i] = escolha;
		
		
		//nums2 = nums2 + lugares [i]+ "-";
		//System.out.println(nums2);
		
		for(j=1; j < i;j++) {
			
		if(lugares[i] == lugares[j]) {
			System.out.println("Número Repetido!");
			System.out.println(i);
			System.out.println(j);

			per = false;
			
		}
		
		
		
		}
		
		if(escolha < 1) {
			System.out.println("Este lugar não existe no Õnibus!");
			i--;
		}
		
		if(escolha > 44) {
			System.out.println("Este lugar não existe no Õnibus!");
			i--;
		}
		
		if(per == false) {
			i--;
		}
		}
		

		
	}

}