package extraA;
import java.util.Scanner;
public class EX1 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double valor, suce, ante;
	
	System.out.println("Digite algum valor do teclado ");
	valor = entrada.nextDouble();
	
	suce = (valor + 1);
	ante = (valor - 1);
	
	System.out.println("O antecessor é" + ante + "!");
	System.out.println("O sucessor é " + suce + "!");
	}

}
