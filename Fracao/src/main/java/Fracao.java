public class Fracao {
    private int numerador;
    private int denominador;

    // Construtor
    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        if (denominador == 0) {
            throw new IllegalArgumentException("Denominador não pode ser zero.");
        }
        this.denominador = denominador;
    }

    // Métodos para realizar operações
    public Fracao somar(Fracao outra) {
        int novoNumerador = this.numerador * outra.denominador + outra.numerador * this.denominador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao subtrair(Fracao outra) {
        int novoNumerador = this.numerador * outra.denominador - outra.numerador * this.denominador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao multiplicar(Fracao outra) {
        return new Fracao(this.numerador * outra.numerador, this.denominador * outra.denominador);
    }

    public Fracao dividir(Fracao outra) {
        return new Fracao(this.numerador * outra.denominador, this.denominador * outra.numerador);
    }

    // Método para simplificar frações
    private void simplificar() {
        int gcd = gcd(this.numerador, this.denominador);
        this.numerador /= gcd;
        this.denominador /= gcd;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    @Override
    public String toString() {
        simplificar();
        return numerador + "/" + denominador;
    }
}
