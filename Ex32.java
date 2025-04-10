import java.util.Arrays;

public class Ex32 {
    public static void main(String[] args) {

        int[] numeros = {120, 2, 3, 4, 5, 6, 7, 1};

        int maior = Arrays.stream(numeros).max().getAsInt();
        System.out.println(maior);

        int menor = Arrays.stream(numeros).min().getAsInt();
        System.out.println(menor);


        //
        int maiorFor = 0;
        int menorFor = 0;

        for(int n : numeros) {
            maiorFor = n;
            menorFor = n;
            if(maiorFor < n) {
                maiorFor = n;
            }
            if(menorFor < n) {
                menorFor = n;
            }
        }

        System.out.println("Maior: " + maior + " | Menor: " + menor);
    }
}
