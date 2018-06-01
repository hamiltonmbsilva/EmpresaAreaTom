package com.example.hamil.empresaareatom.model;

import android.provider.ContactsContract;

import java.io.Serializable;

public class Usuario implements Serializable {

    private int id;
    private String nome, login, senha;
    private ContactsContract.CommonDataKinds.Email email;

    public Usuario() {
    }

    public Usuario(int id, String nome, String login, String senha, ContactsContract.CommonDataKinds.Email email) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ContactsContract.CommonDataKinds.Email getEmail() {
        return email;
    }

    public void setEmail(ContactsContract.CommonDataKinds.Email email) {
        this.email = email;
    }
}
