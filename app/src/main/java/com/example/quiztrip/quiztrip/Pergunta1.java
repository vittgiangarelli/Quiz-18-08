package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.quiztrip.quiztrip.domain.PontuacaoPaises;

public class Pergunta1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_1);
    }

    public void proxima2(View v) {

        PontuacaoPaises.votar(v.getTag().toString());

        Intent pergunta2 = new Intent(getApplicationContext(), Pergunta2.class);

        startActivity(pergunta2);
    }
}
