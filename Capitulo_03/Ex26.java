package Capitulo_03;
public class Ex26 {
    public static void main(String[] args) {
        
        int somaPar = 0, somaImpar = 0;
        
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                somaPar += i;
            }
            somaImpar += i;
        }

        System.out.println("Total Par: " + somaPar + " | Total Impar: " + somaImpar);
    }
}
