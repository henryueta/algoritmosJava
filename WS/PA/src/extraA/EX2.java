package extraA;
import java.util.Scanner;
public class EX2 {

	public static void main(String[] args) {
 Scanner leia=new Scanner(System.in);
 double total, branco, nulo,valido,P1,P2,P3;
 
 System.out.println("Digite o número total de eleitores: ");
 total=leia.nextDouble();
 System.out.println("Digite o valor total de votos brancos:  ");
 branco=leia.nextDouble();
System.out.println("Digite o valor total de votos nulos: ");
nulo=leia.nextDouble();
System.out.println("Digite o valor total de votos válidos: ");
valido=leia.nextDouble();

System.out.println("O valor total de eleitores é " +total);
P1=((branco/total)*100);
System.out.println("O percentual de votos brancos em relação ao total de eleitores é " +P1);
P2=((nulo/total)*100);
System.out.println("O percentual de votos nulos em relação ao total de eleitores é " +P2);
P3=((valido/total)*100);
System.out.println("O percentual de votos válidos em relação ao total de eleitores é " +P3);



	}

}
