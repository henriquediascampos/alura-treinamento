package com.br.alura.alura.models.login;

import java.io.Serializable;
import java.util.List;

import com.br.alura.alura.model.core.GenericDao;

import org.springframework.stereotype.Repository;

@Repository
public class LoginDao extends GenericDao<Login, Long> implements Serializable{
	
	public List<Login> busca() {
		return null;
	}
	
	public Login buscaPorId(Long id) {
		return null;
	}
	
	public Login buscarPorNome(String nome) {
		return null;
	}
}
