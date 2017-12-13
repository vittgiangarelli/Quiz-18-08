package com.example.quiztrip.quiztrip.domain;

/**
 * Created by Aluno on 12/12/2017.
 */

public class PontuacaoPaisesSingleton {

    private static PontuacaoPaises pontuacaoPaises;

    public static PontuacaoPaises getInstance(){
        if (pontuacaoPaises == null){
            pontuacaoPaises = new PontuacaoPaises();
        }

        return pontuacaoPaises;
    }
}
