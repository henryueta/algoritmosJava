package listaA;
import java.util.Scanner;
public class A7 {

	public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);
	double vel,temp,dist,litros;
	System.out.println("Digite o valor da velocidade: ");
	vel=entrada.nextDouble();
	System.out.println("Digite o valor do tempo gasto durante  a viagem: ");
	temp=entrada.nextDouble();
	dist=(temp+vel);
	System.out.println("O valor da distância é de: " +dist);
    litros=(dist/12);
    System.out.println("O valor da quantidade de litros utilizados na viagem é de : ");
	}

}
