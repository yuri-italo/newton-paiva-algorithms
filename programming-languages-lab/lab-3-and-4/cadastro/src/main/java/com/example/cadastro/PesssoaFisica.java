package com.example.cadastro;

public class PesssoaFisica {
    private Integer numeroRegistro;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String telefone;
    private String dataDeNascimento;

    public PesssoaFisica() {
    }

    public PesssoaFisica(Integer numeroRegistro, String nomeCompleto, String cpf, String email, String telefone, String dataDeNascimento) {
        this.numeroRegistro = numeroRegistro;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Integer getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(Integer numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }


    @Override
    public String toString() {
        return "PesssoaFisica{" +
                "numeroRegistro=" + numeroRegistro +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", cpf=" + cpf +
                ", email='" + email + '\'' +
                ", telefone=" + telefone +
                ", dataDeNascimento=" + dataDeNascimento +
                '}';
    }
}
