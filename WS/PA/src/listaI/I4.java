package listaI;

import java.util.Scanner;

public class I4 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
    int multi1,multi2;
    multi2=10;
    double x;
    
    System.out.println("Sistema para calcular a tabuada de um número");
	System.out.println("Digite o valor do número");
	x = entrada.nextDouble();

    for(multi1 = 1; multi1 <= multi2; multi1++) {
    	System.out.print(+x+" X "+multi1+" = ");
    	System.out.println(x * multi1);
    }
    
		
	}

}
