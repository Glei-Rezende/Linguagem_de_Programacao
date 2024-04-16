package linguagem_programacao;

import java.util.Scanner;

public class EX_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados
        System.out.print("Digite o salário mensal atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite o percentual de reajuste (%): ");
        double percentualReajuste = scanner.nextDouble();

        // Cálculo do novo salário
        double novoSalario = salarioAtual * (1 + percentualReajuste / 100);

        // Exibição do resultado
        System.out.println("\nNovo salário após o reajuste: R$" + novoSalario);

        scanner.close();
    }
}
