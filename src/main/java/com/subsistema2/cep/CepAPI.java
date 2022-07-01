package com.subsistema2.cep;


public class CepAPI {

    private static final CepAPI instance = new CepAPI();

    private CepAPI(){}

    public static CepAPI getInstance()
    {
        return instance;
    }

    public String recuperarCidade(String cep)
    {
        return "Itinga";
    }

    public String recuperarEstado(String cep)
    {
        return "MG";
    }
}