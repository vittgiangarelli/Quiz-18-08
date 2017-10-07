package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pergunta1 extends AppCompatActivity {

    int resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_1);


    }

    public void proxima2(View v) {

        switch (v.getId()){
            case R.id.button2:
                resultado = 1;
                break;
            case R.id.button3:
                resultado = 2;
                break;
            case R.id.button4:
                resultado = 3;
                break;
            case R.id.button5:
                resultado = 4;
                break;
        }

        Intent pergunta2 = new Intent(getApplicationContext(), Pergunta2.class);



        pergunta2.putExtra("resultado", resultado);

        startActivity(pergunta2);
    }
}
