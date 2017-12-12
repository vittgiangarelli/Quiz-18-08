package com.example.quiztrip.quiztrip;

import java.util.Arrays;
import java.util.List;

public class Pergunta5 extends AbstractPergunta {

    @Override
    protected Class getProxima() {
        return Pergunta6.class;
    }

    @Override
    protected Integer getIdLayout() {
        return R.layout.activity_pergunta_5;
    }

    @Override
    protected List<Integer> getIdsBotoes() {
        return Arrays.asList(R.id.bt_p5a, R.id.bt_p5b, R.id.bt_p5c, R.id.bt_p5d);
    }
}
