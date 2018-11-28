package br.com.habitten.sistema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/login")
    String index(){
        return "login";
    }

    @RequestMapping("/relatorioVendas")
    String relatorioVendas(){
        return "vendas/relatorioVendas";
    }

}
