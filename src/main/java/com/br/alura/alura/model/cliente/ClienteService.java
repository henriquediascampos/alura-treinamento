package com.br.alura.alura.model.cliente;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente save(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Optional<Cliente> findId(Long id) {
		return clienteRepository.findById(id);
	}
	
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}
}
