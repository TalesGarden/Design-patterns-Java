package com.digitalInnovation.gof.singleton;

public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){}

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instancia;
    }
}
