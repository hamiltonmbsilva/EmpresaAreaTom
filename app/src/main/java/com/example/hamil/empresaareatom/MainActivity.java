package com.example.hamil.empresaareatom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button entrar;
    final  int Tela_login = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding();

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itn = new Intent(getApplicationContext(),LoginActivity.class);

                startActivityForResult(itn,Tela_login);
            }
        });
    }

    private void binding() {
        entrar = findViewById(R.id.mainBotaoEntrarId);
    }
}
