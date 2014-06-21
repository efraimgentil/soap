package br.com.efraimgentil.ws;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.efraimgentil.model.Conta;
import br.com.efraimgentil.model.bean.ContasFacadeRemote;

@WebService
@Stateless
public class ContasWs {

	@EJB
	private ContasFacadeRemote contasFacadeRemote;
	
	@WebMethod(operationName = "novo")
	public void novo(Conta conta){
		contasFacadeRemote.novo(conta);
	}
	
	@WebMethod(operationName = "aPagar")
	public List<Conta> aPagar(){
		return contasFacadeRemote.aPagar();
	}

}
