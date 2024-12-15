package listaK;

public class K10 {

			public static void main(String[] args) {
			double soma1,soma2,impar,par;
			soma1 = 0;
			soma2 = 1;
			impar=0;
			do{
				impar++;
				if(impar%2 != 0){
					soma1 = soma1 + impar;
					}else{
				    soma2 = soma2 * impar;
				  }
			   }while(impar < 20);
			
			System.out.println("Em um conjunto de números de 1 a 20 temos que:");
			System.out.println("A soma de todos os números ímpares é " +soma1);
			System.out.println("O produto de todos os números pares é " +soma2);	  
			
			
		  }
		
	}


