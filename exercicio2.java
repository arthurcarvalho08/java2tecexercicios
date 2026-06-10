import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senhaPadrao = "1234";

        System.out.print("Digite a senha: ");
        String senhaDigitada = scanner.nextLine();

        if (senhaDigitada.equals(senhaPadrao)) {
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Acesso Negado");
        }

        scanner.close();
    }
}