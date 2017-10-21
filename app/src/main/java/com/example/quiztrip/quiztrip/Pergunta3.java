package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Pergunta3 extends AppCompatActivity {

    int resultado3;
    TextView textoResultado;
    int vlrPuxado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_3);

        textoResultado = (TextView)findViewById(R.id.textView);

        vlrPuxado2 = getIntent().getIntExtra("resultado", 0);

        //Toast.makeText(this, String.valueOf(vlrPuxado2) , Toast.LENGTH_SHORT).show();
        resultado3 = vlrPuxado2;
        textoResultado.setText(resultado3+"");
    }

    public void proxima4(View v) {

        Intent pergunta4 = new Intent(getApplicationContext(), Pergunta4.class);

        pergunta4.putExtra("resultado", resultado3);

        startActivity(pergunta4);
    }
}
