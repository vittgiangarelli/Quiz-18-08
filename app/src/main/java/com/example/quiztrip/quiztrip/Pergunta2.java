package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pergunta2 extends AppCompatActivity {

    private int eua;
    private int inglaterra;
    private int australia;
    private int novaZelandia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_2);

        eua = getIntent().getIntExtra("eua", 0);
        inglaterra = getIntent().getIntExtra("inglaterra", 0);
        australia = getIntent().getIntExtra("australia", 0);
        novaZelandia = getIntent().getIntExtra("novaZelandia", 0);
    }

    public void proxima3(View v) {

        switch (v.getId()){
            case R.id.bt_p2a:
                inglaterra += 1;
                break;
            case R.id.bt_p2b:
                eua += 1;
                break;
            case R.id.bt_p2c:
                novaZelandia += 1;
                break;
            case R.id.bt_p2d:
                australia += 1;
                break;
        }


        Intent pergunta3 = new Intent(getApplicationContext(), Pergunta3.class);

        pergunta3.putExtra("eua", eua);
        pergunta3.putExtra("inglaterra", inglaterra);
        pergunta3.putExtra("australia", australia);
        pergunta3.putExtra("novaZelandia", novaZelandia);

        startActivity(pergunta3);
    }
}
