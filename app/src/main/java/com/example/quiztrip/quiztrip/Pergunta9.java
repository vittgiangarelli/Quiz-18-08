package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.quiztrip.quiztrip.domain.PontuacaoPaises;

public class Pergunta9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_9);
    }

    public void proxima10(View v) {

        PontuacaoPaises.votar(v.getTag().toString());

        Intent pergunta10 = new Intent(getApplicationContext(), Pergunta10.class);

        startActivity(pergunta10);
    }
}
