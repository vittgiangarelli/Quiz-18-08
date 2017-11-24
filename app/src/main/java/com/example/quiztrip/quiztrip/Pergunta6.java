package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pergunta6 extends AppCompatActivity {

    private int eua;
    private int inglaterra;
    private int australia;
    private int novaZelandia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_6);

        eua = getIntent().getIntExtra("eua", 0);
        inglaterra = getIntent().getIntExtra("inglaterra", 0);
        australia = getIntent().getIntExtra("australia", 0);
        novaZelandia = getIntent().getIntExtra("novaZelandia", 0);
    }

    public void proxima7(View v) {

        switch (v.getId()){
            case R.id.bt_p6a:
                australia += 1;
                break;
            case R.id.bt_p6b:
                inglaterra += 1;
                break;
            case R.id.bt_p6c:
                eua += 1;
                break;
            case R.id.bt_p6d:
                novaZelandia += 1;
                break;
        }

        Intent pergunta7 = new Intent(getApplicationContext(), Pergunta7.class);

        pergunta7.putExtra("eua", eua);
        pergunta7.putExtra("inglaterra", inglaterra);
        pergunta7.putExtra("australia", australia);
        pergunta7.putExtra("novaZelandia", novaZelandia);

        startActivity(pergunta7);
    }
}
