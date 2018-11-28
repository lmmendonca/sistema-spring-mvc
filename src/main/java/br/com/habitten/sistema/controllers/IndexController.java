package br.com.habitten.sistema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


    @RequestMapping("/")
    String index(){
        return "login";
    }

    @RequestMapping("/login")
    String login(){
        return "login";
    }

    @RequestMapping("/relatorioVendas")
    String relatorioVendas(){
        return "vendas/relatorioVendas";
    }

}
