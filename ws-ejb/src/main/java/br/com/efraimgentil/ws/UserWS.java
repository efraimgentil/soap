package br.com.efraimgentil.ws;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.efraimgentil.model.User;
import br.com.efraimgentil.model.UserFacadeRemote;


@WebService
@Stateless
public class UserWS {
	
	@EJB
	private UserFacadeRemote userFacadeRemote;
	
	@WebMethod(operationName = "findUser")
	public String findUser(@WebParam(name="email") String email){
		try{
			User user = userFacadeRemote.getUser(email);
			return user.getUser();
		}catch(Exception e){
			return null;
		}
	}
	
	@WebMethod(operationName = "addUser" )
	public void addUser(@WebParam(name = "user") User user){
		userFacadeRemote.addUser(user);
	}
	
}
