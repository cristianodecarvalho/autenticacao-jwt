package com.cristiano.clientes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristiano.clientes.model.Cliente;
import com.cristiano.clientes.service.ClienteService;


@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public List<Cliente> listar(){
		return clienteService.listar();
	}
	
	@PostMapping
	public Cliente listar(@RequestBody Cliente cliente){
		return clienteService.salvar(cliente);
	}
	
}
