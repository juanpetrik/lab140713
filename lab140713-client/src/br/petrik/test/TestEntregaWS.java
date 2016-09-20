package br.petrik.test;

import br.petrik.EntregaWSclient.EntregaWS;
import br.petrik.EntregaWSclient.EntregaWSService;
import br.petrik.EntregaWSclient.IOException_Exception;
import br.petrik.EntregaWSclient.ServletException_Exception;

public class TestEntregaWS {

	public static void main(String[] args) {

		EntregaWSService entregaWS = new EntregaWSService();

		EntregaWS entregaWSPort = entregaWS.getEntregaWSPort();

		try {

			entregaWSPort.enviarEntrega();

		} catch (IOException_Exception e) {
			e.printStackTrace();
		} catch (ServletException_Exception e) {
			e.printStackTrace();
		}

	}

}
