package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pergunta5 extends AppCompatActivity {

    private int eua;
    private int inglaterra;
    private int australia;
    private int novaZelandia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_5);

        eua = getIntent().getIntExtra("eua", 0);
        inglaterra = getIntent().getIntExtra("inglaterra", 0);
        australia = getIntent().getIntExtra("australia", 0);
        novaZelandia = getIntent().getIntExtra("novaZelandia", 0);
    }

    public void proxima6(View v) {

        switch (v.getId()){
            case R.id.bt_p5a:
                novaZelandia += 1;
                break;
            case R.id.bt_p5b:
                eua += 1;
                break;
            case R.id.bt_p5c:
                inglaterra += 1;
                break;
            case R.id.bt_p5d:
                australia += 1;
                break;
        }

        Intent pergunta6 = new Intent(getApplicationContext(), Pergunta6.class);

        pergunta6.putExtra("eua", eua);
        pergunta6.putExtra("inglaterra", inglaterra);
        pergunta6.putExtra("australia", australia);
        pergunta6.putExtra("novaZelandia", novaZelandia);

        startActivity(pergunta6);
    }
}
