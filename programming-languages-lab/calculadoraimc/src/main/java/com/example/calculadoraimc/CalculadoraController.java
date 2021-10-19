package com.example.calculadoraimc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculadoraController {
    @FXML
    private TextField txtAltura;

    @FXML
    private TextField txtPeso;

    @FXML
    private Button btCalcular;

    @FXML
    private Button btLimpar;

    @FXML
    private Label lblIMC;

    @FXML
    private Label lblCategoria;

    @FXML
    private Label lblErro;

    @FXML
    public void onBtCalcularAction() {
        try {
            lblErro.setText("");
            lblIMC.setText(String.format("%.2f",calcularIMC(Float.parseFloat(txtAltura.getText()),Float.parseFloat(txtPeso.getText()))));
            descobrirCategoria(Float.parseFloat(lblIMC.getText()));
        } catch (NumberFormatException e) {
            lblErro.setText("Entrada inválida");
            lblIMC.setText("");
            lblCategoria.setText("");
        }

    }

    @FXML
    public void onBtLimparAction() {
        limparCampos();
    }

    private double calcularIMC(float altura, float peso) {
        return peso / (altura*altura);
    }

    private void descobrirCategoria(float peso) {
        if (Float.parseFloat(lblIMC.getText()) < 18.5)
            lblCategoria.setText("MAGREZA");
        else if (Float.parseFloat(lblIMC.getText()) <= 24.9)
            lblCategoria.setText("NORMAL");
        else if (Float.parseFloat(lblIMC.getText()) <= 29.9)
            lblCategoria.setText("SOBREPESO");
        else if (Float.parseFloat(lblIMC.getText()) <= 39.9)
            lblCategoria.setText("OBESIDADE");
        else
            lblCategoria.setText("OBESIDADE GRAVE");
    }

    private void limparCampos() {
        txtAltura.setText("");
        txtPeso.setText("");
        lblIMC.setText("");
        lblCategoria.setText("");
        lblErro.setText("");
    }
}