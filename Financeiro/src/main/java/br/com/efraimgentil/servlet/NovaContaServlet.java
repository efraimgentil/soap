package br.com.efraimgentil.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.efraimgentil.ws.Conta;
import br.com.efraimgentil.ws.ContasWs;
import br.com.efraimgentil.ws.ContasWsService;

@WebServlet("/nova-conta")
public class NovaContaServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("nova-conta.jsp").forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Conta conta = new Conta();
		
		conta.setCedente( req.getParameter("cedente") );
		conta.setDescricao( req.getParameter("descricao"));
		String valor = req.getParameter("valor");
		conta.setValor( Double.parseDouble(valor) );
		
		
		ContasWs contasWsPort = new ContasWsService().getContasWsPort();
		contasWsPort.novo(conta);
		req.getRequestDispatcher("nova-conta.jsp").forward(req, resp);
	}
	
}
