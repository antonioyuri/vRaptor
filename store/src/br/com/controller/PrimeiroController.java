package br.com.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource 
public class PrimeiroController {

    @Inject private Result result;

    @Get("/home")
    public void home() {
        result.include("mensagem", "Esse Texto aqui está vindo da classe Java");
    }
}

