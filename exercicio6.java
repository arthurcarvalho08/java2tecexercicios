//6 - Calculadora de Descontos: O programa pede o valor total de uma compra. Se for acima de R$ 100, aplica 10% de desconto. Se for acima de R$ 200, aplica 20%. Caso contrário, não dá desconto.

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        double desconto = 0;

        if (valorCompra > 200) {
            desconto = 0.20; // 20%
        } else if (valorCompra > 100) {
            desconto = 0.10; // 10%
        }

        double valorFinal = valorCompra - (valorCompra * desconto);

        System.out.println("Valor original: R$ " + valorCompra);
        System.out.println("Desconto aplicado: " + (desconto * 100) + "%");
        System.out.println("Valor final: R$ " + valorFinal);

        scanner.close();
    }
}
