package atividades_lp.tarefa_lp;

import java.util.ArrayList;
import java.util.List;

public class Carro {
    // Atributos
    private String modelo;
    private String cor;
    private int capacidade;
    private static List<Carro> carroList = new ArrayList<>();

    // Construtor
    public Carro(String modelo, String cor, int capacidade) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidade = capacidade;
    }

    // Métodos de acesso
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getCapacidade() {
        return this.capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public void setListCarro() {
        carroList.add(this); // Adiciona o objeto à lista ao ser criado
    }

    // Métodos
    public boolean venda(int saldo) {
        boolean liberado = true;
        if (saldo < 0.0) liberado = false;
        return liberado;
    }
    public boolean manutencao(int liberado) {
        boolean apto = true;
        if (liberado < 1.0) apto = false;
        return apto;
    }

    @Override
    public String toString() {
        return "Moddelo: " + modelo + " | Cor: " + cor + " | Capacidade: " + capacidade + " | ";
    }
}
