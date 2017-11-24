package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Pergunta3 extends AppCompatActivity {

    private int eua;
    private int inglaterra;
    private int australia;
    private int novaZelandia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_3);

        eua = getIntent().getIntExtra("eua", 0);
        inglaterra = getIntent().getIntExtra("inglaterra", 0);
        australia = getIntent().getIntExtra("australia", 0);
        novaZelandia = getIntent().getIntExtra("novaZelandia", 0);
    }

    public void proxima4(View v) {

        switch (v.getId()){
            case R.id.bt_p3a:
                eua += 1;
                break;
            case R.id.bt_p3b:
                australia += 1;
                break;
            case R.id.bt_p3c:
                inglaterra += 1;
                break;
            case R.id.bt_p3d:
                novaZelandia += 1;
                break;
        }

        Intent pergunta4 = new Intent(getApplicationContext(), Pergunta4.class);

        pergunta4.putExtra("eua", eua);
        pergunta4.putExtra("inglaterra", inglaterra);
        pergunta4.putExtra("australia", australia);
        pergunta4.putExtra("novaZelandia", novaZelandia);

        startActivity(pergunta4);
    }
}
