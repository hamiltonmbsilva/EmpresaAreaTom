package com.example.hamil.empresaareatom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    
    Button entrar, criarConta, esqueciSenha;
    TextView login, senha;
    final int Tela_Cadastro_usuario = 2;
    final int Tela_Voo = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        binding();
        
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itn = new Intent(getApplicationContext(),VooActivity.class);
                
                startActivityForResult(itn,Tela_Voo);

                String msg = "";

                //UsuarioDAO uDao = new UsuarioDAO(getApplicationContext());
                //uDao.open();
                //Usuario user = uDao.validaLogin(
                        //login.getText().toString(),
                        //senha.getText().toString());
               // uDao.close();
                //if (user != null ){
                    //Intent i = new Intent(getApplicationContext(),
                           // VooActivity.class);
                   // i.putExtra("user",user);

                    //startActivityForResult(i,Tela_Voo);
                    //msg="Logou";
               // }else{
                //    msg="Não Logou";
                //    Toast.makeText(getApplicationContext(),msg,
                //            Toast.LENGTH_LONG).show();
               // }
            }
        });

        criarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itn = new Intent(getApplicationContext(),CadastrarUsuarioActivity.class);

                startActivityForResult(itn, Tela_Cadastro_usuario);
            }
        });
        
    }

    private void binding() {
        entrar =  findViewById(R.id.acessarSistemaBotaoEntrarId);
        criarConta = findViewById(R.id.acessarSistemaBotaoCriarContaId);
        login = findViewById(R.id.acessarSistemaLoginId);
        senha = findViewById(R.id.acessarSistemaSenhaId);
    }
}
