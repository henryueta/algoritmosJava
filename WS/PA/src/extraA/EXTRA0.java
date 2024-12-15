package extraA;
import java.util.Scanner;
public class EXTRA0 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
double N1,N2,N3,solicitacao ;
System.out.println("Digite o valor solicitado pela siderurgica: ");
solicitacao=leia.nextDouble();
//Primeira etapa
N1=(solicitacao * 0.02);
System.out.println(+N1);
N2=(N1 * 0.03);
N3=((N1+N2)+solicitacao);
System.out.println("A quantidade de carvão que deve ser extraida é " +N3);


	}

}
