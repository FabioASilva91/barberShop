package com.fabio.barberShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabio.barberShop.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
