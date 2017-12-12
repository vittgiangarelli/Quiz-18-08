package com.example.quiztrip.quiztrip;

import java.util.Arrays;
import java.util.List;

public class Pergunta3 extends AbstractPergunta {

    @Override
    protected Class getProxima() {
        return Pergunta4.class;
    }

    @Override
    protected Integer getIdLayout() {
        return R.layout.activity_pergunta_3;
    }

    @Override
    protected List<Integer> getIdsBotoes() {
        return Arrays.asList(R.id.bt_p3a, R.id.bt_p3b, R.id.bt_p3c, R.id.bt_p3d);
    }
}
