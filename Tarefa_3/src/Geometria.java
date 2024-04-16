import java.util.Scanner;

public class Geometria {
    // Atributos da classe
    private String formato;
    private int numeroDeLados;

    // Construtor padrão
    public Geometria() {
        this.formato = "Desconhecido";
        this.numeroDeLados = 0;
    }

    // Métodos getters e setters
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getNumeroDeLados() {
        return numeroDeLados;
    }

    public void setNumeroDeLados(int numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
    }

    // Método para preenchimento dos dados da geometria
    public void preencherDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o formato da geometria: ");
        this.formato = scanner.nextLine();

        System.out.print("Digite o número de lados da geometria: ");
        this.numeroDeLados = scanner.nextInt();

        scanner.close();
    }

    // Método para imprimir os detalhes da geometria
    public void imprimirDetalhes() {
        System.out.println("Detalhes da Geometria:");
        System.out.println("Formato: " + formato);
        System.out.println("Número de Lados: " + numeroDeLados);
    }

    public static void main(String[] args) {
        Geometria minhaGeometria = new Geometria();
        minhaGeometria.preencherDados();
        minhaGeometria.imprimirDetalhes();
    }
}

