package Capitulo_02;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Digite um número: ");
        int valor1 = sc.nextInt();

        System.out.println("Digite um número: ");
        int valor2 = sc.nextInt();

        valor1 += valor2;
        System.out.println(valor1);

        valor1 -= valor2;
        System.out.println(valor2);

        sc.close();
    }
}
