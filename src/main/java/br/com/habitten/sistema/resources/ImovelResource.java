package br.com.habitten.sistema.resources;

import br.com.habitten.sistema.model.vendas.Imovel;
import br.com.habitten.sistema.repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/vendas")
public class ImovelResource {

    @Autowired
    ImovelRepository imovelRepository;

    @RequestMapping("/listaimoveis")
    public List<Imovel> listaImoveis(){
        try {
            return imovelRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
