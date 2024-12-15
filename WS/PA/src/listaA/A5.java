package listaA;
import java.util.Scanner;
public class A5 {

	public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);
   double preco,desconto,preco_vista;
   System.out.println("Digite o valor do preço: ");
   preco=entrada.nextDouble();
   desconto=((preco/100)*10);
   System.out.println("Seu desconto será de : " +desconto);
   preco_vista=(preco-desconto);
   System.out.println("O preço do produto à vista é de : " +preco_vista);
	
	
	}

}
