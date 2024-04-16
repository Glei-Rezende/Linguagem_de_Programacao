package linguagem_programacao;

import java.util.Scanner;

public class EX_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da temperatura em Fahrenheit
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        // Conversão para Celsius
        double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9;

        // Exibição do resultado
        System.out.println("\nA temperatura em graus Celsius é: " + temperaturaCelsius + "°C");

        scanner.close();
    }
}
