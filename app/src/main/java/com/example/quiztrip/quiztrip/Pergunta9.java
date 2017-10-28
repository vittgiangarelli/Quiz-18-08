package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pergunta9 extends AppCompatActivity {

    private int resultadoParcial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_9);

        resultadoParcial = getIntent().getIntExtra("resultado", 0);
    }

    public void proxima10(View v) {

        switch (v.getId()){
            case R.id.bt_p9a:
                resultadoParcial += 1;
                break;
            case R.id.bt_p9b:
                resultadoParcial += 2;
                break;
            case R.id.bt_p9c:
                resultadoParcial += 3;
                break;
            case R.id.bt_p9d:
                resultadoParcial += 4;
                break;
        }

        Intent pergunta10 = new Intent(getApplicationContext(), Pergunta10.class);

        pergunta10.putExtra("resultado", resultadoParcial);

        startActivity(pergunta10);
    }
}
