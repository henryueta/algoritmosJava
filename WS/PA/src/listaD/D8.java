package listaD;
import java.util.Scanner;
public class D8 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double n1,n2,d1,d2;
    
    System.out.println("Digite o valor do primeiro núemro: ");
    n1 = entrada.nextDouble();
    System.out.println("Digite o valor do segundo número: ");
    n2= entrada.nextDouble();
    
    if(n1 > n2) {
    d1=(n1/n2);
    System.out.println("O valor " +n1+ " é maior que " +n2+ ", sendo assim, a divisão do maior pelo menor resultará no número: " +d1);
    }
	
    if(n2 > n1) {
    d2=(n2/n1);
    System.out.println("O valor " +n2+ " é maior que " +n1+ ", sendo assim, a divisão do maior pelo menor resultará no número: " +d2);
    }
		
		
   }

}
