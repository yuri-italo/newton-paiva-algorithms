package com.company.conversordetemperatura;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ConversorController implements Initializable {
    @FXML
    private TextField txtEntrada;

    @FXML
    private Button btCalcular;

    @FXML
    private Button btLimpar;

    @FXML
    private Label lblFarenheit;

    @FXML
    private Label lblKelvin;

    @FXML
    private Label lblErro;

    @FXML
    public void onBtCalcularAction() {
        lblErro.setVisible(false);
        try {
            float celsius = Float.parseFloat(txtEntrada.getText());
            float farenheit = calcularFarenheit(celsius);
            float kelvin = calcularKelvin(celsius);

            lblFarenheit.setText(String.format("%.2f",farenheit) + "ºF");
            lblKelvin.setText(String.format("%.2f",kelvin) + "K");
        } catch (NumberFormatException e) {
            lblErro.setVisible(true);
        }

    }

    @FXML
    public void onBtLimparAction() {
        txtEntrada.setText("");
        lblFarenheit.setText("");
        lblKelvin.setText("");
        lblErro.setVisible(false);
    }

    private float calcularFarenheit(float celsius) {
        return celsius * 1.8f + 32;
    }

    private float calcularKelvin(float celsius) {
        return celsius + 273.15f;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblErro.setVisible(false);
    }
}