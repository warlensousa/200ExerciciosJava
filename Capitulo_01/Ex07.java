package Capitulo_01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        //  Exercício 7: Entrada de Dados:

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int inteiro = sc.nextInt();
        
        System.out.println("Digite um número decimal: ");
        double decimal = sc.nextDouble();

        double soma = decimal + inteiro;
        System.out.println("Total: " + soma);


        sc.close();
    }
}
