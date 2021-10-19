module com.company.conversordetemperatura {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.company.conversordetemperatura to javafx.fxml;
    exports com.company.conversordetemperatura;
}