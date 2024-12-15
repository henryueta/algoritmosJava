package listaA;
import java.util.Scanner;
public class A1 {

	public static void main(String[] args) {
Scanner entrada=new Scanner(System.in);
double n1,n2,n3,n4, soma,media;
System.out.println("Digite o valor de n1: ");
n1=entrada.nextDouble();
System.out.println("Digite o valor de n2: ");
n2=entrada.nextDouble();	
System.out.println("Digite o valor de n3: ");
n3=entrada.nextDouble();	
System.out.println("Digite o valor de n4: ");
n4=entrada.nextDouble();
soma=(n1+n2+n3+n4);
media=((soma)/4);
System.out.println("A media dos números é "  +media);
		

	}

}
