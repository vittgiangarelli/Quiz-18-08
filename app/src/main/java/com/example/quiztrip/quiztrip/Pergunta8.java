package com.example.quiztrip.quiztrip;

import java.util.Arrays;
import java.util.List;

public class Pergunta8 extends AbstractPergunta {

    @Override
    protected Class getProxima() {
        return Pergunta9.class;
    }

    @Override
    protected Integer getIdLayout() {
        return R.layout.activity_pergunta_8;
    }

    @Override
    protected List<Integer> getIdsBotoes() {
        return Arrays.asList(R.id.bt_p8a, R.id.bt_p8b, R.id.bt_p8c, R.id.bt_p8d);
    }
}
