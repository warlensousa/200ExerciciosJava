package Capitulo_02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para ver sua potencia: ");
        int potencia = sc.nextInt();

        System.out.println("Digite o número que vai elevar o outro: ");
        int elevar = sc.nextInt();

        double resultado = Math.pow(potencia, elevar);
        System.out.println(potencia + " elevado a " + elevar + " é igual a: " + resultado);

        sc.close();
    }
}
