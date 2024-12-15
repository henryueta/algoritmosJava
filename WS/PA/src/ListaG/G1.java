package listaG;

import java.util.Scanner;

public class G1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String num, erro = "";
		
		System.out.println("Informe o código do erro:");
		num = leia.next();
		
		switch(num) {
			case "1": erro = "Indentificador Inválido";
			break;
			case "2": erro = "Esperando Número Inteiro";
			break;
			case "3": erro = "Tipo de Dado Indefinido";
			break;
			case "4": erro = "Parâmetro Incorreto";
			break;
			case "5": erro = "Memória Insulficiente";
		}
		System.out.println("Erro número " + num + "\n" + erro);
	}

}