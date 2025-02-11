package com.example.produto.repository;

import com.example.produto.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}

