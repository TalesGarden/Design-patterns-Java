package com.digitalInnovation.gof.facade;


// Cria uma interface simples para o usuário utilizar

import com.subsistema1.crm.CrmService;
import com.subsistema2.cep.CepAPI;

public class Facade {
    public void migrarCliente(String nome, String cep)
    {
       String cidade =  CepAPI.getInstance().recuperarCidade(cep);
       String estado = CepAPI.getInstance().recuperarEstado(cep);
       CrmService.gravarCliente(nome, cep, cidade, estado );
    }
}
