package br.com.efraimgentil.model.bean;

import java.util.List;

import javax.ejb.Remote;

import br.com.efraimgentil.model.Contas;

@Remote
public interface ContasFacadeRemote {
	
	public List<Contas> aPagar();
	
	
}
