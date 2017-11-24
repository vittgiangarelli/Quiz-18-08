package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pergunta8 extends AppCompatActivity {

    private int eua;
    private int inglaterra;
    private int australia;
    private int novaZelandia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_8);

        eua = getIntent().getIntExtra("eua", 0);
        inglaterra = getIntent().getIntExtra("inglaterra", 0);
        australia = getIntent().getIntExtra("australia", 0);
        novaZelandia = getIntent().getIntExtra("novaZelandia", 0);
    }

    public void proxima9(View v) {

        switch (v.getId()){
            case R.id.bt_p8a:
                australia += 1;
                break;
            case R.id.bt_p8b:
                inglaterra += 1;
                break;
            case R.id.bt_p8c:
                eua += 1;
                break;
            case R.id.bt_p8d:
                novaZelandia += 1;
                break;
        }

        Intent pergunta9 = new Intent(getApplicationContext(), Pergunta9.class);

        pergunta9.putExtra("eua", eua);
        pergunta9.putExtra("inglaterra", inglaterra);
        pergunta9.putExtra("australia", australia);
        pergunta9.putExtra("novaZelandia", novaZelandia);

        startActivity(pergunta9);
    }
}
