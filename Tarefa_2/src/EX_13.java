package linguagem_programacao;

import java.util.Scanner;

public class EX_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dois valores
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        // Verificação e exibição dos valores em ordem crescente
        if (valor1 < valor2) {
            System.out.println("Valores em ordem crescente: " + valor1 + ", " + valor2);
        } else {
            System.out.println("Valores em ordem crescente: " + valor2 + ", " + valor1);
        }

        scanner.close();
    }
}

