package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.quiztrip.quiztrip.domain.PontuacaoPaises;

public class Pergunta2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_2);
    }

    public void proxima3(View v) {

        PontuacaoPaises.votar(v.getTag().toString());

        Intent pergunta3 = new Intent(getApplicationContext(), Pergunta3.class);

        startActivity(pergunta3);
    }
}
