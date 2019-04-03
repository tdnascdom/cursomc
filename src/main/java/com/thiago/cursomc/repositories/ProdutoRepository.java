package com.thiago.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.cursomc.domain.Produto;

@Repository // Implementação do objeto capaz de fazer acesso a dados "CRUD"
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
