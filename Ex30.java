import java.util.Arrays;
import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

       for(int i = 0; i <= 4; i++) {
            System.out.println("Digite um numero inteiro para colocar no Array: ");
            int n = sc.nextInt();

            if(n >= 1) {
                numeros[i] = n;    
            } else {
                System.out.println("Valor inválido");
                break;
            }
       }

       int totalArray = Arrays.stream(numeros).sum();
       System.out.println(totalArray);

       //

       int[] numerosInt = new int[5];
       int soma = 0;

       for(int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero inteiro para colocar no Array: ");
            numerosInt[i] = sc.nextInt();
            soma += numerosInt[i];
       }

       System.out.println(Arrays.toString(numerosInt) + " | Soma: " + soma);


       sc.close();

    }
}
