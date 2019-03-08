package br.com.habitten.sistema.resources;

import br.com.habitten.sistema.model.vendas.Cliente;
import br.com.habitten.sistema.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/vendas")
@CrossOrigin(origins = "*")
public class ClienteResource {

    private final
    ClienteRepository clienteRepository;

    @Autowired
    public ClienteResource(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping("/listaclientes")
    public List<Cliente> listaClientes() {
        return clienteRepository.findAll();
    }

    @GetMapping("/cliente/{id}")
    public Cliente buscaCliente(@PathVariable(value = "id") long id) {
        return clienteRepository.findById(id);
    }

    @PostMapping("/cliente")
    public Cliente cadastraCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @DeleteMapping("/cliente")
    public void deletaProduto(@RequestBody Cliente produto) {
        clienteRepository.delete(produto);
    }

    @PutMapping("/cliente")
    public Cliente editaProduto(@RequestBody Cliente produto) {
        return clienteRepository.save(produto);

    }


}
