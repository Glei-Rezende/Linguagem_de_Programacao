package linguagem_programacao;

import java.util.Scanner;

public class EX_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do custo de fábrica
        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        // Definição das taxas
        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;

        // Cálculo do custo final
        double custoDistribuidor = custoFabrica * percentualDistribuidor;
        double custoImpostos = custoFabrica * percentualImpostos;
        double custoConsumidor = custoFabrica + custoDistribuidor + custoImpostos;

        // Exibição do resultado
        System.out.println("\nO custo final do carro ao consumidor é: R$" + custoConsumidor);

        scanner.close();
    }
}

