package com.example.hamil.empresaareatom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Date;

public class PagamentoActivity extends AppCompatActivity {
    CheckBox credito, debito;
    TextView nomeTitular, numeroCartao, codigoCartao,  validadeCartao, valorCartao;
    Spinner parcelas;

    Button botaoFinalizarCompra;
    final int Tela_Passagem = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento);

        binding();

        botaoFinalizarCompra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itn = new Intent(getApplicationContext(), PassagemActivity.class);

                startActivityForResult(itn, Tela_Passagem);
            }
        });

    }

    private void binding() {
        credito = findViewById(R.id.checkBoxCreditoId);
        debito = findViewById(R.id.checkBoxDebitoId);
        nomeTitular = findViewById(R.id.pagamentoNomeId);
        numeroCartao = findViewById(R.id.pagamentoNumeroCartaoId);
        codigoCartao = findViewById(R.id.pagamentoCodigoCartaoId);
        valorCartao = findViewById(R.id.pagamentoValorCartaoId);
        validadeCartao = findViewById(R.id.pagamentoDataValidadeCartaoId);
        parcelas = findViewById(R.id.pagementoSpinnerParcelasId);
        botaoFinalizarCompra = findViewById(R.id.botaoFinalizarPagamentoId);

    }
}
