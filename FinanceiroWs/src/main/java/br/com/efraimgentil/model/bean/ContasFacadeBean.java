package br.com.efraimgentil.model.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.efraimgentil.model.Conta;

@Stateless
public class ContasFacadeBean implements ContasFacadeRemote {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<Conta> aPagar() {
		return entityManager
					.createQuery("SELECT a FROM Conta a", Conta.class)
					.getResultList();
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void novo(Conta conta) {
		entityManager.persist(conta);
	}

}
