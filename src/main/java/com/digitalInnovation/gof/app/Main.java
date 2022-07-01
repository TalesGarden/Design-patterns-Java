package com.digitalInnovation.gof.app;

import com.digitalInnovation.gof.facade.Facade;
import com.digitalInnovation.gof.singleton.SingletonEager;
import com.digitalInnovation.gof.singleton.SingletonLazy;
import com.digitalInnovation.gof.singleton.SingletonLazyHolder;
import com.digitalInnovation.gof.strategy.ComportamentoAgressivo;
import com.digitalInnovation.gof.strategy.ComportamentoDefensivo;
import com.digitalInnovation.gof.strategy.ComportamentoNormal;
import com.digitalInnovation.gof.strategy.Robo;

public class Main {
    public static void main(String[] args) {

      //----------------TESTE SOBRE O DESIGN PATTERN SINGLETON---------------------------
        System.out.println("//----------------TESTE SOBRE O DESIGN PATTERN SINGLETON---------------------------\n");
      SingletonLazy  singleton = SingletonLazy.getInstance();
      SingletonLazy  singletonCopy = SingletonLazy.getInstance();

        System.out.println("----------------------");
        System.out.println(singleton + " São iguais  " + singletonCopy);

      SingletonEager singletonEager = SingletonEager.getInstance();
      SingletonEager singletonEagerCopy = SingletonEager.getInstance();

        System.out.println("----------------------");
        System.out.println(singletonEager + " São iguais " + singletonEagerCopy);


      SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();
      SingletonLazyHolder singletonLazyHolderCopy = SingletonLazyHolder.getInstance();

        System.out.println("----------------------");
        System.out.println(singletonLazyHolder + " São iguais  " + singletonLazyHolderCopy);


        //----------------TESTE SOBRE O DESIGN PATTERN STRATEGY---------------------------
        System.out.println("//----------------TESTE SOBRE O DESIGN PATTERN STRATEGY---------------------------\n");

      Robo robo = new Robo();

      robo.setComportamento(new ComportamentoDefensivo());
      robo.mover();

      robo.setComportamento(new ComportamentoNormal());
      robo.mover();

      robo.setComportamento(new ComportamentoAgressivo());
      robo.mover();


        //----------------TESTE SOBRE O DESIGN PATTERN FACADE---------------------------
        System.out.println("//----------------TESTE SOBRE O DESIGN PATTERN FACADE---------------------------\n");

        Facade facade = new Facade();
        facade.migrarCliente("Tales", "1542154");

    }
}
