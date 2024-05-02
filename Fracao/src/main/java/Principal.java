import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numerador primeira fração:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o denominador da primeira fração:");
        int den1 = scanner.nextInt();
        Fracao fracao1 = new Fracao(num1, den1);

        System.out.println("Digite o numerador da segunda fração:");
        int num2 = scanner.nextInt();
        System.out.println("Digite o denominador da primeira fração:");
        int den2 = scanner.nextInt();
        Fracao fracao2 = new Fracao(num2, den2);

        Fracao resultado;

        System.out.println("Escolha a operação (1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão):");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                resultado = fracao1.somar(fracao2);
                System.out.println("Resultado da soma: " + resultado);
                break;
            case 2:
                resultado = fracao1.subtrair(fracao2);
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = fracao1.multiplicar(fracao2);
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                resultado = fracao1.dividir(fracao2);
                System.out.println("Resultado da divisão: " + resultado);
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        scanner.close();
    }
}
