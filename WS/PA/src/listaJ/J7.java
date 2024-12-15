package listaJ;

import java.util.Scanner;

public class J7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resp = "sim";
		int respPesq, mat = 0, sN = 0;
		System.out.println("Pesquisa de sagas de filmes!\n");
		while(resp.equalsIgnoreCase("sim")) {
			System.out.println("Qual a melhor saga de filmes?\n1 - Matrix\n2 - Senhor dos Anéis");
			respPesq = sc.nextInt();
			
			if(respPesq == 1) {
				mat++;
			} else if(respPesq == 2) {
				sN++;
			}
			System.out.println("Deseja realizar novamente a votação?");
			resp = sc.next();
		}
		if(mat > sN) {
			System.out.println("O vencedor é Matrix!!!");
		} else if(sN > mat) {
			System.out.println("O vencedor é Senhor dos Anéis!!!");
		} else if (mat == sN) {
			System.out.println("O resultado deu Empate!");
		}
		System.out.println("Total de votos para cada saga:\nMatrix - " + mat + "\nSenhor dos Anéis - ");
	}

}
