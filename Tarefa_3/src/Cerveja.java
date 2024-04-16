import java.util.Scanner;

public class Cerveja {
    // Atributos da classe
    private String tipo;
    private double teorAlcoolico; // em percentual
    private String fabricante;

    // Construtor padrão
    public Cerveja() {
        this.tipo = "Desconhecido";
        this.teorAlcoolico = 0.0;
        this.fabricante = "Desconhecido";
    }

    // Métodos getters e setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    // Método para preenchimento dos dados da cerveja
    public void preencherDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tipo da cerveja (ex: IPA, Weiss, Pilsen, Lager): ");
        this.tipo = scanner.nextLine();

        System.out.print("Digite o teor alcoólico da cerveja (%): ");
        this.teorAlcoolico = scanner.nextDouble();

        scanner.nextLine(); // Consumir nova linha restante

        System.out.print("Digite o fabricante da cerveja: ");
        this.fabricante = scanner.nextLine();

        scanner.close();
    }

    // Método para imprimir os detalhes da cerveja
    public void imprimirDetalhes() {
        System.out.println("Detalhes da Cerveja:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Teor Alcoólico: " + teorAlcoolico + "%");
        System.out.println("Fabricante: " + fabricante);
    }

    public static void main(String[] args) {
        Cerveja minhaCerveja = new Cerveja();
        minhaCerveja.preencherDados();
        minhaCerveja.imprimirDetalhes();
    }
}

