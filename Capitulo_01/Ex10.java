package Capitulo_01;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        //  Exercício 10: Formatação de Saída
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um número decimal com duas casas decimais: ");
            double valor = sc.nextDouble();
            String.format("%.2f", valor);
            System.out.println(valor);
            
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage()); 
        }
    }
}