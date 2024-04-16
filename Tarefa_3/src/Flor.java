import java.util.Scanner;

public class Flor {
    // Atributos da classe
    private String cor;
    private String tipo;
    private String cheiro;
    private String formato;

    // Construtor padrão
    public Flor() {
        this.cor = "Desconhecida";
        this.tipo = "Desconhecido";
        this.cheiro = "Desconhecido";
        this.formato = "Desconhecido";
    }

    // Métodos getters e setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCheiro() {
        return cheiro;
    }

    public void setCheiro(String cheiro) {
        this.cheiro = cheiro;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    // Método para preenchimento dos dados da flor
    public void preencherDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cor da flor: ");
        this.cor = scanner.nextLine();

        System.out.print("Digite o tipo da flor: ");
        this.tipo = scanner.nextLine();

        System.out.print("Digite o cheiro da flor: ");
        this.cheiro = scanner.nextLine();

        System.out.print("Digite o formato da flor: ");
        this.formato = scanner.nextLine();

        scanner.close();
    }
    // Método para imprimir os detalhes da flor
    public void imprimirDetalhes() {
        System.out.println("Detalhes da Flor:");
        System.out.println("Cor: " + cor);
        System.out.println("Tipo: " + tipo);
        System.out.println("Cheiro: " + cheiro);
        System.out.println("Formato: " + formato);
    }
    public static void main(String[] args) {
        Flor minhaFlor = new Flor();
        minhaFlor.preencherDados();
        minhaFlor.imprimirDetalhes();
    }
}

