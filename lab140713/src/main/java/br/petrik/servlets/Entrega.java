package br.petrik.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.petrik.EJB.ProcessEntrega;
import br.petrik.pojo.EntregaPojo;

@WebServlet(value = "/entrega")
public class Entrega extends HttpServlet {

	@EJB
	ProcessEntrega processEntrega; // Faz a injeção na variável.

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Processo de entrega foi iniciado...");

		// Instância um objeto do tipo Entrega para repassar ao EJB ProcessEntrega.
		EntregaPojo entrega = new EntregaPojo(1, "Rua 3 de março");

		System.out.println("Gerando remessa de entrega...");

		// Envia o objeto
		processEntrega.processarEntrega(entrega);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.write("Processo de entrega foi despachado.");
	}
}
