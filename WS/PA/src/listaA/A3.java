package listaA;
import java.util.Scanner;
public class A3 {

	public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);
	double C,F;
	System.out.println("Digite o valor da temperatura em graus Centígrados: ");
	C=entrada.nextDouble();
    F=((9*C+160)/5);
    System.out.println("A temperatura convertida agora em Fahrenheit é : " +F);
	}

}
