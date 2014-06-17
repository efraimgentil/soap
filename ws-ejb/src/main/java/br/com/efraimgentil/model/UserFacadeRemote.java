package br.com.efraimgentil.model;

import javax.ejb.Remote;

@Remote
public interface UserFacadeRemote {

	User getUser(String email);
	
	void addUser(User user);
	
}
