package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Pergunta2 extends AppCompatActivity {

    TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_2);

        textoResultado = (TextView)findViewById(R.id.textView); //TESTE

        int resultado = getIntent().getIntExtra("resultado", 0);

        textoResultado.setText(resultado+"");
    }

    public void proxima3(View v) {

        Intent pergunta3 = new Intent(this, Pergunta3.class);

        //String resultado = "Seu nome é " + editNome.getText() + " " + " Sua idade é " + " " + editIdade.getText();

        //Pergunta2.putExtra("resultado", resultado);

        startActivity(pergunta3);
    }
}
