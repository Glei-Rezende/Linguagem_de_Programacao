import java.util.Scanner;

public class Pessoas {
    // Atributos da classe
    private String nome;
    private String sexo;
    private double altura;
    private double peso;

    // Construtor padrão
    public Pessoas() {
        this.nome = "Desconhecido";
        this.sexo = "Desconhecido";
        this.altura = 0.0;
        this.peso = 0.0;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método para preenchimento dos dados da pessoa
    public void preencherDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        this.nome = scanner.nextLine();

        System.out.print("Digite o sexo (Masculino/Feminino/Outro): ");
        this.sexo = scanner.nextLine();

        System.out.print("Digite a altura (em metros): ");
        this.altura = scanner.nextDouble();

        System.out.print("Digite o peso (em quilogramas): ");
        this.peso = scanner.nextDouble();

        scanner.close();
    }

    // Método para imprimir os detalhes da pessoa
    public void imprimirDetalhes() {
        System.out.println("Detalhes da Pessoa:");
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");
    }

    public static void main(String[] args) {
        Pessoas pessoa = new Pessoas();
        pessoa.preencherDados();
        pessoa.imprimirDetalhes();
    }
}

