package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pergunta4 extends AppCompatActivity {

    private int eua;
    private int inglaterra;
    private int australia;
    private int novaZelandia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_4);

        eua = getIntent().getIntExtra("eua", 0);
        inglaterra = getIntent().getIntExtra("inglaterra", 0);
        australia = getIntent().getIntExtra("australia", 0);
        novaZelandia = getIntent().getIntExtra("novaZelandia", 0);
    }

    public void proxima5(View v) {

        switch (v.getId()){
            case R.id.bt_p4a:
                novaZelandia += 1;
                break;
            case R.id.bt_p4b:
                eua += 1;
                break;
            case R.id.bt_p4c:
                inglaterra += 1;
                break;
            case R.id.bt_p4d:
                australia += 1;
                break;
        }

        Intent pergunta5 = new Intent(getApplicationContext(), Pergunta5.class);

        pergunta5.putExtra("eua", eua);
        pergunta5.putExtra("inglaterra", inglaterra);
        pergunta5.putExtra("australia", australia);
        pergunta5.putExtra("novaZelandia", novaZelandia);

        startActivity(pergunta5);
    }
}
