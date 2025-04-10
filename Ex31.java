import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int[] numeros = new int[8];
    
         for(int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
         }

         for(int n : numeros) {
            if(n % 2 == 0) {
                System.out.println(n);
            }
         }

         sc.close();
    }
}
