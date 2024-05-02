package atividades_lp.tarefa_lp;

import java.util.ArrayList;
import java.util.List;


public class Celular {

    private  String fabricante;
    private  String numero_camera;
    private  String capacidade;
    private static List<Celular> listacelular = new ArrayList<>();


    public Celular(String fabricante, String numero_camera, String capacidade) {
        this.fabricante = fabricante;
        this.numero_camera = numero_camera;
        this.capacidade = capacidade;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNumero_camera() {
        return numero_camera;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setListCelular() {
        listacelular.add(this); // Adiciona o objeto à lista ao ser criado
    }

    @Override
    public String toString() {
        return "Fabricante: " + fabricante + " | Numero_camera: " + numero_camera + " | Capacidade: " + capacidade;
    }
}