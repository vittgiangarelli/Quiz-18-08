package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.quiztrip.quiztrip.domain.PontuacaoPaises;

public class Pergunta10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_10);
    }

    public void pagDestino(View v) {

        PontuacaoPaises.votar(v.getTag().toString());

        Intent destino = new Intent(getApplicationContext(), Destino.class);

        startActivity(destino);
    }
}
