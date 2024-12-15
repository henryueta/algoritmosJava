package extraA;

import java.util.Scanner;
public class T1 {
    public static void main(String args[]) {
    	Scanner scanner = new Scanner(System.in);
    	
    	 System.out.println("Forneça um número inteiro entre 1 e 7:");    	 
         String dia = scanner.next();  
		 
         String dia_semana = "";
                
                switch (dia) {
                    case "1":  dia_semana = "Domingo";  
                      break;
                    case "2":  dia_semana = "Segunda";  
                      break;
                    case "3":  dia_semana = "Terça";    
                      break;
                    case "4":  dia_semana = "Quarta";   
                      break;
                    case "5":  dia_semana = "Quinta";   
                      break;
                    case "6":  dia_semana = "Sexta";    
                      break;
                    case "7":  dia_semana = "Sábado";  
                      break;
                    default: dia_semana = "Dia da Semana Inválido!";
                }
                System.out.println("Número fornecido: " + dia + "\n" + dia_semana);
           
        }
      
    }

