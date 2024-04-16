package linguagem_programacao;

import java.util.Scanner;

public class EX_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do ano atual e do ano de nascimento
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        // Cálculo da idade
        int idade = anoAtual - anoNascimento;

        // Verificação se a pessoa pode votar este ano
        if (idade >= 16) {
            System.out.println("Você pode votar este ano.");
        } else {
            System.out.println("Você não pode votar este ano.");
        }

        scanner.close();
    }
}

