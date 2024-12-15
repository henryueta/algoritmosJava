package listaK;

import java.util.Scanner;

public class K11 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double num,form;
    form =1;
    System.out.println("Programa para calcular o fatorial de um número");
	System.out.println("Digite o valor de um número:");
	num = entrada.nextDouble();
	do {
		form = form * num;
		num--;		
	} while(1 <= num);
	System.out.println("RESULTADO FINAL: "+form);
	}

}