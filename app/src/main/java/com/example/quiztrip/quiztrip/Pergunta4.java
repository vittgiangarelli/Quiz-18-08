package com.example.quiztrip.quiztrip;

import java.util.Arrays;
import java.util.List;

public class Pergunta4 extends AbstractPergunta {

    @Override
    protected Class getProxima() {
        return Pergunta5.class;
    }

    @Override
    protected Integer getIdLayout() {
        return R.layout.activity_pergunta_4;
    }

    @Override
    protected List<Integer> getIdsBotoes() {
        return Arrays.asList(R.id.bt_p4a, R.id.bt_p4b, R.id.bt_p4c, R.id.bt_p4d);
    }
}
