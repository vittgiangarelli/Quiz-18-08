package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pergunta7 extends AppCompatActivity {

    private int resultadoParcial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_7);

        resultadoParcial = getIntent().getIntExtra("resultado", 0);
    }

    public void proxima8(View v) {

        switch (v.getId()){
            case R.id.bt_p7a:
                resultadoParcial += 1;
                break;
            case R.id.bt_p7b:
                resultadoParcial += 2;
                break;
            case R.id.bt_p7c:
                resultadoParcial += 3;
                break;
            case R.id.bt_p7d:
                resultadoParcial += 4;
                break;
        }

        Intent pergunta8 = new Intent(getApplicationContext(), Pergunta8.class);

        pergunta8.putExtra("resultado", resultadoParcial);

        startActivity(pergunta8);
    }
}
