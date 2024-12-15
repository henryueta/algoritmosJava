package listaG;

import java.util.Scanner;

public class G2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String cod, dep = "";
		
		System.out.println("Informe o código do departameno:");
		cod = leia.next();
		
		switch(cod) {
			case "10": dep = "Expedição";
			break;
			case "20": dep = "Recursos Humanos";
			break;
			case "30": dep = "Logística";
			break;
			case "40": dep = "Contabilidade";
			break;
			case "50": dep = "Departamento Pessoal";
			break;
			case "60": dep = "Informática";
		}
		System.out.println("Código " + cod + "\n" + dep);
	}

}