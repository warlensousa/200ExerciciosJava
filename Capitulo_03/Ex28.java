package Capitulo_03;
import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int soma = 0;
        while (true) {
            System.out.println("Digite um numero: ");
            int n = sc.nextInt();
            
            if(n == 0) {
                System.out.println("Total: " + soma);
                break;
            }
            soma += n;
        }

        sc.close();
    }
}
