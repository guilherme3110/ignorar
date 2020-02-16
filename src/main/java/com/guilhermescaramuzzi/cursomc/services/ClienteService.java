package com.guilhermescaramuzzi.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilhermescaramuzzi.cursomc.domain.Cliente;
import com.guilhermescaramuzzi.cursomc.repositories.ClienteRepository;
import com.guilhermescaramuzzi.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;	
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto Não Encontrado! Id:  " + id +" , Tipo: " + Cliente.class.getName()));
	
	}

	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
