package listaF;

import java.util.Scanner;

public class F6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int cod;
        double salario,reajuste,novo;
        System.out.println("Digite o valor do salario do funcionário:  ");
        salario = entrada.nextDouble();
        System.out.println("Digite o valor do codigo: ");
        cod = entrada.nextInt();
        
            if(cod==1){
               reajuste = ((salario/100)*5);
               novo = (salario+reajuste);
               System.out.println("Sua função é Operador. Seu salário antigo era de R$" +salario);
               System.out.println("Após o reajuste de 5% seu salário terá o valor de R$" +novo);
            }else if(cod==2){    
                     reajuste = ((salario/100)*10);
                     novo = (salario+reajuste);
                     System.out.println("Sua função é Programador. Seu salário antigo era de R$" +salario);
                     System.out.println("Após o reajuste de 10% seu salário terá o valor de R$" +novo); 
                  }else if(cod==3){
                          reajuste = ((salario/100)*15);
                          novo = (salario+reajuste);
                          System.out.println("Sua função é Analista. Seu salário antigo era de R$" +salario);
                          System.out.println("Após o reajuste de 15% seu salário terá o valor de R$" +novo); 
                       }else if(cod==4){
                               reajuste = ((salario/100)*25);
                               novo = (salario+reajuste);
                               System.out.println("Sua função é Gerente. Seu salário antigo era de R$" +salario);
                               System.out.println("Após o reajuste de 25% seu salário terá o valor de R$" +novo);    
                           }else if(cod>=0){
                                System.out.println("Erro! Código inválido ou inexistente");
                                             
	                             }else if(cod>=5){
	                              System.out.println("Erro! Código inválido ou inexistente");
	                              }
		
		
		
	}

}
