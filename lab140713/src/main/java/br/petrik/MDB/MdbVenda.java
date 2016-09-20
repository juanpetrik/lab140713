package br.petrik.MDB;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.petrik.persistencia.Log;
import br.petrik.pojo.VendaPojo;

@MessageDriven(name = "MdbVenda", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/TopicVenda"),
	    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
	    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })
public class MdbVenda implements MessageListener{

	private final static Logger LOGGER = Logger.getLogger(MdbLog.class.toString());

	@PersistenceContext(unitName = "lab140713-persistence-unit")
	private EntityManager em;

	@Override
	public void onMessage(Message rcvMessage) {
		ObjectMessage msg = null;
		try {
			if (rcvMessage instanceof ObjectMessage) {
				msg = (ObjectMessage) rcvMessage;
				VendaPojo venda = (VendaPojo) msg.getObject();

				//System.out.println("MdbVenda: venda finalizada!");

				Log log = new Log();

				SimpleDateFormat dfDate = new SimpleDateFormat("dd/MM/yyyy");
				SimpleDateFormat dfHour = new SimpleDateFormat("HH:mm:ss");

				log.setHora(dfHour.format(new Date()));
				log.setData(dfDate.format(new Date()));
				log.setMdb("Venda");
				log.setInformacao("MdbContabilidade: venda " + venda.getIdVenda() + " com valor total de R$ " + venda.getTotal() + " finalizada!");

				em.persist(log);
			} else {
				LOGGER.warning("Message of wrong type: " + rcvMessage.getClass().getName());
			}
		} catch (JMSException e) {
			throw new RuntimeException(e);
		}
	}
}