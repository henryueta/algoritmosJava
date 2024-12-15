package extraA;

import java.util.Scanner;

public class EX3{

public static void main(String[] args){

	Scanner leia = new Scanner(System.in);
	double ano, mes, dia, idadedias;
	
	System.out.println("Digite sua idade em anos:");
	ano = leia.nextDouble();
	System.out.println("Meses:");
	mes = leia.nextDouble();
	System.out.println("E dias: ");
	dia = leia.nextDouble();
	
	idadedias = ((ano * 365) + (mes * 30) + dia);
	
	System.out.println("Você tem " + idadedias + "dias de idade!");
}
}