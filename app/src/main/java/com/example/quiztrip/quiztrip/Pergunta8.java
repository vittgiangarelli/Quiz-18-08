package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pergunta8 extends AppCompatActivity {

    private int resultadoParcial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_8);

        resultadoParcial = getIntent().getIntExtra("resultado", 0);
    }

    public void proxima9(View v) {

        switch (v.getId()){
            case R.id.bt_p8a:
                resultadoParcial += 1;
                break;
            case R.id.bt_p8b:
                resultadoParcial += 2;
                break;
            case R.id.bt_p8c:
                resultadoParcial += 3;
                break;
            case R.id.bt_p8d:
                resultadoParcial += 4;
                break;
        }

        Intent pergunta9 = new Intent(getApplicationContext(), Pergunta9.class);

        pergunta9.putExtra("resultado", resultadoParcial);

        startActivity(pergunta9);
    }
}
