package com.example.hamil.empresaareatom.model;

import java.io.Serializable;
import java.util.Date;

public class Pagamento implements Serializable {

    private int id, numeroCartao, codigo;
    private String nome;
    private Double parcelas, valor;
    private Date validade;

    public Pagamento() {
    }

    public Pagamento(int id, int numeroCartao, int codigo, String nome, Double parcelas, Double valor, Date validade) {
        this.id = id;
        this.numeroCartao = numeroCartao;
        this.codigo = codigo;
        this.nome = nome;
        this.parcelas = parcelas;
        this.valor = valor;
        this.validade = validade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getParcelas() {
        return parcelas;
    }

    public void setParcelas(Double parcelas) {
        this.parcelas = parcelas;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
}
