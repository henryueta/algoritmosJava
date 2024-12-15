package listaI;

import java.util.Scanner;

public class I2 {

	public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    char let1,let2,let3;
	let2 = 'Z';
    let3 = 'A';
    
    System.out.println("Sistema para apresentar o alfabeto em ordem crescente e decrescente.");
	
	System.out.println("\nORDEM CRESCENTE:");
	
	for(let1 = 'A'; let1 <= let2; let1++) {
		System.out.println(let1);
	}
	
	System.out.println("\nORDEM DECRESCENTE:");

	for(let2 = 'Z'; let3 <= let2; let2--) {
		System.out.println(let2);
	}
    
		
	}

}
