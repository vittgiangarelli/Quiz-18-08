package com.example.quiztrip.quiztrip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.quiztrip.quiztrip.domain.Paises;
import com.example.quiztrip.quiztrip.domain.PontuacaoPaises;
import com.example.quiztrip.quiztrip.domain.PontuacaoPaisesSingleton;

import java.util.HashMap;
import java.util.Map;

public class Destino extends AppCompatActivity {

    private ImageView imgPaisMaisVotado;
    private PontuacaoPaises pontuacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.pontuacao = PontuacaoPaisesSingleton.getInstance();
        setContentView(R.layout.activity_destino);


        Map<Paises, Integer> imagens = new HashMap<>();
        imagens.put(Paises.EUA, R.id.imagem_eua);
        imagens.put(Paises.INGLATERRA, R.id.imagem_inglaterra);
        imagens.put(Paises.AUSTRALIA, R.id.imagem_australia);
        imagens.put(Paises.NOVAZELANDIA, R.id.imagem_nova_zelandia);

        Paises maisVotado = this.pontuacao.getMaisVotado();

        imgPaisMaisVotado = (ImageView)findViewById(imagens.get(maisVotado));

        imgPaisMaisVotado.setVisibility(View.VISIBLE);
    }
}
