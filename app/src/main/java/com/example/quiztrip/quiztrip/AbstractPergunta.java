package com.example.quiztrip.quiztrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.quiztrip.quiztrip.domain.PontuacaoPaises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class AbstractPergunta extends AppCompatActivity {

    protected boolean respondida;

    protected abstract List<Integer> getIdsBotoes();

    protected abstract Class getProxima();

    protected abstract Integer getIdLayout();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(this.getIdLayout());
    }

    public void proxima(View v) {

        this.respondida = true;

        PontuacaoPaises.votar(v.getTag().toString());

        this.bloquearBotoes(v.getId());

        this.exibirProxima();
    }

    @Override
    public void onBackPressed() {

        if (!this.respondida) {
            super.onBackPressed();
        }
        else
        {
            this.exibirProxima();
        }
    }


    protected void exibirProxima(){

        Intent pergunta2 = new Intent(getApplicationContext(), this.getProxima());

        startActivity(pergunta2);
    }

    protected void bloquearBotoes(Integer idBotaoResposta){

        for (Button botao : this.getBotoes()){
            if (botao.getId() == idBotaoResposta){
                botao.setBackground(getDrawable(R.drawable.botao_clicado));
            }
            botao.setEnabled(false);
        }
    }


    protected List<Button> getBotoes(){

        List<Button> lista = new ArrayList<>();

        for (Integer id : this.getIdsBotoes()){
            lista.add((Button)findViewById(id));
        }
        return lista;
    }
}
