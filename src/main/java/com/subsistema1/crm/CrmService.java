package com.subsistema1.crm;

public class CrmService {

    private CrmService(){}


    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("CLIENTE SALDO NO SISTEMA DE CRM");
        System.out.println( "NOME - "+ nome+
                            "\nCEP - "+ cep+
                            "\nCIDADE - "+ cidade+
                            "\nESTADO - "+ estado);
    }
}
