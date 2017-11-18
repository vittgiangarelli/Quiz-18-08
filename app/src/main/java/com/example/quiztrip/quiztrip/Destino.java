package com.example.quiztrip.quiztrip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Destino extends AppCompatActivity {

    int resultadoFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destino);

        resultadoFinal = getIntent().getIntExtra("resultado", 0);
    }
}
