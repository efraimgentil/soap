package br.com.efraimgentil.model.bean;

import java.util.List;

import javax.ejb.Remote;

import br.com.efraimgentil.model.Conta;

@Remote
public interface ContasFacadeRemote {
	
	public List<Conta> aPagar();

	public void novo(Conta conta);
	
	
}
