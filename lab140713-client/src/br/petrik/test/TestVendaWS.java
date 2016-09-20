package br.petrik.test;

import br.petrik.VendaWSclient.VendaWS;
import br.petrik.VendaWSclient.VendaWSService;

public class TestVendaWS {

	public static void main(String[] args) {

		VendaWSService entregaWS = new VendaWSService();

		VendaWS vendaWSPort = entregaWS.getVendaWSPort();

		try {
			vendaWSPort.enviarVenda();
		} catch (br.petrik.VendaWSclient.IOException_Exception e) {
			e.printStackTrace();
		} catch (br.petrik.VendaWSclient.ServletException_Exception e) {
			e.printStackTrace();
		}

	}

}
