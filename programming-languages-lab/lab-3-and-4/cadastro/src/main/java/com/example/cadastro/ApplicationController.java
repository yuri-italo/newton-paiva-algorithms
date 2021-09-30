package com.example.cadastro;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ApplicationController implements Initializable {
    List<PesssoaFisica> cadastro = new ArrayList<>();
    int numeroDeCadastros = 0;
    int posicao = -1;

    @FXML
    protected Label lblNumeroDeCadastros;
    @FXML
    protected Label lblRegistro;

    @FXML
    protected Label lblMensagem;

    @FXML
    private Label lblNumeroRegistro;

    @FXML
    private TextField txtNomeCompleto;

    @FXML
    private TextField txtCpf;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtTelefone;

    @FXML
    private TextField txtDataDeNascimento;

    @FXML
    private Button btVoltar;

    @FXML
    private Button btAvancar;

    @FXML
    private Button btSalvar;

    @FXML
    private Button btExcluir;

    @FXML
    public void onBtVoltarAction() {
        lblMensagem.setText("");
        if (posicao != -1) {
            posicao--;
            selecionar();
        }

        if (posicao == cadastro.size()-2)
            btAvancar.setDisable(false);

        if (posicao == -1) {
            lblRegistro.setVisible(false);
            lblMensagem.setText("Cadastre um usuário.");
            desbloquearCampos();
            selecionar();
            btVoltar.setDisable(true);
            btAvancar.setDisable(false);
            btSalvar.setDisable(false);
            btExcluir.setDisable(true);
        }

    }

    @FXML
    public void onBtAvancarAction() {
        lblRegistro.setVisible(true);
        lblMensagem.setText("");
        bloquearCampos();

        if (posicao < cadastro.size() -1) {
            ++posicao;
            selecionar();
        }

        btVoltar.setDisable(false);
        btExcluir.setDisable(false);
        btSalvar.setDisable(true);

        if (posicao == cadastro.size()-1)
            btAvancar.setDisable(true);
    }

    @FXML
    public void onBtSalvarAction() {
        lblMensagem.setText("Clique em Avançar para visualizar os cadastros.");
        cadastro.add(new PesssoaFisica(++numeroDeCadastros,txtNomeCompleto.getText(),txtCpf.getText(),
                txtEmail.getText(),txtTelefone.getText(), txtDataDeNascimento.getText()));

        lblNumeroDeCadastros.setText("Número de cadastros (" + cadastro.size() + ")");

        txtNomeCompleto.clear();
        txtCpf.clear();
        txtEmail.clear();
        txtTelefone.clear();
        txtDataDeNascimento.clear();

        btAvancar.setDisable(false);
    }

    @FXML
    public void onBtExcluirAction() {
        --posicao;
        selecionar();
        cadastro.remove(posicao + 1);
        lblMensagem.setText("Usuário excluído com sucesso.");

        if (posicao == -1) {
            lblRegistro.setVisible(false);
            lblMensagem.setText("Cadastre um usuário.");
            desbloquearCampos();
            btVoltar.setDisable(true);
            btSalvar.setDisable(false);
            btExcluir.setDisable(true);
        }

        lblNumeroDeCadastros.setText("Número de cadastros (" + cadastro.size() + ")");
    }

    private void selecionar() {
        if (posicao != -1) {
            lblNumeroRegistro.setText(String.valueOf(cadastro.get(posicao).getNumeroRegistro()));
            txtNomeCompleto.setText(cadastro.get(posicao).getNomeCompleto());
            txtCpf.setText(String.valueOf(cadastro.get(posicao).getCpf()));
            txtEmail.setText(cadastro.get(posicao).getEmail());
            txtTelefone.setText(String.valueOf(cadastro.get(posicao).getTelefone()));
            txtDataDeNascimento.setText(cadastro.get(posicao).getDataDeNascimento());
        } else
            selecionarCadastro();
    }

    private void selecionarCadastro() {
        lblNumeroRegistro.setText("");
        txtNomeCompleto.clear();
        txtCpf.clear();
        txtEmail.clear();
        txtTelefone.clear();
        txtDataDeNascimento.clear();
    }

    private void bloquearCampos() {
        txtNomeCompleto.setDisable(true);
        txtCpf.setDisable(true);
        txtEmail.setDisable(true);
        txtTelefone.setDisable(true);
        txtDataDeNascimento.setDisable(true);
    }

    private void desbloquearCampos() {
        txtNomeCompleto.setDisable(false);
        txtCpf.setDisable(false);
        txtEmail.setDisable(false);
        txtTelefone.setDisable(false);
        txtDataDeNascimento.setDisable(false);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblRegistro.setVisible(false);
        btAvancar.setDisable(true);
        btExcluir.setDisable(true);
        btVoltar.setDisable(true);
        lblMensagem.setText("Cadastre um usuário.");
    }
}