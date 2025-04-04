package Capitulo_03;
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Digite sua nota de 0 a 10: ");
        int nota = sc.nextInt();

        switch (nota) {
            case 10:
                System.out.println("Excelente!");
                break;
            case 9:
            case 8:
                System.out.println("Muito bom!");
                break;
            case 7:
            case 6:
                System.out.println("Bom!");
                break;
            case 5:
                System.out.println("Regular!");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Insuficiente!");
                break;
            default:
                System.out.println("Nota inválida!");
                break;
        }
        sc.close();
    }
}
