package com.example.quiztrip.quiztrip;

import java.util.Arrays;
import java.util.List;

public class Pergunta6 extends AbstractPergunta {

    @Override
    protected Class getProxima() {
        return Pergunta7.class;
    }

    @Override
    protected Integer getIdLayout() {
        return R.layout.activity_pergunta_6;
    }

    @Override
    protected List<Integer> getIdsBotoes() {
        return Arrays.asList(R.id.bt_p6a, R.id.bt_p6b, R.id.bt_p6c, R.id.bt_p6d);
    }
}
