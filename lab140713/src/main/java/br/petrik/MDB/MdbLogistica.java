package br.petrik.MDB;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
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
import br.petrik.pojo.EntregaPojo;

@MessageDriven(name = "MdbLogistica", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "queue/QueuePedido"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")})
public class MdbLogistica implements MessageListener {

	@PersistenceContext(unitName = "lab140713-persistence-unit")
	private EntityManager em;

	private final static Logger LOGGER = Logger.getLogger(MdbLogistica.class.toString());

	@Override
	public void onMessage(Message rcvMessage) {
		ObjectMessage msg = null;
		try {
			if (rcvMessage instanceof ObjectMessage) {
				msg = (ObjectMessage) rcvMessage;
				EntregaPojo entrega = (EntregaPojo) msg.getObject();

				//System.out.println("MdbAuditoria: venda finalizada!"); -> Mensagem antiga.. trocada pelo envio ao banco..


				// Aquela adormecida... kkk espero que ninguém esteja com pressa.. aushuahs
				Thread.sleep(30000);


				Log log = new Log();

				SimpleDateFormat dfDate = new SimpleDateFormat("dd/MM/yyyy");
				SimpleDateFormat dfHour = new SimpleDateFormat("HH:mm:ss");

				log.setHora(dfHour.format(new Date()));
				log.setData(dfDate.format(new Date()));
				log.setMdb("Auditoria");
				log.setInformacao("MdbLogistica: Entrega " + entrega.getIdEntrega() + " no endereço: " + entrega.getEndereco() + " foi despachada!");

				em.persist(log);


				@SuppressWarnings("unchecked")
				List<Log> resultList = em.createNativeQuery("select * from Log", Log.class).getResultList();

				for (Log log_ : resultList) {
					System.out.println(log_.getInformacao() + " - " + log_.getData() + " " + log_.getHora());
				}

			} else {
				LOGGER.warning("Message of Wrong type: " + rcvMessage);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}