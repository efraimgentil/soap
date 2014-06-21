package br.com.efraimgentil.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.efraimgentil.ws.Conta;
import br.com.efraimgentil.ws.ContasWs;
import br.com.efraimgentil.ws.ContasWsService;

@WebServlet("/a-pagar")
public class APagarSevlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ContasWs contasWs = new ContasWsService().getContasWsPort();
		req.setAttribute("contas", contasWs.aPagar());
		req.getRequestDispatcher("/a-pagar.jsp").forward(req, resp);
	}
	
}
