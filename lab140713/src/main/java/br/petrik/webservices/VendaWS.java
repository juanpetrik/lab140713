package br.petrik.webservices;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.servlet.ServletException;

import br.petrik.EJB.ProcessVenda;
import br.petrik.pojo.VendaPojo;

@WebService
public class VendaWS {

	@EJB
	ProcessVenda processVenda;

	@WebMethod(operationName = "enviarVenda")
	@WebResult(name = "vendaResult")
	public void enviarVendaService() throws ServletException, IOException {

		List<String> itensVenda = new ArrayList<>();
		itensVenda.add("Arroz");
		itensVenda.add("Batata");
		itensVenda.add("Macarrão");

		VendaPojo venda = new VendaPojo(1, itensVenda, new BigDecimal(100.00));

		processVenda.processarVenda(venda);
	}
}
