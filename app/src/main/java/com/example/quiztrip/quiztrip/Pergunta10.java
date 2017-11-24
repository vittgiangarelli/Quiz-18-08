package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pergunta10 extends AppCompatActivity {

    private int eua;
    private int inglaterra;
    private int australia;
    private int novaZelandia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_10);

        eua = getIntent().getIntExtra("eua", 0);
        inglaterra = getIntent().getIntExtra("inglaterra", 0);
        australia = getIntent().getIntExtra("australia", 0);
        novaZelandia = getIntent().getIntExtra("novaZelandia", 0);
    }

    public void pagDestino(View v) {

        switch (v.getId()){
            case R.id.bt_p10a:
                novaZelandia += 1;
                break;
            case R.id.bt_p10b:
                eua += 1;
                break;
            case R.id.bt_p10c:
                australia += 1;
                break;
            case R.id.bt_p10d:
                inglaterra += 1;
                break;
        }

        Intent destino = new Intent(getApplicationContext(), Destino.class);

        destino.putExtra("eua", eua);
        destino.putExtra("inglaterra", inglaterra);
        destino.putExtra("australia", australia);
        destino.putExtra("novaZelandia", novaZelandia);

        startActivity(destino);
    }
}
