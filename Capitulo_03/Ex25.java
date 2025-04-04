package Capitulo_03;
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para ver a tabuada de multiplicação dele de 1 a 10: ");
        int numero = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        int n = 1;
        while(n <= 10) {
            System.out.println(numero + " - " + n + " = " + (numero - n));
            n++;
        }

        sc.close();
    }  
}
