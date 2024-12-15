package listaF;

import java.util.Scanner;

public class F8 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
	double a,b,c;
	double maior,menor;
	
	
	System.out.println("Digite o valor do valor A");
	a = entrada.nextDouble();
	System.out.println("Digite o valor do valor B");
	b = entrada.nextDouble();
	System.out.println("Digite o valor do valor C");
	c = entrada.nextDouble();
	
	if(a<b)
		if(b<c) {
			System.out.println(a+ "," +b+ "," +c);
		}
		else if(a<c)
				if(c<b) {
					System.out.println(a+ "," +c+ "," +b);
				}
					 if(c<a)
						if(a<b) {
							System.out.println(c+ "," +a+ "," +b);
						}					 
						else if(c<b)
							if(b<a) {
								System.out.println(c+ "," +b+ "," +a);
							}
					 if(b<a)
						 if(a<c) {
								System.out.println(b+ "," +a+ "," +c);
						 }
						 else if(b<c)
						 if(c<a) {
								System.out.println(b+ "," +c+ "," +a);
						 }	 
	}
}
