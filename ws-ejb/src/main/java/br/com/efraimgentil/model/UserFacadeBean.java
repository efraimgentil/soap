package br.com.efraimgentil.model;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class UserFacadeBean
 */
@Stateless
public class UserFacadeBean implements UserFacadeRemote, UserFacadeLocal {

    public UserFacadeBean() {
        // TODO Auto-generated constructor stub
    }
    
    @PersistenceContext
    private EntityManager entityManager;
    
	@Override
	public User getUser(String email) {
		User user = entityManager
				.createQuery("SELECT u FROM User u WHERE u.email = :email", User.class)
				.setParameter("email", email).getSingleResult();
		return user;
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void addUser(User user) {
		entityManager.persist(user);
	}

}
