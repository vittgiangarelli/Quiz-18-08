package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Pergunta10 extends AppCompatActivity {

    private int resultadoParcial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_10);

        resultadoParcial = getIntent().getIntExtra("resultado", 0);
    }

    public void pagDestino(View v) {

        switch (v.getId()){
            case R.id.bt_p10a:
                resultadoParcial += 4;
                break;
            case R.id.bt_p10b:
                resultadoParcial += 1;
                break;
            case R.id.bt_p10c:
                resultadoParcial += 3;
                break;
            case R.id.bt_p10d:
                resultadoParcial += 2;
                break;
        }

        Intent destino = new Intent(getApplicationContext(), Destino.class);

        destino.putExtra("resultado", resultadoParcial);

        startActivity(destino);
    }
}
