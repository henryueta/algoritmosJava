package listaJ;

public class J1 {

	public static void main(String[] args) {
		int num = 1;
		System.out.println("Numerais de 0 à 100 \nOrdem crescente!");
		while(num <= 100) {
			System.out.println(num);
			num++;
		}
		System.out.println("\n");
		System.out.println("Ordem decrescente!");
		num = 100;
		while(num >= 1) {
			System.out.println(num);
			num--;
		}
	}

}
