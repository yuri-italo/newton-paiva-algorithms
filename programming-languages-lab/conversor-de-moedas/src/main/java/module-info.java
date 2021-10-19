module com.newton.conversordemoedas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.newton.conversordemoedas to javafx.fxml;
    exports com.newton.conversordemoedas;
}