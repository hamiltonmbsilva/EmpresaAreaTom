package com.example.hamil.empresaareatom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class VooActivity extends AppCompatActivity {

    Spinner origem;
    Button botaDestino, botaoComprarPassagem;
    TextView nomeEmpresa, destino, poltrona, dataSaida, dataVolta;
    final int Tela_Destino = 5;
    final int Tela_Pagamento = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voo);

        binding();

        botaDestino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itn = new Intent(getApplicationContext(), ListaDestinoActivity.class);

                startActivityForResult(itn,Tela_Destino);
            }
        });

        botaoComprarPassagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itn = new Intent(getApplicationContext(),PagamentoActivity.class);

                startActivityForResult(itn, Tela_Pagamento);
            }
        });

    }

    private void binding() {
        origem = findViewById(R.id.spinnerLocalSaidaVooId);
        botaDestino = findViewById(R.id.botaoSelecionarDestinoId);
        nomeEmpresa = findViewById(R.id.vooNomeEmpresaId);
        destino = findViewById(R.id.vooDestinoId);
        poltrona = findViewById(R.id.vooNumeroPoltronaId);
        dataSaida = findViewById(R.id.vooDataDeSaidaId);
        dataVolta = findViewById(R.id.vooDataDeVoltaId);
        botaoComprarPassagem = findViewById(R.id.botaoComprarPassagemId);
    }
}
