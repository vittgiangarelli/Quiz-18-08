package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Pergunta2 extends AppCompatActivity {

    private int resultadoParcial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_2);

        resultadoParcial = getIntent().getIntExtra("resultado", 0);
    }

    public void proxima3(View v) {

        switch (v.getId()){
            case R.id.bt_p2a:
                resultadoParcial += 2;
                break;
            case R.id.bt_p2b:
                resultadoParcial += 1;
                break;
            case R.id.bt_p2c:
                resultadoParcial += 4;
                break;
            case R.id.bt_p2d:
                resultadoParcial += 3;
                break;
        }


        Intent pergunta3 = new Intent(getApplicationContext(), Pergunta3.class);

        pergunta3.putExtra("resultado", resultadoParcial);

        startActivity(pergunta3);
    }
}
