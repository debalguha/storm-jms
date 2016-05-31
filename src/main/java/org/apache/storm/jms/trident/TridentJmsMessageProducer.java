package org.apache.storm.jms.trident;

import java.io.Serializable;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.apache.storm.trident.tuple.TridentTuple;

public interface TridentJmsMessageProducer extends Serializable{

	/**
	 * Translate a <code>backtype.storm.tuple.TridentTuple</code> object
	 * to a <code>javax.jms.Message</code object.
	 *
	 * @param session
	 * @param input
	 * @return
	 * @throws javax.jms.JMSException
	 */
	public Message toMessage(Session session, TridentTuple input) throws JMSException;
}
