package listaA;
import java.util.Scanner;
public class A6 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		double ht,vh,pd,sb,td,sl;
		System.out.println("Digite o valor de horas trabalhadas no mês: ");
		ht=entrada.nextDouble();
		System.out.println("Digite o valor das horas trabalhadas: ");
		vh=entrada.nextDouble();
		System.out.println("Digite o valor do percentual de desconto: ");
		pd=entrada.nextDouble();
		sb=(ht*vh);
		System.out.println("O valor do salário bruto é de: " +sb);
		td=((pd/100)*sb);
		System.out.println("O valor do total de desconto é de: " +td);
		sl=(sb-td);
		System.out.println("O valor do salário líquido é de: " +sl);

	}

}
