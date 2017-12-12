package com.example.quiztrip.quiztrip;

import java.util.Arrays;
import java.util.List;

public class Pergunta10 extends AbstractPergunta {

    @Override
    protected Class getProxima() {
        return Destino.class;
    }

    @Override
    protected Integer getIdLayout() {
        return R.layout.activity_pergunta_10;
    }

    @Override
    protected List<Integer> getIdsBotoes() {
        return Arrays.asList(R.id.bt_p10a, R.id.bt_p10b, R.id.bt_p10c, R.id.bt_p10d);
    }
}
