package com.thiago.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thiago.cursomc.domain.Categoria;
import com.thiago.cursomc.domain.Produto;
import com.thiago.cursomc.repositories.CategoriaRepository;
import com.thiago.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner { //CommandLineRunner permite executar alguma ação quando a aplicação iniciar atraves de seu metodo

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "informatica");
		Categoria cat2 = new Categoria(null, "escritorio");
		
		Produto p1 = new Produto(null, "computador" , 2000.00);
		Produto p2 = new Produto(null, "impressora" , 600.00);
		Produto p3 = new Produto(null, "mouse" , 80.00);
		
		cat1.getProduto().addAll(Arrays.asList(p1, p2,p3));
		cat2.getProduto().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2, p3));
	}
   
}
