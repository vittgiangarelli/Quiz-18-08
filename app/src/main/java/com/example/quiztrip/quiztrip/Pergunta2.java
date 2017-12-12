package com.example.quiztrip.quiztrip;

import java.util.Arrays;
import java.util.List;

public class Pergunta2 extends AbstractPergunta {

    @Override
    protected Class getProxima() {
        return Pergunta3.class;
    }

    @Override
    protected Integer getIdLayout() {
        return R.layout.activity_pergunta_2;
    }

    @Override
    protected List<Integer> getIdsBotoes() {
        return Arrays.asList(R.id.bt_p2a, R.id.bt_p2b, R.id.bt_p2c, R.id.bt_p2d);
    }
}
