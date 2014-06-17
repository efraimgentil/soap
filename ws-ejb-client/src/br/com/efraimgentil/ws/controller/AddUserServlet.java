package br.com.efraimgentil.ws.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.efraimgentil.ws.AddUser;
import br.com.efraimgentil.ws.User;
import br.com.efraimgentil.ws.UserWS;
import br.com.efraimgentil.ws.UserWSImpl;
import br.com.efraimgentil.ws.UserWSService;
import br.com.efraimgentil.ws.UserWS_UserWSPort_Client;

@WebServlet("/add-user")
public class AddUserServlet extends HttpServlet {

	private static final long serialVersionUID = -2429230531153005505L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/add-user.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String email = req.getParameter("email");
		String userName = req.getParameter("user");
		String password = req.getParameter("password");
		
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		user.setUser(userName);
		
//		AddUser addUser = new AddUser();
//		addUser.setUser(user);
		UserWSService service = new UserWSService();
		UserWS ws = service.getUserWSPort();
		ws.addUser(user);
		
	}

}
