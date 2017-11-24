package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pergunta1 extends AppCompatActivity {

    private int eua;
    private int inglaterra;
    private int australia;
    private int novaZelandia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_1);


    }

    //Criar objeto contador com as quatro variáveis dos países e ir somando a cada questão, depois
    // só comparar qual é maior e mostrar o resultado

    public void proxima2(View v) {

        switch (v.getId()){
            case R.id.bt_p1a:
                novaZelandia = 1;
                break;
            case R.id.bt_p1b:
                australia = 1;
                break;
            case R.id.bt_p1c:
                inglaterra = 1;
                break;
            case R.id.bt_p1d:
                eua = 1;
                break;
        }

        Intent pergunta2 = new Intent(getApplicationContext(), Pergunta2.class);

        pergunta2.putExtra("eua", eua);
        pergunta2.putExtra("inglaterra", inglaterra);
        pergunta2.putExtra("australia", australia);
        pergunta2.putExtra("novaZelandia", novaZelandia);

        startActivity(pergunta2);
    }
}
