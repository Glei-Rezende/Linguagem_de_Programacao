public class Animal {
    // Atributos da classe
    private int numeroDePatas;
    private boolean temPelos;
    private boolean temPenas;
    private String mobilidade;

    // Construtor
    public Animal(int numeroDePatas, boolean temPelos, boolean temPenas, String mobilidade) {
        this.numeroDePatas = numeroDePatas;
        this.temPelos = temPelos;
        this.temPenas = temPenas;
        this.mobilidade = mobilidade;
    }

    // Métodos getters e setters
    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public boolean isTemPelos() {
        return temPelos;
    }

    public void setTemPelos(boolean temPelos) {
        this.temPelos = temPelos;
    }

    public boolean isTemPenas() {
        return temPenas;
    }

    public void setTemPenas(boolean temPenas) {
        this.temPenas = temPenas;
    }

    public String getMobilidade() {
        return mobilidade;
    }

    public void setMobilidade(String mobilidade) {
        this.mobilidade = mobilidade;
    }

    // Método para descrever o animal
    public String descrever() {
        return "Animal com " + numeroDePatas + " patas" +
                (temPelos ? ", tem pelos" : "") +
                (temPenas ? ", tem penas" : ", não tem penas") +
                ", e se move por " + mobilidade + ".";
    }

    public static void main(String[] args) {
        Animal cachorro = new Animal(4, true, false, "andar e correr");
        Animal papagaio = new Animal(2, false, true, "voar");

        System.out.println(cachorro.descrever());
        System.out.println(papagaio.descrever());
    }
}
