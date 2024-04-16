import java.util.Scanner;

public class Celular {
    // Atributos da classe
    private String fabricante;
    private int armazenamentoInterno; // em GB
    private int memoriaRAM; // em GB

    // Construtor padrão
    public Celular() {
        this.fabricante = "Desconhecido";
        this.armazenamentoInterno = 0;
        this.memoriaRAM = 0;
    }

    // Métodos getters e setters
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getArmazenamentoInterno() {
        return armazenamentoInterno;
    }

    public void setArmazenamentoInterno(int armazenamentoInterno) {
        this.armazenamentoInterno = armazenamentoInterno;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    // Método para preenchimento dos dados do celular
    public void preencherDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o fabricante do celular: ");
        this.fabricante = scanner.nextLine();

        System.out.print("Digite o armazenamento interno do celular (GB): ");
        this.armazenamentoInterno = scanner.nextInt();

        System.out.print("Digite a memória RAM do celular (GB): ");
        this.memoriaRAM = scanner.nextInt();

        scanner.close();
    }

    // Método para imprimir os detalhes do celular
    public void imprimirDetalhes() {
        System.out.println("Detalhes do Celular:");
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Armazenamento Interno: " + armazenamentoInterno + " GB");
        System.out.println("Memória RAM: " + memoriaRAM + " GB");
    }

    public static void main(String[] args) {
        Celular meuCelular = new Celular();
        meuCelular.preencherDados();
        meuCelular.imprimirDetalhes();
    }
}
