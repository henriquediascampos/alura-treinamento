package com.br.alura.alura.model.categoria;

import java.util.List;

import com.br.alura.alura.model.core.GenericDao;

import org.springframework.stereotype.Repository;

@Repository
public class CategoriaDAO extends GenericDao<Categoria, Long>{

    // @PersistenceContext
    // private EntityManager entityManager;

    @SuppressWarnings("unchecked")
	public List<Categoria> listar() {
        String hql = "FROM Categoria as cate";
		return entityManager.createQuery(hql).getResultList();
    }

    public Categoria save(Categoria cate) {    	    	
    	return persist(cate);
    }

    public Categoria findById(Long pk) {
        return entityManager.find(Categoria.class, pk);
    }
}