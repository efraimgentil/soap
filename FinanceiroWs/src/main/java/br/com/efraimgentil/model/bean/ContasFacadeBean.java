package br.com.efraimgentil.model.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.efraimgentil.model.Contas;

@Stateless
public class ContasFacadeBean implements ContasFacadeRemote {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Contas> aPagar() {
		return entityManager
					.createQuery("SELECT a FROM Contas a", Contas.class)
					.getResultList();
	}

}
