package com.fabio.barberShop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabio.barberShop.domain.Categoria;
import com.fabio.barberShop.exception.RecursoNaoEncontradoException;
import com.fabio.barberShop.repository.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscarPorCodigo(Short codigo) {
		Optional<Categoria> resultado = categoriaRepository.findById(codigo);
		
		if (resultado.isEmpty()) {
			throw new RecursoNaoEncontradoException();
		}
 		Categoria categoria = resultado.get();
		return categoria;
	}
	
	public List<Categoria> listar(){
		List<Categoria> resultados = categoriaRepository.findAll();
		return resultados;
	}
	
	public Categoria inserir( Categoria categoria) {
		Categoria categoriaSalva = categoriaRepository.save(categoria);
		return categoriaSalva;
	}

}
