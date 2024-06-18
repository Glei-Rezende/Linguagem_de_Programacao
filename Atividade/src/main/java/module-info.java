module lp.atividade {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens lp.atividade to javafx.fxml;
    exports lp.atividade;
}