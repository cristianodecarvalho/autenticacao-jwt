package com.cristiano.clientes.config.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cristiano.clientes.model.Cliente;
import com.cristiano.clientes.repository.ClienteRepository;

@Service
public class AutenticacaoService  implements UserDetailsService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Cliente> cliente = clienteRepository.findByEmail(username); 
		if(cliente.isPresent()) {
			return cliente.get();
		}
		return null;
	}

}
