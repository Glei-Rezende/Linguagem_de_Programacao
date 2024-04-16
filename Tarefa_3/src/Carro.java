import java.util.Scanner;

public class Carro {
    // Atributos da classe
    private String fabricante;
    private String cor;
    private String modelo;

    // Construtor padrão
    public Carro() {
        this.fabricante = "";
        this.cor = "";
        this.modelo = "";
    }

    // Métodos getters e setters
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método para preenchimento dos dados do carro
    public void preencherDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o fabricante do carro: ");
        this.fabricante = scanner.nextLine();

        System.out.print("Digite a cor do carro: ");
        this.cor = scanner.nextLine();

        System.out.print("Digite o modelo do carro: ");
        this.modelo = scanner.nextLine();
    }

    // Método para imprimir os detalhes do carro
    public void imprimirDetalhes() {
        System.out.println("Detalhes do carro:");
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.preencherDados();
        meuCarro.imprimirDetalhes();
    }
}
