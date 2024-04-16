package linguagem_programacao;

import java.util.Scanner;

public class EX_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número de horas trabalhadas em um mês e do salário por hora
        System.out.print("Digite o número de horas trabalhadas em um mês: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o salário por hora: R$");
        double salarioPorHora = scanner.nextDouble();

        // Cálculo do salário total
        double salarioTotal;
        if (horasTrabalhadas <= 40 * 4) { // Se o funcionário trabalhou até 40 horas semanais durante o mês
            salarioTotal = horasTrabalhadas * salarioPorHora;
        } else { // Se o funcionário trabalhou mais de 40 horas semanais durante o mês
            int horasExtras = horasTrabalhadas - 40 * 4;
            salarioTotal = (40 * 4 * salarioPorHora) + (horasExtras * salarioPorHora * 1.5);
        }

        // Exibição do salário total
        System.out.println("O salário total do funcionário é: R$" + salarioTotal);

        scanner.close();
    }
}
