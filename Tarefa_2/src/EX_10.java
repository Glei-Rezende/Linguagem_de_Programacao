package linguagem_programacao;

import java.util.Scanner;

public class EX_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das notas da primeira e segunda avaliações
        System.out.print("Digite a nota da primeira avaliação: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda avaliação: ");
        double nota2 = scanner.nextDouble();

        // Cálculo da média aritmética simples
        double media = (nota1 + nota2) / 2;

        // Verificação se o aluno foi aprovado
        String situacao;
        if (media >= 6.0) {
            situacao = "APROVADO";
        } else {
            situacao = "REPROVADO";
        }

        // Exibição da média e situação do aluno
        System.out.println("\nMédia do aluno: " + media);
        System.out.println("Situação do aluno: " + situacao);

        scanner.close();
    }
}

