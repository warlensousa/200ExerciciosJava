package Capitulo_02;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;

        for(int i = 1; i <= 5; i++) {
            System.out.println("Digite um número: ");
            int numero = sc.nextInt();

            soma += numero;
        }

        System.out.println("Valo total: " + soma);
        sc.close();
    }
}
