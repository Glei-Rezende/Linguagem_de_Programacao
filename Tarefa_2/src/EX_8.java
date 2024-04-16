package linguagem_programacao;

import java.util.Scanner;

public class EX_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do valor
        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        // Verificação e exibição da mensagem
        if (valor >= 0) {
            System.out.println("O valor é positivo.");
        } else {
            System.out.println("O valor é negativo.");
        }

        scanner.close();
    }


}