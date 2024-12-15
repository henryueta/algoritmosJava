package listaF;

import java.util.Scanner;

public class F9 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
	int numero,d1,d2,d3;
 
	System.out.println("Digite o valor do número: ");
    numero = entrada.nextInt();
    d1=(numero % 4);	
    d2=(numero % 5);
    d3 =(d1 = d2);
    
     if(d3 == 0){
    	System.out.println("Este número é divisível por 4 e 5!");    	
    } else {
    	System.out.println("Este número não é divisível por 4 e 5!");
    }
       
  }

}
