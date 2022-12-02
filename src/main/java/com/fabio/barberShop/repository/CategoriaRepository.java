package com.fabio.barberShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabio.barberShop.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Short>{

}
