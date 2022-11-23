package com.grupo03.petshop.service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.grupo03.petshop.domain.Adocao;
import com.grupo03.petshop.repository.AdocaoRepository;
import com.grupo03.petshop.service.exceptions.DataIntegrityException;
import com.grupo03.petshop.service.exceptions.ObjetoNaoEncontradoException;

@Service
public class AdocaoService {
	
	@Autowired
	AdocaoRepository repo;
	
	public Adocao find(Integer id) {
		Optional<Adocao> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjetoNaoEncontradoException("Objeto não encontrado. ID: " + id + ", Tipo: " + Adocao.class.getName()));
	}
	
	public Adocao insert(Adocao obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Adocao update(Adocao obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		find(id);	
		try {
		repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Pet não encontrado.");
		}
	}

}
