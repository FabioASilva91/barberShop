package com.fabio.barberShop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.fabio.barberShop.domain.Categoria;
import com.fabio.barberShop.exception.RecursoNaoEncontradoException;
import com.fabio.barberShop.service.CategoriaService;

@RestController
@RequestMapping("categorias")
public class CategoriaController {
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping
	public List<Categoria> listar(){
		List<Categoria> categorias = categoriaService.listar();
		return categorias;		
	}
	
	@GetMapping("/{codigo}")
	public Categoria buscar(@PathVariable Short codigo) {
		try {
			Categoria categoria = categoriaService.buscarPorCodigo(codigo);
			return categoria;
			
		} catch (RecursoNaoEncontradoException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria não encontrada", e);
		}
	}
	
	@PostMapping
	public Categoria inserir(@RequestBody Categoria categoria) {
		Categoria categoriaSalva = categoriaService.inserir(categoria);
		return categoriaSalva;
	}
//	
//	@DeleteMapping("/{codigo}")
//	public Optional<Categoria> excluir(@PathVariable Short codigo) {
//		Optional<Categoria> categoria =  categoriaRepository.findById(codigo);
//		categoriaRepository.delete(categoria.get());
//		return categoria;
//	}
//	
//	@PutMapping
//	public Categoria editar(@RequestBody Categoria categoria) {
//		Categoria categoriaEditada = categoriaRepository.save(categoria);
//		return categoriaEditada;
//		
//	}
}
