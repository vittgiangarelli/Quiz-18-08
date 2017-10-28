package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pergunta6 extends AppCompatActivity {

    private int resultadoParcial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_6);

        resultadoParcial = getIntent().getIntExtra("resultado", 0);
    }

    public void proxima7(View v) {

        switch (v.getId()){
            case R.id.bt_p6a:
                resultadoParcial += 1;
                break;
            case R.id.bt_p6b:
                resultadoParcial += 2;
                break;
            case R.id.bt_p6c:
                resultadoParcial += 3;
                break;
            case R.id.bt_p6d:
                resultadoParcial += 4;
                break;
        }

        Intent pergunta7 = new Intent(getApplicationContext(), Pergunta7.class);

        pergunta7.putExtra("resultado", resultadoParcial);

        startActivity(pergunta7);
    }
}
