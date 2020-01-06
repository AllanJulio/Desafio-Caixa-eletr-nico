package caixaeletronico;

import java.util.Scanner;

public class main{
    
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        double valor;
        int tipo;
        int escolha;
        
        real r = new real();
        dolar d = new dolar();
        euro e = new euro();

        System.out.print("Informe um valor a ser depositado: ");
        valor = input.nextDouble();

        System.out.println( );
        System.out.println("Digite 1 Para Real, 2 para Dolar, 3  para Euro");
        System.out.println( );
        System.out.println("Qual é o tipo da moeda do deposito? ");
        tipo = input.nextInt();
        
        if(tipo == 1){
            r.setValorreal(valor);
            System.out.println( );
            System.out.println("O valor depositado é R$ "+r.getValorreal()+ " Reais");
            System.out.println( );
        }
        if(tipo == 2){
            d.setValordolar(valor);
            System.out.println( );
            System.out.println("O valor depositado é U$ "+d.getValordolar()+ " Dolares");
            System.out.println( );
        }if(tipo == 3){
            e.setValoreuro(valor);
            System.out.println( );
            System.out.println("O valor depositado é € "+e.getValoreuro()+ " Euros");
        }

        System.out.println("");

        System.out.println( );
        System.out.println("Digite 1 para SIM; 2 para Não ");
        System.out.println( );
        System.out.println("Deseja sacar? ");
        escolha = input.nextInt();

        if(escolha == 1){
            
            System.out.println("Digite 1 Para Real, 2 para Dolar, 3  para Euro");
            System.out.println( );
            System.out.println("Escolha a moéda do saque ");
            tipo = input.nextInt();
            System.out.println( );
            
            if(tipo == 1){
                r.getValorreal();
                r.sacarreal();
                


                
            }

            if(tipo == 2){
                d.getValordolar();
            
            }
            else{
                e.getValoreuro();
                
            }
    

        }
        

    }

   
    
}