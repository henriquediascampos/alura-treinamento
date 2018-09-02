package com.br.alura.alura.model.categoria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaDAO categoriaDAO;
	
	@Override
	public Categoria save(Categoria cate) {
		return categoriaDAO.save(cate);
	}

	@Override
	public List<Categoria> findAll() {
		return categoriaDAO.listar();
	}

	@Override
	public Categoria findById(Long pk) {
		return categoriaDAO.findById(pk);
	}

}