package com.br.alura.alura.model.core;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public abstract class GenericDao<T, PK>{

	private Class<T> classe;
    
	@PersistenceContext
    protected EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public void xablau() {
		this.classe = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	// @PostConstruct
	// @RequestScope
	// public EntityManager gEntityManager(){
	// 	return entityManager;
	// }
	
	public T persist(T entity) {
		entityManager.persist(entity);
		return entity;
	}	
}
