package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Pergunta3 extends AppCompatActivity {

    private int resultadoParcial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_3);

        resultadoParcial = getIntent().getIntExtra("resultado", 0);
    }

    public void proxima4(View v) {

        switch (v.getId()){
            case R.id.bt_p3a:
                resultadoParcial += 1;
                break;
            case R.id.bt_p3b:
                resultadoParcial += 3;
                break;
            case R.id.bt_p3c:
                resultadoParcial += 2;
                break;
            case R.id.bt_p3d:
                resultadoParcial += 4;
                break;
        }

        Intent pergunta4 = new Intent(getApplicationContext(), Pergunta4.class);

        pergunta4.putExtra("resultado", resultadoParcial);

        startActivity(pergunta4);
    }
}
