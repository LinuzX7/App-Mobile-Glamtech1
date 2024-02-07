package com.linojr.glamtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Formlogin extends AppCompatActivity {
    private TextView text_tela_cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formlogin);
        getSupportActionBar().hide();
        IniciarComponets();
        text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Formlogin.this,FormCadastro.class);
                startActivity(intent);

            }
        });
    }


    private void IniciarComponets(){
        text_tela_cadastro =findViewById(R.id.text_tela_cadastro);
    }

}