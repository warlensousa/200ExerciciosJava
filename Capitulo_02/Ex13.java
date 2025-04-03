package Capitulo_02;
public class Ex13 {
    public static void main(String[] args) {
        
        int numero1 = 10;
        int numero2 =  100;

        if(numero1 > numero2) {
            System.out.println("é maior!");
        } else if (numero1 < numero2) {
            System.out.println("é menor!");
        } else {
            System.out.println("é igual!");
        }


        boolean resultado = numero1 > numero2 ? true : false;
        System.out.println(resultado);

    }
}
