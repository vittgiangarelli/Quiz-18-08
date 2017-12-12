package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.quiztrip.quiztrip.domain.PontuacaoPaises;

public class Pergunta8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_8);
    }

    public void proxima9(View v) {

        PontuacaoPaises.votar(v.getTag().toString());

        Intent pergunta9 = new Intent(getApplicationContext(), Pergunta9.class);

        startActivity(pergunta9);
    }
}
