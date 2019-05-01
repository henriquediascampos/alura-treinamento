package com.br.alura.alura.models.cadastro;

import java.io.Serializable;
import java.util.List;

import com.br.alura.alura.model.core.GenericDao;

import org.springframework.stereotype.Repository;


@Repository
public class CadastroDao extends GenericDao<Cadastro, Long> implements Serializable{
	
	public List<Cadastro> busca() {
		// Criteria criteria = session.createCriteria(Cadastro.class, "cada");
		return null;
	}
	
	public Cadastro buscaPorIdi(Long id) {
		// Criteria criteria = session.createCriteria(Cadastro.class, "cada");
		// criteria.add(Restrictions.idEq(id));
		return null;
	}
	
	public Cadastro buscarPorNome(String nome) {
		// Criteria criteria = session.createCriteria(Cadastro.class, "cada");
		// criteria.add(Restrictions.eq("cada.nome", nome));
		return null;
	}
}
