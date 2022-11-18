package com.grupo03.petshop.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.grupo03.petshop.domain.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
