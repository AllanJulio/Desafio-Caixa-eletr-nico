package caixaeletronico;

import java.util.Scanner;

public class main{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor;

        dolar d = new dolar();
         
        System.out.print("Informe um valor a ser depositado: ");
        valor = input.nextDouble();

        System.out.println( );

        d.setValordolar(valor);

        System.out.println("O valor depositado foi "+d.getValordolar());

        System.out.println( );
     
    }
}