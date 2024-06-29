package lp.atividade;

import lp.atividade.Carro; // Certifique-se de que este é o pacote correto
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;

public class HelloController {
    // Carro
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

    @FXML
    public void initialize() {
        cadastrarcarro.setOnAction(event -> {
            String fabricante = fabricantecarro.getText();
            String modelo = modelocarro.getText();
            String cor = corcarro.getText();

            // Criar um novo objeto Carro
            Carro carro = new Carro(fabricante, modelo, cor);

            // Adicionar o carro à lista
            carro.setListCarro();

            // Adicionar o carro à lista observável
            carroLista.add("Carro " + carroLista.size() + ": " + carro.toString());

            // Atualizar a lista na interface do usuário
            carroListView.setItems(carroLista);
        });
    }
}
