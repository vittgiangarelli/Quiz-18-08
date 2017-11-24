package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pergunta9 extends AppCompatActivity {

    private int eua;
    private int inglaterra;
    private int australia;
    private int novaZelandia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_9);

        eua = getIntent().getIntExtra("eua", 0);
        inglaterra = getIntent().getIntExtra("inglaterra", 0);
        australia = getIntent().getIntExtra("australia", 0);
        novaZelandia = getIntent().getIntExtra("novaZelandia", 0);
    }

    public void proxima10(View v) {

        switch (v.getId()){
            case R.id.bt_p9a:
                eua += 1;
                break;
            case R.id.bt_p9b:
                australia += 1;
                break;
            case R.id.bt_p9c:
                inglaterra += 1;
                break;
            case R.id.bt_p9d:
                novaZelandia += 1;
                break;
        }

        Intent pergunta10 = new Intent(getApplicationContext(), Pergunta10.class);

        pergunta10.putExtra("eua", eua);
        pergunta10.putExtra("inglaterra", inglaterra);
        pergunta10.putExtra("australia", australia);
        pergunta10.putExtra("novaZelandia", novaZelandia);

        startActivity(pergunta10);
    }
}
