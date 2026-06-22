//3- Limite de Velocidade: O usuário digita a velocidade de um carro. Se for maior que 80 km/h, exibe "Você foi multado!". Senão, "Boa viagem!".

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade do carro (km/h): ");
        double velocidade = scanner.nextDouble();

        if (velocidade > 80) {
            System.out.println("Você foi multado!");
        } else {
            System.out.println("Boa viagem!");
        }

        scanner.close();
    }
}