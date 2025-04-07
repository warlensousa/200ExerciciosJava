package Capitulo_03;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Digite um número inteiro de 1 a 10: ");
            int numero = sc.nextInt();
            if(numero >= 1 && numero <= 10) {
                System.out.println(numero);
                break;
            } 
            System.out.println("Número inválido!");
        }

        sc.close();
    }
}
