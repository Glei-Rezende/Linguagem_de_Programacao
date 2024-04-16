import java.util.Scanner;

public class Moto {
    // Atributos da classe
    private String fabricante;
    private String cor;
    private int cilindrada;

    // Construtor padrão
    public Moto() {
        this.fabricante = "Desconhecido";
        this.cor = "Desconhecida";
        this.cilindrada = 0;
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

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    // Método para preenchimento dos dados da moto
    public void preencherDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o fabricante da moto: ");
        this.fabricante = scanner.nextLine();

        System.out.print("Digite a cor da moto: ");
        this.cor = scanner.nextLine();

        System.out.print("Digite a cilindrada da moto (em cc): ");
        this.cilindrada = scanner.nextInt();

        scanner.close();
    }

    // Método para imprimir os detalhes da moto
    public void imprimirDetalhes() {
        System.out.println("Detalhes da Moto:");
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Cor: " + cor);
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }

    public static void main(String[] args) {
        Moto minhaMoto = new Moto();
        minhaMoto.preencherDados();
        minhaMoto.imprimirDetalhes();
    }
}

