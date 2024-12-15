package listaA;
import java.util.Scanner;
public class A10 {

	public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);
	double A,B,troca,troca2;
	System.out.println("Digite o valor de A: ");
	A=entrada.nextDouble();
	System.out.println("Digite o valor de B: ");
	B=entrada.nextDouble();
	troca=(B);
	troca2=(A);
	A=(troca);
	B=(troca2);
	System.out.println("O valor atualizado de A é: " +A);
	System.out.println("O valor atualizado de B é: " +B);

	}

}
