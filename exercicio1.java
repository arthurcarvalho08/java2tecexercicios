//1- Calculadora de Maioridade: 
// O programa pede o ano de nascimento ou
//  a idade da pessoa e responde se ela já é maior de idade ou não.

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        scanner.close();
    }
}
