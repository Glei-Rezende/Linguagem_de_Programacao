import java.util.Scanner;

public class EX_3 {
    public static void main(String[] args) {

        // Criando um scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo a nota da primeira prova
        System.out.print("Digite a nota da primeira prova (0 a 10): ");
        double notaProva1 = scanner.nextDouble();

        // Solicitando e lendo a nota do primeiro exercicio
        System.out.print("Digite a nota do primeiro exercicio (0 a 10): ");
        double notaExercicio1 = scanner.nextDouble();

        // Solicitando e lendo a nota do segundo exercicio
        System.out.print("Digite a nota do segundo exercicio (0 a 10): ");
        double notaExercicio2 = scanner.nextDouble();

        // Solicitando e lendo a nota da API
        System.out.print("Digite a nota da API (0 a 10): ");
        double notaAPI = scanner.nextDouble();

        // Solicitando e lendo os pontos extras
        System.out.print("Digite a nota dos pontos extras (0 a 10): ");
        double X = scanner.nextDouble();

        // Verificando se as notas estão no intervalo válido
        if (notaProva1 < 0 || notaProva1 > 10 || notaExercicio1 < 0 || notaExercicio1 > 10
                || notaExercicio2 < 0 || notaExercicio2 > 10 || notaAPI < 0 || notaAPI > 10) {
            System.out.println("As notas devem estar no intervalo de 0 a 10.");
            return; // Encerra o programa
        }

        // Calculando a média das notas
        double media = ((notaProva1 * 0.6 + ((notaExercicio1 + notaExercicio2) / 2) * 0.4)
                * 0.5 + (Math.max(((notaProva1 * 0.6 + ((notaExercicio1 + notaExercicio2)/2)
                *0.4) - 5.9),0)/(notaProva1 * 0.6 + ((notaExercicio1 + notaExercicio2)/2)*0.4)
                -5.9)) * (notaAPI + 0.5) + X;


        System.out.println("A média de LP1 deste semestre é: " + media);

        if (media > 4.0 & media < 6.0) {
            System.out.println("Aluno apto para prova substitutiva.");
        } else if (media < 4.0) {
            System.out.println("Aluno reprovado por nota.");
        }
        // Fechando o scanner
        scanner.close();
    }
}
