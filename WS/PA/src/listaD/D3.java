package listaD;

import java.util.Scanner;

public class D3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o código de departamento: ");
		 int cod= leia.nextInt();
		 
		 if(cod == 1) {
			 System.out.println("O seu departamento é o de Expedição.");
		 }
		 if(cod == 2) {
			 System.out.println("O seu departamento é o de Recursos Humanos.");
		 }
		 if(cod == 3) {
			 System.out.println("O seu departamento é o de Logística.");
		 }
		 if(cod == 4) {
			 System.out.println("O seu departamento é o de Contabilidade.");
		 }
		 if(cod < 1) {
			 System.out.println("Código inválido.");
		 }
		 if(cod > 4) {
			 System.out.println("Código inválido.");
		 }
		
	}

}
