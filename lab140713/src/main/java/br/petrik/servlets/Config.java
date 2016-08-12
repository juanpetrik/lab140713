package br.petrik.servlets;

import java.io.IOException;

import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@JMSDestinationDefinitions(
	    value = {
	        @JMSDestinationDefinition(
	            name = "java:/queue/QueuePedido",
	            interfaceName = "javax.jms.Queue",
	            destinationName = "QueuePedido"
	        ),
	        @JMSDestinationDefinition(
	            name = "java:/topic/TopicVenda",
	            interfaceName = "javax.jms.Topic",
	            destinationName = "TopicVenda"
	        )
	    })

@SuppressWarnings("serial")
@WebServlet(value = "/Config", asyncSupported = true)
public class Config extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}
}
