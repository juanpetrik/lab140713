package br.petrik.EJB;

import java.util.Queue;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;

import br.petrik.pojo.EntregaPojo;

@Stateless
public class ProcessEntrega {

	@Inject
	private JMSContext context;

	@Resource(lookup = "java:/queue/QueuePedido")
	private Queue queuePedido;

	public void processarEntrega(EntregaPojo entrega) {

		System.out.println("Entrega recebida pelo EJB Process Entrega");

		final Destination destination = (Destination) queuePedido;

		ObjectMessage message = context.createObjectMessage();

		try {

			message.setObject(entrega);
			context.createProducer().send(destination, message);

			System.out.println("A entrega foi repassada.");
		} catch (JMSException e) {
			e.printStackTrace();
		}

	}

}