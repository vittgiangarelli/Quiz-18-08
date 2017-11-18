package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pergunta4 extends AppCompatActivity {

    private int resultadoParcial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_4);

        resultadoParcial = getIntent().getIntExtra("resultado", 0);
    }

    public void proxima5(View v) {

        switch (v.getId()){
            case R.id.bt_p4a:
                resultadoParcial += 4;
                break;
            case R.id.bt_p4b:
                resultadoParcial += 1;
                break;
            case R.id.bt_p4c:
                resultadoParcial += 2;
                break;
            case R.id.bt_p4d:
                resultadoParcial += 3;
                break;
        }

        Intent pergunta5 = new Intent(getApplicationContext(), Pergunta5.class);

        pergunta5.putExtra("resultado", resultadoParcial);

        startActivity(pergunta5);
    }
}
