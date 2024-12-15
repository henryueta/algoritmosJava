package extraB;

import java.util.Scanner;

public class EX1{
    
public static void main (String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    
    int idade, qntalunos,aluno;
    double media,centti=0, centodon=0, centdir=0, centmec=0,centele=0,soma=0 ,ti=0,odon=0,dir=0,mec=0,ele=0,idti=0,idodon=0,iddir=0,idmec=0,idele=0; 
    String inten;
    
    System.out.println("Digite a quantidade total de alunos para a pesquisa: ");
    qntalunos = entrada.nextInt();
    if(qntalunos > 0) {
    System.out.println(+qntalunos+" alunos foram selecionados para a pesquisa.");
    
    
    		
    
    for(aluno = 1;aluno <= qntalunos; aluno++){
    	
    	
    	
        System.out.println("");

        System.out.println("Pesquisa do "+aluno+ "º aluno:");
        System.out.println("Digite a sua idade");
        idade = entrada.nextInt();
         soma=(soma + idade);
         
         if(idade <= 0) {
        	 System.out.println("Idade de aluno inválida!");
         }
         
         if(idade > 0) {       	
         
        System.out.println("Digite qual curso deseja realizar: T.I, Odontologia, Direito, EngenhariaMecânica ou EngenhariaElétrica. ");
         inten = entrada.next();
                
        switch(inten) {
        
            case "T.I":
                System.out.println("A intenção do aluno é T.I");
                ti++;
                idti = idti + idade;
                centti=((ti*100)/qntalunos);
            break;
            
            case "Odontologia":
                System.out.println("A intenção do aluno é Odontologia");
                odon++;
                idodon = idodon + idade;
                centodon=((odon*100)/qntalunos);
            break;
            
            case "Direito":
                System.out.println("A intenção do aluno é Direito");
                dir++;
                iddir = iddir + idade;
                centdir=((dir*100)/qntalunos);
            break;
            
            case "EngenhariaMecânica":
                System.out.println("A intenção do aluno é Engenharia Mecânica");
                mec++;
                idmec = idmec + idade;
                centmec=((mec*100)/qntalunos);
            break;
            
            case "EngenhariaElétrica":
                System.out.println("A intenção do aluno é Engenharia Elétrica");
                ele++;
                idele = idele + idade;
                centele=((ele*100)/qntalunos);
            break;
        
        }  
      }
    }
    
 
    media = (soma/qntalunos);
    System.out.println("");
    System.out.println("RESUMO DA PESQUISA:");
    
    System.out.println("");
    
    System.out.println("Total de alunos entrevistados: " +qntalunos);
    
    System.out.println("");

    System.out.println(+centti+"% dos alunos pretendem cursar T.I");
    System.out.println(+centodon+"% dos alunos pretendem cursar Odontologia");
    System.out.println(+centdir+"% dos alunos pretendem cursar Direito");
    System.out.println(+centmec+"% dos alunos pretendem cursar Engenharia Mecânica");
    System.out.println(+centele+"% dos alunos pretendem cursar Engenharia Elétrica");
    System.out.println("");
    System.out.println("A media de todas as idades dos alunos entrevistados possui o valor de " +media);
    
    if(ti > 0){
    	media = (idti/ti);
        System.out.println("A media das idades dos alunos que irão cursar T.I é " +media);
    }
    if(ti == 0) {
        System.out.println("A media das idades dos alunos que irão cursar T.I é 0");
    }
    
    if(odon > 0){
    	media = (idodon/odon);
        System.out.println("A media das idades dos alunos que irão cursar Odontologia é " +media);
    }
    if(odon == 0) {
        System.out.println("A media das idades dos alunos que irão cursar Odontologia é 0");
    }
    
    if(dir > 0){
    	media = (iddir/dir);
        System.out.println("A media das idades dos alunos que irão cursar Direito é " +media);
    }
    if(dir == 0) {
        System.out.println("A media das idades dos alunos que irão cursar Direito é 0");
    }
    
    if(mec > 0){
    	media = (idmec/mec);
        System.out.println("A media das idades dos alunos que irão cursar Engenharia Mecânica é " +media);
    }
    if(mec == 0) {
        System.out.println("A media das idades dos alunos que irão cursar Engenharia Mecânica é 0");
    }
    
    if(ele > 0){
    	media = (idele/ele);
        System.out.println("A media das idades dos alunos que irão cursar Engenharia Elétrica é " +media);
    }
    if(ele == 0) {
        System.out.println("A media das idades dos alunos que irão cursar Engenharia Elétrica é 0");
    }
    
   }
    
   
    
   
    
    if(qntalunos <= 0) {
    	System.out.println("PESQUISA INEXISTENTE!");
        System.out.println("Nenhum aluno foi selecionado.");

    }
   
  }
    
}



