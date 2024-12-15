package listaD;

import java.util.Scanner;

public class D5 {

	public static void main(String[] args) {

		double a, b, c;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um primeiro valor:");
		a = leia.nextDouble();
		System.out.println("Digite um segundo valor:");
		b = leia.nextDouble();
		System.out.println("Digite um terceiro valor:");
		c = leia.nextDouble();
		
		if(a > b) {
			if(b > c) {
				System.out.println(c + ", " + b + ", " + a);//
			}
		}
		if(a > c)
			if(c > b) {
				System.out.println(b + ", " + c + ", " + a);//
			}
		if(b > a)
			if(a > c) {
				System.out.println(c + ", " + a + ", " + b);//
			}
		if(b > c)
			if(c > a) {
				System.out.println(a + ", " + c + ", " + b);//
			}
		if(c > a)
			if(a > b) {
				System.out.println(b + ", " + a + ", " + c);//
			}
		if(c > b)
			if(b > a) {
				System.out.println(a + ", " + b + ", " + c);//
			}
	}

}
