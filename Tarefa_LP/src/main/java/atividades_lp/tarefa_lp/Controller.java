package atividades_lp.tarefa_lp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField modeloTextField;
    @FXML
    private TextField corTextField;
    @FXML
    private TextField capacidadeTextField;

    @FXML
    private Button criarObjetoCarro;

    @FXML
    private ListView<String> carroListView;
    private ObservableList<String> carroNames = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        criarObjetoCarro.setOnAction(event -> {
            String modelo = modeloTextField.getText();
            String cor = corTextField.getText();
            String capacidadeStr = capacidadeTextField.getText();

            try {
                int capacidade = Integer.parseInt(capacidadeStr);

                Carro carro = new Carro(modelo, cor, capacidade);

                // Adicionar o carro à lista interna (supondo que setListCarro() adicione a uma lista interna na classe Carro)
                carro.setListCarro();

                // Aqui estamos presumindo que `carro.toString()` está corretamente implementado para exibir informações do carro
                String carroInfo = carro.toString();
                // Suponha que carro.aprovado() retorne um booleano indicando se o carro está aprovado
                boolean isAprovado = carro.aprovado();

                String statusAprovacao = isAprovado ? "Aprovado" : "Não Aprovado";
                carroNames.add("Carro " + carroNames.size() + ": " + carroInfo + " | " + statusAprovacao);

                carroListView.setItems(carroNames);

            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, insira um número válido para a capacidade.");
            }
        });
    }
}

