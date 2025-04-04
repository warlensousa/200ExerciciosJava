package Capitulo_03;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int descontoPorcentagem = 10;

        System.out.println("Digite o valor do produto: ");
        double valorProduto = sc.nextDouble();

        if(valorProduto > 100) {
            double valorPosDesconto = (descontoPorcentagem * valorProduto) / 100;
            System.out.println("Valor Original: R$" + valorProduto + "| Desconto: " + descontoPorcentagem + "% = R$"+ valorPosDesconto + " | Valor final a pagar: R$" + (valorProduto - valorPosDesconto));
        } else {
            System.out.println("Valor a Pagar: R$" + valorProduto);
        }




        sc.close();
    }
}
