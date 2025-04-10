import java.util.Arrays;
import java.util.Scanner;

public class Ex33 {

    private static final int ARRAY_SIZE = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[ARRAY_SIZE];

        // Entrada dos números
        System.out.println("Digite " + ARRAY_SIZE + " números inteiros:");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nArray original: " + Arrays.toString(numeros));

        // Entrada do número a buscar e substituir
        System.out.print("\nDigite o número que deseja buscar: ");
        int numeroBuscado = sc.nextInt();

        System.out.print("Digite o número para substituir o número buscado: ");
        int numeroSubstituto = sc.nextInt();

        // Substituição
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                numeros[i] = numeroSubstituto;
                encontrado = true;
            }
        }

        // Resultado
        if (encontrado) {
            System.out.println("\nNúmero encontrado e substituído.");
        } else {
            System.out.println("\nNúmero não encontrado no array.");
        }

        System.out.println("Array final: " + Arrays.toString(numeros));

        sc.close();
    }
}



