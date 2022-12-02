package com.fabio.barberShop.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fabio.barberShop.domain.Produto;

@SpringBootTest
public class ProdutoRepositoryTests {
	@Autowired
	private  ProdutoRepository produtoRepository;
	
//	@Test
//	public void inserir() {
//		Produto p1 = new Produto(null, "pomada de cabelo", Short.valueOf("20"), BigDecimal.valueOf(27.50),
//				LocalDate.of(2025, 8, 20));
//	
//		Produto p2 = new Produto(null, "Balm", Short.valueOf("15"), BigDecimal.valueOf(37.50),
//				LocalDate.of(2024, 8, 20));
//		
//		
//		produtoRepository.save(p1);
//		produtoRepository.save(p2);
//	}
	
}
