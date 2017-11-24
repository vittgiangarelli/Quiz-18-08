package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pergunta7 extends AppCompatActivity {

    private int eua;
    private int inglaterra;
    private int australia;
    private int novaZelandia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_7);

        eua = getIntent().getIntExtra("eua", 0);
        inglaterra = getIntent().getIntExtra("inglaterra", 0);
        australia = getIntent().getIntExtra("australia", 0);
        novaZelandia = getIntent().getIntExtra("novaZelandia", 0);
    }

    public void proxima8(View v) {

        switch (v.getId()){
            case R.id.bt_p7a:
                inglaterra += 1;
                break;
            case R.id.bt_p7b:
                australia += 1;
                break;
            case R.id.bt_p7c:
                novaZelandia += 1;
                break;
            case R.id.bt_p7d:
                eua += 1;
                break;
        }

        Intent pergunta8 = new Intent(getApplicationContext(), Pergunta8.class);

        pergunta8.putExtra("eua", eua);
        pergunta8.putExtra("inglaterra", inglaterra);
        pergunta8.putExtra("australia", australia);
        pergunta8.putExtra("novaZelandia", novaZelandia);

        startActivity(pergunta8);
    }
}
