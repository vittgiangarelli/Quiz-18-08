package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void proxima(View v) {

        Intent pergunta1 = new Intent(getApplicationContext(), Pergunta1.class);

        startActivity(pergunta1);
    }


}
