package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        btn1 = (Button)findViewById(R.id.btnIniciar1);
//        btn1.setLayoutParams(new ConstraintLayout.LayoutParams(
//                ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT));


    }

    public void proxima(View v) {

        Intent pergunta1 = new Intent(getApplicationContext(), Pergunta1.class);

        //String resultado = "Seu nome é " + editNome.getText() + " " + " Sua idade é " + " " + editIdade.getText();

        //Pergunta2.putExtra("resultado", resultado);

        startActivity(pergunta1);
    }


}
