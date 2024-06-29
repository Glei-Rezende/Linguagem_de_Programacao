package lp.atividade;

import java.util.ArrayList;
import java.util.List;


public class Carro {

    private  String fabricante;
    private  String modelo;
    private  String cor;
    private static List<Carro> listacarro = new ArrayList<>();


    public Carro(String fabricante , String modelo, String cor) {
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

    public String getcor() {
        return cor;
    }

    public void setListCarro() {
        listacarro.add(this); // Adiciona o objeto à lista ao ser criado
    }

    @Override
    public String toString() {
        return "Fabricante: " + fabricante + " | Modelo: " + modelo + " | Cor: " + cor;
    }
}
