package com.example.quiztrip.quiztrip;

import java.util.Arrays;
import java.util.List;

public class Pergunta7 extends AbstractPergunta {

    @Override
    protected Class getProxima() {
        return Pergunta8.class;
    }

    @Override
    protected Integer getIdLayout() {
        return R.layout.activity_pergunta_7;
    }

    @Override
    protected List<Integer> getIdsBotoes() {
        return Arrays.asList(R.id.bt_p7a, R.id.bt_p7b, R.id.bt_p7c, R.id.bt_p7d);
    }
}
