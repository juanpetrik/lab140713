package br.petrik.webservices;

import java.io.IOException;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.servlet.ServletException;

import br.petrik.EJB.ProcessEntrega;
import br.petrik.pojo.EntregaPojo;

@WebService
public class EntregaWS {

	@EJB
	ProcessEntrega processEntrega;

	@WebMethod(operationName = "enviarEntrega")
	@WebResult(name = "entregaResult")
	protected void enviarEntrega() throws ServletException, IOException {

		EntregaPojo entrega = new EntregaPojo(5, "Rua 5 de mar");

		processEntrega.processarEntrega(entrega);
	}
}
