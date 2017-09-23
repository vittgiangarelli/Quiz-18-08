package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pergunta_10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_10);

        //textoResultado = (TextView)findViewById(R.id.textoResultado);

        //String resultado = getIntent().getStringExtra("resultado");

        //textoResultado.setText(resultado);
    }

    public void proxima11(View v) {

        Intent Pergunta_10 = new Intent(this, Pergunta_10.class);

        //String resultado = "Seu nome é " + editNome.getText() + " " + " Sua idade é " + " " + editIdade.getText();

        //Pergunta_2.putExtra("resultado", resultado);

        startActivity(Pergunta_10);
    }
}
