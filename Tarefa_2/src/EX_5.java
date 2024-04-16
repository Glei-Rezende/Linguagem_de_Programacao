package linguagem_programacao;

import java.util.Scanner;

public class EX_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados
        System.out.print("Digite o número de carros vendidos: ");
        int numCarrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        double valorTotalVendas = scanner.nextDouble();

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor recebido por carro vendido: ");
        double valorPorCarroVendido = scanner.nextDouble();

        // Cálculo do salário final
        double comissaoFixaPorCarro = numCarrosVendidos * valorPorCarroVendido;
        double comissaoPorVendas = valorTotalVendas * 0.05;
        double salarioFinal = salarioFixo + comissaoFixaPorCarro + comissaoPorVendas;

        // Exibição do resultado
        System.out.println("\nSalário final do vendedor: R$" + salarioFinal);

        scanner.close();
    }
}

