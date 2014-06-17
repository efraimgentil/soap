package br.com.efraimgentil.ws.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.efraimgentil.ws.FindUser;
import br.com.efraimgentil.ws.UserWS;
import br.com.efraimgentil.ws.UserWSImpl;
import br.com.efraimgentil.ws.UserWSService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	private static final long serialVersionUID = -5435855433374996596L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		
		
		UserWSService service = new UserWSService();
		UserWS ws = service.getUserWSPort();
		
		String user = ws.findUser(email);
		req.setAttribute("user", user);
		req.getRequestDispatcher("/success.jsp").forward(req, resp);
		
		//Set locator to find the UserWS
//		UserWSServiceStub.FindUserE findUserE = new UserWSServiceStub.FindUserE();
//		UserWSServiceStub.FindUser findUser = new UserWSServiceStub.FindUser();
////		UserWSServiceLocator locator = new UserWSServiceLocator();
////		try {
//			findUser.setEmail(email);
//			findUserE.setFindUser(findUser);
//			FindUserResponseE findUserResponseE = new UserWSServiceStub().findUser(findUserE);
//			FindUserResponse findUserResponse = findUserResponseE.getFindUserResponse();
//			
//			
//			
//			//Create the UserWS , a bridge object that will comunicate with the webservice
////			UserWS ws = locator.getUserWSPort();
////			String user = ws.findUser(email);
//			String user = findUserResponse.get_return();
//			req.setAttribute("user", user);
//			req.getRequestDispatcher("/success.jsp").forward(req, resp);
//		} catch (ServiceException e) {
//			e.printStackTrace();
//		}
		
		
	}
	
}
