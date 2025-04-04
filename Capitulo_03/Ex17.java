package Capitulo_03;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Número: ");
        int n = sc.nextInt();

        String parOrImpar = n % 2 == 0 ? "Par" : "Ímpar";
        System.out.println(parOrImpar);

        sc.close();
    }
}
