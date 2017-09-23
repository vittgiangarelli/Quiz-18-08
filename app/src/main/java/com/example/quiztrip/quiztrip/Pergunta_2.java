package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Pergunta_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_2);

        //textoResultado = (TextView)findViewById(R.id.textoResultado);

        //String resultado = getIntent().getStringExtra("resultado");

        //textoResultado.setText(resultado);
    }

    public void proxima3(View v) {

        Intent Pergunta_3 = new Intent(this, Pergunta_3.class);

        //String resultado = "Seu nome é " + editNome.getText() + " " + " Sua idade é " + " " + editIdade.getText();

        //Pergunta_2.putExtra("resultado", resultado);

        startActivity(Pergunta_3);
    }
}
