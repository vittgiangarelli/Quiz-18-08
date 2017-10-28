package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pergunta5 extends AppCompatActivity {

    private int resultadoParcial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_5);

        resultadoParcial = getIntent().getIntExtra("resultado", 0);
    }

    public void proxima6(View v) {

        switch (v.getId()){
            case R.id.bt_p5a:
                resultadoParcial += 1;
                break;
            case R.id.bt_p5b:
                resultadoParcial += 2;
                break;
            case R.id.bt_p5c:
                resultadoParcial += 3;
                break;
            case R.id.bt_p5d:
                resultadoParcial += 4;
                break;
        }

        Intent pergunta6 = new Intent(getApplicationContext(), Pergunta6.class);

        pergunta6.putExtra("resultado", resultadoParcial);

        startActivity(pergunta6);
    }
}
