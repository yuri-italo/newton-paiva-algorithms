module com.example.cadastro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cadastro to javafx.fxml;
    exports com.example.cadastro;
}