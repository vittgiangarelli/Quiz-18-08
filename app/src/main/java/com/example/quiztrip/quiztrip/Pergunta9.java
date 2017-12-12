package com.example.quiztrip.quiztrip;

import java.util.Arrays;
import java.util.List;

public class Pergunta9 extends AbstractPergunta {

    @Override
    protected Class getProxima() {
        return Pergunta10.class;
    }

    @Override
    protected Integer getIdLayout() {
        return R.layout.activity_pergunta_9;
    }

    @Override
    protected List<Integer> getIdsBotoes() {
        return Arrays.asList(R.id.bt_p9a, R.id.bt_p9b, R.id.bt_p9c, R.id.bt_p9d);
    }
}
