package com.example.hamil.empresaareatom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;

public class ListaDestinoActivity extends AppCompatActivity {

    Spinner nomeEmpresa;
    ListView listaVoos;
    final int Tela_Poltrona = 8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_destino);

        binding();

        listaVoos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent itn = new Intent(getApplicationContext(),ListaPoltronaActivity.class);

                startActivityForResult(itn,Tela_Poltrona);
            }
        }

        );
    }

    private void binding() {

        nomeEmpresa = findViewById(R.id.destinoSpinnerEmpresaId);
        listaVoos = findViewById(R.id.destinoListaDeVooEmpresaId);

    }
}
