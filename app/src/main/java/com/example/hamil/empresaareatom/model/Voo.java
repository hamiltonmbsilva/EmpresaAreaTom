package com.example.hamil.empresaareatom.model;

import java.io.Serializable;
import java.util.Date;

public class Voo implements Serializable {

    private int id, numeroPoltrona;
    private String origem, destino, empresa;
    private Date dataSaida, dataVolta;

    public Voo() {
    }

    public Voo(int id, int numeroPoltrona, String origem, String destino, String empresa, Date dataSaida, Date dataVolta) {
        this.id = id;
        this.numeroPoltrona = numeroPoltrona;
        this.origem = origem;
        this.destino = destino;
        this.empresa = empresa;
        this.dataSaida = dataSaida;
        this.dataVolta = dataVolta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroPoltrona() {
        return numeroPoltrona;
    }

    public void setNumeroPoltrona(int numeroPoltrona) {
        this.numeroPoltrona = numeroPoltrona;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Date getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(Date dataVolta) {
        this.dataVolta = dataVolta;
    }
}
