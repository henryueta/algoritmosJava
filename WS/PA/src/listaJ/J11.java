package listaJ;

import java.util.Scanner;

public class J11 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double num,rep,form;
    form =1;
    System.out.println("Programa para calcular o fatorial de um número");
	System.out.println("Digite o valor de um número:");
	num = entrada.nextDouble();
	
	while(1 <= num) {
		form = form * num;
		num--;		
	}
	System.out.println("RESULTADO FINAL: "+form);
	
	}

}
