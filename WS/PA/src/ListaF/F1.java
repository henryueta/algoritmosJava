package listaF;

import java.util.Scanner;

public class F1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String depa = "desconhecido";
		
		System.out.println("Digite o código do departamento em que você trabalhará:");
		int cod = leia.nextInt();
		
		if(cod == 10) {
			depa = "Contabilidade"; }
		else if(cod == 12) {
				depa = "Almoxarifado"; }
			else if(cod == 14) {
					depa = "Informática"; }
		
		System.out.println("O departamento em que você deverá trabalhar é " + depa + ".");
	}

}