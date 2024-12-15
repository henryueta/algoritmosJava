package extraA;
import java.util.Scanner;
public class EX5 {

	public static void main(String[] args) {
	Scanner leia= new Scanner(System.in);
	double carros,vendas,salariofixo,pagamento,comissao,porcentagem,salariototal;
	System.out.println("Escreva a quantidade de carros ventidos: ");
	carros=leia.nextDouble();
	System.out.println("Escreva a quantidade de vendas realizadas: ");
	vendas=leia.nextDouble();
	System.out.println("Escreva o valor do salário fixo do funcionário: ");
	salariofixo=leia.nextDouble();
	System.out.println("Escreva o valor que o funcionário recebe por carro vendido: ");
	pagamento=leia.nextDouble();
	porcentagem=(0.05 * vendas);
	System.out.println(+porcentagem);
	comissao=(pagamento * carros);
	System.out.println(+comissao);



	salariototal=(porcentagem + comissao + salariofixo);
	System.out.println("O salário total a ser recebido pelo funcionário é de: " +salariototal);
		}

	}