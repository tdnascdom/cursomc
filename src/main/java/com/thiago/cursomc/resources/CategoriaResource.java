package com.thiago.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias") //
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)//verbo GET do HTTP para obter informações
	public String listar() {
		return "REST esta funcionando";
	}

}
