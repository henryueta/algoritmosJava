package listaF;

import java.util.Scanner;

public class F10 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
    int a,b,c,d,e,maior,menor;
    
    System.out.println("Digite o valor do primeiro número: ");
    a= entrada.nextInt();
    System.out.println("Digite o valor do segundo número: ");
    b= entrada.nextInt();
    System.out.println("Digite o valor do terceiro número: ");
    c= entrada.nextInt();
    System.out.println("Digite o valor do quarto número: ");
    d= entrada.nextInt();
    System.out.println("Digite o valor do quinto número: ");
    e= entrada.nextInt();
	
   maior=(a);
   menor=(a);
   
   if(b>maior) {
	   maior=(b);
   }
   else if(b<menor) {
	   menor=(b);
   }
   if(c>maior) {
	   maior=(c);
   }
   else if(c<menor) {
	   menor=(c);
   }
   if(d>maior) {
	   maior=(d);
   }
   else if(d<menor) {
	   menor=(d);
   }
   if(e>maior) {
	   maior=(e);
   }
   else if(e<menor) {
	   menor=(e);
   }
   System.out.println("O menor número é " +menor+ " enquanto o maior número é " +maior);
   
	}

}
