package com.digitalInnovation.gof.singleton;



// NÃO VERIFICA SE A INSTANCIA É NULA, JÁ É INICIADA NA DECLARAÇÃO DA CLASS;
public class SingletonEager {

    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance()
    {
        return instance;
    }
}
