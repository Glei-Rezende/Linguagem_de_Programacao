package linguagem_programacao;

import java.util.Scanner;

public class EX_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da hora de início e da hora de fim do jogo
        System.out.print("Digite a hora de início do jogo: ");
        int horaInicio = scanner.nextInt();

        System.out.print("Digite a hora de fim do jogo: ");
        int horaFim = scanner.nextInt();

        // Cálculo da duração do jogo
        int duracaoJogo;
        if (horaFim > horaInicio) {
            duracaoJogo = horaFim - horaInicio;
        } else {
            duracaoJogo = (24 - horaInicio) + horaFim;
        }

        // Exibição da duração do jogo
        System.out.println("A duração do jogo foi de " + duracaoJogo + " horas.");

        scanner.close();
    }
}