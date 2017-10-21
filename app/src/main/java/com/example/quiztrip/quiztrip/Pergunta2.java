package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Pergunta2 extends AppCompatActivity {

    int resultado2;
    TextView textoResultado;
    int vlrPuxado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_2);

        textoResultado = (TextView)findViewById(R.id.textView); //TESTE

        vlrPuxado = getIntent().getIntExtra("resultado", 0);
        resultado2 = vlrPuxado;
        //Toast.makeText(this, String.valueOf(vlrPuxado) , Toast.LENGTH_SHORT).show();

        //textoResultado.setText(resultado+"");
    }

    public void proxima3(View v) {

        switch (v.getId()){
            case R.id.button6:
                resultado2 += 1;
                break;
            case R.id.button7:
                resultado2 += 2;
                break;
            case R.id.button8:
                resultado2 += 3;
                break;
            case R.id.button9:
                resultado2 += 4;
                break;
        }


        Intent pergunta3 = new Intent(getApplicationContext(), Pergunta3.class);

        pergunta3.putExtra("resultado", resultado2);

        startActivity(pergunta3);
    }
}
