package com.example.quiztrip.quiztrip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static android.R.attr.visible;

public class Destino extends AppCompatActivity {

    private int eua;
    private int inglaterra;
    private int australia;
    private int novaZelandia;

    private ImageView imgEua;
    private ImageView imgInglaterra;
    private ImageView imgAustralia;
    private ImageView imgNovaZelandia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destino);

        eua = getIntent().getIntExtra("eua", 0);
        inglaterra = getIntent().getIntExtra("inglaterra", 0);
        australia = getIntent().getIntExtra("australia", 0);
        novaZelandia = getIntent().getIntExtra("novaZelandia", 0);

        imgEua = (ImageView)findViewById(R.id.imagem_eua);
        imgInglaterra = (ImageView)findViewById(R.id.imagem_inglaterra);
        imgAustralia = (ImageView)findViewById(R.id.imagem_australia);
        imgNovaZelandia = (ImageView)findViewById(R.id.imagem_nova_zelandia);

        if(eua > inglaterra && eua > australia && eua > novaZelandia)
            //faz isso
            imgEua.setVisibility(View.VISIBLE);

        if(inglaterra > eua && inglaterra > australia && inglaterra > novaZelandia)
        //faz isso
            imgInglaterra.setVisibility(View.VISIBLE);

        if(australia > inglaterra && australia > eua && australia > novaZelandia)
        //faz isso
            imgAustralia.setVisibility(View.VISIBLE);

        if(novaZelandia > inglaterra && novaZelandia > australia && novaZelandia > eua)
        //faz isso
            imgNovaZelandia.setVisibility(View.VISIBLE);
    }
}
