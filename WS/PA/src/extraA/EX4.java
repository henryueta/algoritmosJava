package extraA;
import java.util.Scanner;
public class EX4 {

	public static void main(String[] args) {
	Scanner leia= new Scanner(System.in);
	double custofabrica,distribuidor,impostos,custocarro;
	System.out.println("digite o custo de fábrica do carro: ");
	custofabrica=leia.nextDouble();
	distribuidor=(custofabrica * 0.28);
	impostos=(custofabrica * 0.45);
	custocarro=(custofabrica+distribuidor+impostos);
	System.out.println("O custo final do carro para o consumidor é " +custocarro);

	}

}
