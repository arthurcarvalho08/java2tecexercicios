//5- Classificador de Faixa Etária: Com base na idade digitada, o programa categoriza o usuário em: Criança (0 a 12), Adolescente (13 a 17), Adulto (18 a 59) ou Idoso (60+).

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Classificação: Criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Classificação: Adolescente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Classificação: Adulto");
        } else if (idade >= 60) {
            System.out.println("Classificação: Idoso");
        } else {
            System.out.println("Idade inválida!");
        }

        scanner.close();
    }
}