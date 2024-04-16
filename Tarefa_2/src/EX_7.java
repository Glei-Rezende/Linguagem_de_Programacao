package linguagem_programacao;


import java.util.Scanner;

public class EX_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do valor
        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        // Verificação e exibição da mensagem
        if (valor > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }

        scanner.close();
    }
}
