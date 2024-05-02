module atividades_lp.tarefa_lp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.management;
    requires java.desktop;

    opens atividades_lp.tarefa_lp to javafx.fxml;
    exports atividades_lp.tarefa_lp;
}