package Capitulo_02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Para Adição digite: 1 | Subtração: 2 | Multiplicação: 3 | Divisão: 4 | Módulo: 5");
        int opera = sc.nextInt();

        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();

        System.out.println("Digite outro número: ");
        int n2 = sc.nextInt();

        calculadora(opera, n1, n2);

        sc.close();
    }

    public static void calculadora(int opera, int n1, int n2) {
            switch (opera) {
                case 1:
                    System.out.println("Resultado: " + n1 + n2);
                    break;
                case 2:
                    System.out.println("Resultado: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Resultado: " + n1 * n2);
                    break;
                case 4:
                    System.out.println("Resultado: " + n1 / n2);
                    break;
                case 5:
                    System.out.println("Resultado: " + n1 % n2);
                    break;
                default:
                    System.out.println("Valor de operação inválida!");
                    break;
            }    
    }
}