package com.newton.conversordemoedas;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ConversorController implements Initializable {
    @FXML
    private TextField txtQuantidade;

    @FXML
    private TextField txtValorDolar;

    @FXML
    private Label lblDolarParaReal;

    @FXML
    private Label lblRealParaDolar;

    @FXML
    private Label lblErro;

    @FXML
    private Button btCalcular;

    @FXML
    private Button btLimpar;

    @FXML
    public void onBtCacularAction() {
        try {
            lblErro.setVisible(false);

            float dolarParaReal = converterDolarParaReal(
                    Float.parseFloat(txtQuantidade.getText()),Float.parseFloat(txtValorDolar.getText())
            );
            lblDolarParaReal.setText("  R$ " + String.format("%.2f",dolarParaReal));

            float realParaDolar = converterRealParaDolar(
                    Float.parseFloat(txtQuantidade.getText()),Float.parseFloat(txtValorDolar.getText())
            );
            lblRealParaDolar.setText("  US$ " + String.format("%.2f",realParaDolar));

        } catch (NumberFormatException e) {
            lblErro.setVisible(true);
        }

    }

    @FXML
    public void onBtLimparAction() {
        limparCampos();
    }

    private float converterDolarParaReal(float valor, float valorDoDolar) {
        return valor * valorDoDolar;
    }

    private float converterRealParaDolar(float valor, float valorDoDolar) {
        return valor / valorDoDolar;
    }

    private void limparCampos() {
        txtQuantidade.clear();
        txtValorDolar.clear();
        lblDolarParaReal.setText("");
        lblRealParaDolar.setText("");
        lblErro.setVisible(false);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblErro.setVisible(false);
    }
}