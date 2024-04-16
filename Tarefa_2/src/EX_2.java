package linguagem_programacao;

import java.util.Scanner;

public class EX_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados
        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        System.out.print("Digite o número de votos brancos: ");
        int votosBrancos = scanner.nextInt();

        System.out.print("Digite o número de votos nulos: ");
        int votosNulos = scanner.nextInt();

        System.out.print("Digite o número de votos válidos: ");
        int votosValidos = scanner.nextInt();

        // Cálculo dos percentuais
        double percentualBrancos = (votosBrancos * 100.0) / totalEleitores;
        double percentualNulos = (votosNulos * 100.0) / totalEleitores;
        double percentualValidos = (votosValidos * 100.0) / totalEleitores;

        // Exibição dos resultados
        System.out.println("\nResultados:");
        System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
        System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualValidos);

        scanner.close();
    }
}
