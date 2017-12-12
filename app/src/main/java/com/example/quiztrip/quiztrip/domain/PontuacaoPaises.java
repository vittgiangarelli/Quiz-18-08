package com.example.quiztrip.quiztrip.domain;

import java.util.HashMap;
import java.util.IllegalFormatCodePointException;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Aluno on 11/12/2017.
 */

public class PontuacaoPaises {

    private static Map<Paises, Integer> contagem = new HashMap<>();

    static {
        for (Paises pais : Paises.values()){
            contagem.put(pais, 0);
        }
    }

    public static void votar(String pais){
        contagem.put(Paises.valueOf(pais), contagem.get(Paises.valueOf(pais))+1);
    }

    public static Paises getMaisVotado(){

        Paises maior = Paises.values()[0];
        int maiorValor = contagem.get(maior);

        for (Paises atual : Paises.values()){
            Integer votos = contagem.get(atual);
            if (votos > maiorValor){
                maiorValor = votos;
                maior = atual;
            }
        }

        return maior;
    }

    private static void get(Paises pais){
        contagem.put(pais, contagem.get(pais)+1);
    }

    public static void getEua(){
        get(Paises.EUA);
    }
    public static void getInglaterra(){
        get(Paises.INGLATERRA);
    }
    public static void getAustralia(){
        get(Paises.AUSTRALIA);
    }
    public static void getNovaZelandia(){
        get(Paises.NOVAZELANDIA);
    }
}
