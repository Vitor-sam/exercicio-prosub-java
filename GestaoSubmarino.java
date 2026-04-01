import java.util.Scanner;

public class GestaoSubmarino{

      public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           
           double repasse;
           String acesso, pais;
           int erro = 0;

           System.out.println("Insira o valor de repasse anual em bilhões de reais");
           repasse = sc.nextDouble();

           if(repasse < 0.5){
            System.out.println("ALERTA:Risco de paralisação total. Data estimada: 2045");
            }else if (repasse <= 1.0 && repasse >= 0.5){
              System.out.println("Ritmo lento: Finalização prevista para 2037");}
             else {
                  System.out.println("Projeto acelerado: Possibilidade de antecipação da entrega");}

            

                  System.out.println("Seu código de país é brasil? [Sim ou Não]");
                  pais = sc.next();

                  if(!pais.equalsIgnoreCase("Sim")){
                   System.out.print("ACESSO NEGADO: Soberania Nacional preservada. Dados criptografados");
                      erro++;  
                  }

                  if(erro==0){
                        System.out.println("Qual a temperatura no reator?");
                        double temp = sc.nextDouble();
                  if(temp < 280){
                        System.out.println("Aumentar potência do reator");}
                   else if (temp >= 280 && temp <=350){
                        System.out.println("Operação Normal - Cruzeiro");}
                   else{
                        System.out.println("EMERGÊNCIA: Acionar sistema de resfriamento e emergência");
                   }     
                   }else{
                        System.out.println("");
                   }
                   
                   sc.close();

                  }      
                  }





      
            
                

           
                        