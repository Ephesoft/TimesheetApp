package com.ephesoft.timesheet.core.model.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

public abstract class AbstractJpaDao {

    @PersistenceContext
    protected EntityManager em;

    public <E> E findOne(Class<E> entityClass, Serializable primaryKey ){
        return em.find(entityClass, primaryKey);
    }

    @SuppressWarnings("unchecked")
	public <E> List<E> findAll(Class<E> entityClass){
        return em.createQuery( "from " + entityClass).getResultList();
    }

    public <E> void create(E entity) {
        em.persist(entity);
    }

    public <E> E update (E entity) {
        return em.merge(entity);
    }

    public <E> E getSingleResult(TypedQuery<E> query) {
        try {
            return query.getSingleResult();
        } catch (javax.persistence.NoResultException e) {
            return null;
        }
    }

    public void delete(Object entity) {
    	em.remove(entity);
    }
}
