package listaA;
import java.util.Scanner;
public class A4 {

	public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);
	double raio,altura,volume;
	System.out.println("Digite o valor do raio: ");
	raio=entrada.nextDouble();
	System.out.println("Digite o valor da altura");
	altura=entrada.nextDouble();
	volume=(3.14159*raio*raio*altura);
	System.out.println("O valor do volume é :" +volume);
	
	}

}
