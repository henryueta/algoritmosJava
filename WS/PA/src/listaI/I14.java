package listaI;

import java.util.Scanner;

public class I14 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
    double num,fat,form,soma,result;
    soma = 1;
    result = 0;
    form = 0;
    fat = 1;
    
    
    System.out.println("Digite o valor de um número: ");
    num = entrada.nextInt();
        if(num == 0){
        System.out.println("O calculo do fatorial do número 0 é 1");
     }
      for(form = num-1; 1 <= form; form-- ){
       soma = soma * form;
         result = soma * num;
     }

        if(num > 0){
        System.out.println("O calculo do fatorial do número " +num+ " é " +result);
    }
  }
}
