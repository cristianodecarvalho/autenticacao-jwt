package com.cristiano.clientes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.cristiano.clientes.model.Cliente;
import com.cristiano.clientes.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> listar(){
		return clienteRepository.findAll();
	}

	public Cliente salvar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
}
