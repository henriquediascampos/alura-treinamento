package com.br.alura.alura.model.cliente;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(method=RequestMethod.POST, value="save")
	public Cliente save(Cliente cliente) {
		return clienteService.save(cliente);
	}

	@RequestMapping(method=RequestMethod.GET, value="findById")
	public Optional<Cliente> findById(Long id){
		return clienteService.findId(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="findAll")
	public List<Cliente> listar(){
		return clienteService.findAll();
	}
}
