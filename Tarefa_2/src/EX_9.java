package linguagem_programacao;

import java.util.Scanner;

public class EX_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número de maçãs compradas
        System.out.print("Digite o número de maçãs compradas: ");
        int quantidadeMacas = scanner.nextInt();

        // Cálculo do custo total da compra
        double custoTotal;
        if (quantidadeMacas < 12) {
            custoTotal = quantidadeMacas * 1.30;
        } else {
            custoTotal = quantidadeMacas * 1.00;
        }

        // Exibição do resultado
        System.out.println("\nO custo total da compra é: R$" + custoTotal);

        scanner.close();
    }
}



