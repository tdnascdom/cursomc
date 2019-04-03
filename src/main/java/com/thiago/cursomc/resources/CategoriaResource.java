package com.thiago.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thiago.cursomc.domain.Categoria;
import com.thiago.cursomc.services.CategoriaService;

@RestController
@RequestMapping("/categorias") // Mapeando controller
public class CategoriaResource {

	/*Exemplo1
	@RequestMapping(method = RequestMethod.GET) // verbo GET do HTTP para obter informações
	public List<Categoria> listar() {

		Categoria cat1 = new Categoria(1, "nformatica");
		Categoria cat2 = new Categoria(2, "escritorio");

		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);

		return lista;
	}*/
	
	@Autowired
	private CategoriaService service;
	
	//Atualização 2
	@RequestMapping(value= "/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){//@PathVariable serve para pegar o valor do id através do request  (value= "/{id}", ResponseEntity<?> objeto complexo que contem codigos http de resposta
		
		Categoria obj = service.buscar(id);
		
		return ResponseEntity.ok().body(obj);
		
	}

}
