package com.thiago.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.cursomc.domain.Categoria;
import com.thiago.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired // anotação do spring que auto estancia a classe
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);

		return obj.orElse(null);
	}

}
