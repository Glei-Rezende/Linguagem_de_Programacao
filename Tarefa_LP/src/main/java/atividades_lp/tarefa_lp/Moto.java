package atividades_lp.tarefa_lp;

import java.util.ArrayList;
import java.util.List;


public class Moto {

    private  String fabricante;
    private  String modelo;
    private  String cor;
    private static List<Moto> listamoto = new ArrayList<>();


    public Moto(String fabricante, String modelo, String cor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setListMoto() {
        listamoto.add(this); // Adiciona o objeto à lista ao ser criado
    }

    @Override
    public String toString() {
        return "Fabricante: " + fabricante + " | Modelo: " + modelo + " | Cor: " + cor;
    }
}
