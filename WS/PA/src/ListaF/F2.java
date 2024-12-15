package listaF;

import java.util.Scanner;

public class F2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite a idade da criança:");
		idade = leia.nextInt();
		
		String catg = "desconhecida!";

		if(idade >= 6)
			if(idade <= 8)
				catg = "Dente de Leite";
			else if(idade >= 9)
					if(idade <= 11)
						catg = "Pré-Mirim";
					else if(idade >= 12)
							if(idade <= 13)
								catg = "Mirim";
							else if(idade >= 14)
									if(idade <= 15)
										catg = "Infantil";
									else if(idade >= 16)
											if(idade <= 17)
												catg = "Juvenil";
											else if(idade >= 18)
													if(idade <= 20)
														catg = "Juniores";
		
		System.out.println("A categoria da equipe que se deve jogar é a " + catg);
							
	
	}

}
