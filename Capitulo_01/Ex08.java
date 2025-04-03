package Capitulo_01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.println("Bem-vindo a Inglaterra, " + nome + " " + sobrenome + "!");

        sc.close();
        
    }
}
