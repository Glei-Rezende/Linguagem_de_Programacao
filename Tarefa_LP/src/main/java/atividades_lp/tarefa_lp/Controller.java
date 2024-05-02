package atividades_lp.tarefa_lp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;

public class Controller {
    //carro
    @FXML
    private Button cadastrarcarro;
    @FXML
    private TextField fabricantecarro;
    @FXML
    private TextField modelocarro;
    @FXML
    private TextField corcarro;
    @FXML
    private ListView<String> carroListView;
    @FXML
    private ObservableList<String> carroLista = FXCollections.observableArrayList();
    //moto
    @FXML
    private Button cadastrarmoto;
    @FXML
    private TextField fabricantemoto;
    @FXML
    private TextField modelomoto;
    @FXML
    private TextField cormoto;
    @FXML
    private ListView<String> motoListView;
    @FXML
    private ObservableList<String> motoLista = FXCollections.observableArrayList();
    //celular
    @FXML
    private Button cadastrarcelular;
    @FXML
    private TextField fabricantecelular;
    @FXML
    private TextField numerocameracelular;
    @FXML
    private TextField capacidadecelular;
    @FXML
    private ListView<String> celularListView;
    @FXML
    private ObservableList<String> celularLista = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        cadastrarcarro.setOnAction(event -> {
            String fabricante = fabricantecarro.getText();
            String modelo = modelocarro.getText();
            String cor = corcarro.getText();

            //Criar um novo objeto Carro
            Carro carro = new Carro(fabricante, modelo, cor);

            //Adicione o carro a lista
            carro.setListCarro();

            //Adicionar o carro a lista
            carroLista.add("Carro " + carroLista.size() + ": " + carro.toString());

            //Atualizar a lista na interface do usuario
            carroListView.setItems(carroLista);
        });
        cadastrarmoto.setOnAction(event -> {
            //Obter os valores inseridos pelo usuario
            String fabricante = fabricantemoto.getText();
            String modelo = modelomoto.getText();
            String cor = cormoto.getText();

            //Criar um novo objeto moto
            Moto moto = new Moto(fabricante, modelo, cor);

            //Adiciona a moto a lista
            moto.setListMoto();

            //Adicionar a moto a lista
            motoLista.add("Moto " + motoLista.size() + ": " + moto.toString());

            //Atualizar a lista na interface do usuario
            motoListView.setItems(motoLista);
        });
        cadastrarcelular.setOnAction(event -> {
            //Obter os valores inseridos pelo usuario
            String fabricante = fabricantecelular.getText();
            String numerocamera = numerocameracelular.getText();
            String capacidade = capacidadecelular.getText();

            //Criar um novo objeto Celular
            Celular celular = new Celular(fabricante, numerocamera, capacidade);

            //Adicionar o celular a lista
            celularLista.add("Celular " + celularLista.size() + ":" + celular.toString());

            //Atualizar a lista na interface do usuario
            celularListView.setItems(celularLista);

        });
    }
}