package com.guilhermescaramuzzi.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilhermescaramuzzi.cursomc.domain.Categoria;
import com.guilhermescaramuzzi.cursomc.repositories.CategoriaRepository;
import com.guilhermescaramuzzi.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;	
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto Não Encontrado! Id:  " + id +" , Tipo: " + Categoria.class.getName()));
	
	}

	public Categoria buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
