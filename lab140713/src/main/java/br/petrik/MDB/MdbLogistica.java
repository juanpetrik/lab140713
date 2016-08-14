package br.petrik.MDB;

import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import br.petrik.servlets.Venda;

@MessageDriven(name = "MdbLogistica", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/TopicVenda"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })
public class MdbLogistica implements MessageListener {

	// Finalizando!

	private final static Logger LOGGER = Logger.getLogger(MdbLogistica.class.toString());

	@Override
	public void onMessage(Message rcvMessage) {
		ObjectMessage msg = null;
		try {
			if (rcvMessage instanceof ObjectMessage) {
				msg = (ObjectMessage) rcvMessage;
				Venda venda = (Venda) msg.getObject();

				LOGGER.info("Mensagem : " + msg);
				LOGGER.info("Processando");

				Thread.sleep(30000);

				LOGGER.info("A entrega foi mandada embora kk..");
			} else {
				LOGGER.warning("Message of Wrong type: " + rcvMessage);
			}
		} catch (JMSException e) {
			throw new RuntimeException(e);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}