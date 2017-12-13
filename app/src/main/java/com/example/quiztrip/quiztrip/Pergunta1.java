package com.example.quiztrip.quiztrip;

import java.util.Arrays;
import java.util.List;

public class Pergunta1 extends AbstractPergunta {

    @Override
    protected Class getProxima() {
        return Pergunta2.class;
    }

    @Override
    protected Integer getIdLayout() {
        return R.layout.activity_pergunta_1;
    }

    @Override
    protected List<Integer> getIdsBotoes() {
        return Arrays.asList(R.id.bt_p1a, R.id.bt_p1b, R.id.bt_p1c, R.id.bt_p1d);
    }
}
