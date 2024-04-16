import java.util.Scanner;

public class Robos {
    // Atributos da classe
    private String fabricante;
    private double payload; // em kg
    private double raioAlcance; // em metros

    // Construtor padrão
    public Robos() {
        this.fabricante = "Desconhecido";
        this.payload = 0.0;
        this.raioAlcance = 0.0;
    }

    // Métodos getters e setters
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    public double getRaioAlcance() {
        return raioAlcance;
    }

    public void setRaioAlcance(double raioAlcance) {
        this.raioAlcance = raioAlcance;
    }

    // Método para preenchimento dos dados do robô
    public void preencherDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o fabricante do robô: ");
        this.fabricante = scanner.nextLine();

        System.out.print("Digite a carga útil do robô (em kg): ");
        this.payload = scanner.nextDouble();

        System.out.print("Digite o raio de alcance do robô (em metros): ");
        this.raioAlcance = scanner.nextDouble();

        scanner.close();
    }

    // Método para imprimir os detalhes do robô
    public void imprimirDetalhes() {
        System.out.println("Detalhes do Robô:");
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Carga Útil: " + payload + " kg");
        System.out.println("Raio de Alcance: " + raioAlcance + " metros");
    }

    public static void main(String[] args) {
        Robos meuRobo = new Robos();
        meuRobo.preencherDados();
        meuRobo.imprimirDetalhes();
    }
}

