package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.quiztrip.quiztrip.domain.PontuacaoPaises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pergunta1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_1);
    }

    public void proxima2(View v) {

        PontuacaoPaises.votar(v.getTag().toString());

        Intent pergunta2 = new Intent(getApplicationContext(), Pergunta2.class);

        startActivity(pergunta2);
    }

    private void bloquearBotoes(Integer idBotaoResposta){

        for (Button botao : this.getBotoes()){
            if (botao.getId() == idBotaoResposta){
                botao.setBackground(getDrawable(R.drawable.botao_clicado));
            }
            botao.setEnabled(false);
        }
    }

    private List<Integer> getIdsBotoes(){

        return Arrays.asList(R.id.bt_p1a, R.id.bt_p1b, R.id.bt_p1c, R.id.bt_p1d);
    }

    private List<Button> getBotoes(){

        List<Button> lista = new ArrayList<>();

        for (Integer id : this.getIdsBotoes()){
            lista.add((Button)findViewById(id));
        }
        return lista;
    }
}
