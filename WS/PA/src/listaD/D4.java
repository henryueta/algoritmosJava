package listaD;

import java.util.Scanner;

public class D4 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double n1,n2,d1,d2;
    
    System.out.println("Digite o primeiro número: ");
    n1=entrada.nextDouble();
    System.out.println("Digite o segundo número: ");
    n2=entrada.nextDouble();
    
    if(n1 > n2) {
    d1=(n1-n2);
    System.out.println("O número " +n1+ " é maior que " +n2+ " ,portanto, a diferença do valor maior pelo menor resultará no número " +d1);
    }
    
    if(n2 > n1) {
    d2=(n2-n1);	
    System.out.println("O número " +n2+ " é maior que " +n1+ " ,portanto, a diferença do valor maior pelo menor resultará no número " +d2);	
    }
    
    if(n1==n2) {
    System.out.println("Os números são iguais, portanto, não é possível realizar a diferença do valor maior pelo menor");	
    }
    
  }

}
