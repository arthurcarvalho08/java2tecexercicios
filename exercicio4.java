// 4- O Semáforo: O usuário digita uma cor ("Verde", "Amarelo" ou "Vermelho"). O
// programa deve responder "Siga", "Atenção" ou "Pare". Se for qualquer outra
// coisa, exibe "Cor inválida".

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cor do semáforo: ");
        String cor = scanner.nextLine().toLowerCase();

        if (cor.equals("verde")) {
            System.out.println("Siga");
        } else if (cor.equals("amarelo")) {
            System.out.println("Atenção");
        } else if (cor.equals("vermelho")) {
            System.out.println("Pare");
        } else {
            System.out.println("Cor inválida");
        }

        scanner.close();
    }
}