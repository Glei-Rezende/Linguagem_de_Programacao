import java.util.Scanner;

class Fracao {
    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            throw new IllegalArgumentException("Denominador não pode ser zero.");
        }
    }

    public Fracao somar(Fracao outra) {
        int novoDenominador = this.denominador * outra.denominador;
        int novoNumerador = (this.numerador * outra.denominador) + (outra.numerador * this.denominador);
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao subtrair(Fracao outra) {
        int novoDenominador = this.denominador * outra.denominador;
        int novoNumerador = (this.numerador * outra.denominador) - (outra.numerador * this.denominador);
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao multiplicar(Fracao outra) {
        int novoNumerador = this.numerador * outra.numerador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao dividir(Fracao outra) {
        int novoNumerador = this.numerador * outra.denominador;
        int novoDenominador = this.denominador * outra.numerador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public String toString() {
        return numerador + "/" + denominador;
    }
}

public class CalculadoraDeFracao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numerador da primeira fração:");
        int numerador1 = scanner.nextInt();
        System.out.println("Digite o denominador da primeira fração:");
        int denominador1 = scanner.nextInt();

        System.out.println("Digite o numerador da segunda fração:");
        int numerador2 = scanner.nextInt();
        System.out.println("Digite o denominador da segunda fração:");
        int denominador2 = scanner.nextInt();

        Fracao fracao1 = new Fracao(numerador1, denominador1);
        Fracao fracao2 = new Fracao(numerador2, denominador2);

        System.out.println("Fração 1: " + fracao1);
        System.out.println("Fração 2: " + fracao2);

        Fracao resultadoSoma = fracao1.somar(fracao2);
        System.out.println("Soma: " + resultadoSoma);

        Fracao resultadoSubtracao = fracao1.subtrair(fracao2);
        System.out.println("Subtração: " + resultadoSubtracao);

        Fracao resultadoMultiplicacao = fracao1.multiplicar(fracao2);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);

        Fracao resultadoDivisao = fracao1.dividir(fracao2);
        System.out.println("Divisão: " + resultadoDivisao);

        scanner.close();
    }
}


